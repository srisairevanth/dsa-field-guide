import java.util.*;

class Trie {
    private static class Node {
        Map<Character, Node> next = new TreeMap<>();
        boolean end = false;
    }

    private final Node root = new Node();

    private Node walk(String text) {
        Node node = root;
        for (char ch : text.toCharArray()) {
            node = node.next.get(ch);
            if (node == null) return null;
        }
        return node;
    }

    public void insert(String word) {
        Node node = root;
        for (char ch : word.toCharArray()) node = node.next.computeIfAbsent(ch, k -> new Node());
        node.end = true;
    }

    public boolean search(String word) {
        Node node = walk(word);
        return node != null && node.end;
    }

    public boolean startsWith(String prefix) {
        return walk(prefix) != null;
    }
}
