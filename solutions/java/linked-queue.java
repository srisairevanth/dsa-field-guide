import java.util.*;

class LinkedQueue {
    private final Deque<Integer> items = new ArrayDeque<>();

    public void push(int value) {
        items.addLast(value);
    }

    public int peek() {
        return items.isEmpty() ? -1 : items.peekFirst();
    }

    public int pop() {
        return items.isEmpty() ? -1 : items.pollFirst();
    }

    public boolean empty() {
        return items.isEmpty();
    }
}
