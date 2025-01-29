/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        
        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        boolean ltr = true;
        
        while (!q.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            for (int i = q.size(); i > 0; --i) {
                TreeNode node = q.poll();
                temp.add(node.val);
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
            if (!ltr) Collections.reverse(temp);
            res.add(temp);
            ltr = !ltr;
        }
        return res;
    }
}