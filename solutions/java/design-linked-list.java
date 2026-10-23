import java.util.*;

class MyLinkedList {
    private final List<Integer> items = new ArrayList<>();

    public int get(int index) {
        if (index >= 0 && index < items.size()) return items.get(index);
        return -1;
    }

    public void addAtHead(int val) {
        items.add(0, val);
    }

    public void addAtTail(int val) {
        items.add(val);
    }

    public void addAtIndex(int index, int val) {
        if (index >= 0 && index <= items.size()) items.add(index, val);
    }

    public void deleteAtIndex(int index) {
        if (index >= 0 && index < items.size()) items.remove(index);
    }
}
