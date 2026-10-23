class BrowserHistory {
    vector<string> pages;
    int pos;
public:
    BrowserHistory(const string& homepage) : pages{homepage}, pos(0) {}
    void visit(const string& url) {
        pages.erase(pages.begin() + pos + 1, pages.end());
        pages.push_back(url);
        pos++;
    }
    string back(int steps) {
        pos = max(0, pos - steps);
        return pages[pos];
    }
    string forward(int steps) {
        pos = min((int)pages.size() - 1, pos + steps);
        return pages[pos];
    }
};
