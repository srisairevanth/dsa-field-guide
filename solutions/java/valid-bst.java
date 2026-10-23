class Solution {
    public boolean isValidBST(TreeNode root) {
        return inRange(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean inRange(TreeNode node, long lo, long hi) {
        if (node == null) return true;
        if (node.val <= lo || node.val >= hi) return false;
        return inRange(node.left, lo, node.val) && inRange(node.right, node.val, hi);
    }
}
