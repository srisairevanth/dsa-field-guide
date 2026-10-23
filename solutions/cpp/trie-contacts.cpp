class Trie {
    struct Node {
        map<char, Node*> next;
        bool end = false;
    };
    Node* root;
    Node* walk(const string& text) {
        Node* node = root;
        for (char ch : text) {
            auto it = node->next.find(ch);
            if (it == node->next.end()) return nullptr;
            node = it->second;
        }
        return node;
    }
public:
    Trie() : root(new Node()) {}
    void insert(const string& word) {
        Node* node = root;
        for (char ch : word) {
            Node*& child = node->next[ch];
            if (!child) child = new Node();
            node = child;
        }
        node->end = true;
    }
    bool search(const string& word) {
        Node* node = walk(word);
        return node != nullptr && node->end;
    }
    bool startsWith(const string& prefix) {
        return walk(prefix) != nullptr;
    }
};
