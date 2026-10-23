vector<vector<int>> levelOrder(TreeNode* root) {
    vector<vector<int>> levels;
    if (!root) return levels;
    vector<TreeNode*> frontier = {root};
    while (!frontier.empty()) {
        vector<int> values;
        vector<TreeNode*> next;
        for (TreeNode* node : frontier) {
            values.push_back(node->val);
            if (node->left) next.push_back(node->left);
            if (node->right) next.push_back(node->right);
        }
        levels.push_back(values);
        frontier = next;
    }
    return levels;
}
