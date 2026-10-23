import java.util.*;

class BrowserHistory {
    private final List<String> pages = new ArrayList<>();
    private int pos = 0;

    public BrowserHistory(String homepage) {
        pages.add(homepage);
    }

    public void visit(String url) {
        while (pages.size() > pos + 1) pages.remove(pages.size() - 1);
        pages.add(url);
        pos++;
    }

    public String back(int steps) {
        pos = Math.max(0, pos - steps);
        return pages.get(pos);
    }

    public String forward(int steps) {
        pos = Math.min(pages.size() - 1, pos + steps);
        return pages.get(pos);
    }
}
