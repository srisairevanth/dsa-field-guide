int diameterOf(TreeNode* root) {
    int best = 0;
    function<int(TreeNode*)> depth = [&](TreeNode* node) -> int {
        if (!node) return 0;
        int left = depth(node->left), right = depth(node->right);
        best = max(best, left + right);
        return 1 + max(left, right);
    };
    depth(root);
    return best;
}
