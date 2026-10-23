import java.util.*;

class MyQueue {
    private final Deque<Integer> inbox = new ArrayDeque<>();
    private final Deque<Integer> outbox = new ArrayDeque<>();

    private void move() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) outbox.push(inbox.pop());
        }
    }

    public void push(int x) {
        inbox.push(x);
    }

    public int peek() {
        move();
        return outbox.peek();
    }

    public int pop() {
        move();
        return outbox.pop();
    }

    public boolean empty() {
        return inbox.isEmpty() && outbox.isEmpty();
    }
}
