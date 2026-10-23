class Editor {
    vector<string> states;
    string current() const { return states.empty() ? "" : states.back(); }
public:
    void type(const string& text) { states.push_back(current() + text); }
    string undo() {
        if (!states.empty()) states.pop_back();
        return current();
    }
};
