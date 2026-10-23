import java.util.*;

class Editor {
    private final List<String> states = new ArrayList<>();

    private String current() {
        return states.isEmpty() ? "" : states.get(states.size() - 1);
    }

    public void type(String text) {
        states.add(current() + text);
    }

    public String undo() {
        if (!states.isEmpty()) states.remove(states.size() - 1);
        return current();
    }
}
