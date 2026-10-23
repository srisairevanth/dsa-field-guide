class Solution {
    private int best;

    public int diameterOf(TreeNode root) {
        best = 0;
        depth(root);
        return best;
    }

    private int depth(TreeNode node) {
        if (node == null) return 0;
        int left = depth(node.left), right = depth(node.right);
        best = Math.max(best, left + right);
        return 1 + Math.max(left, right);
    }
}
