import java.util.*;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        if (root == null) return levels;
        List<TreeNode> queue = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> values = new ArrayList<>();
            List<TreeNode> next = new ArrayList<>();
            for (TreeNode node : queue) {
                values.add(node.val);
                if (node.left != null) next.add(node.left);
                if (node.right != null) next.add(node.right);
            }
            levels.add(values);
            queue = next;
        }
        return levels;
    }
}
