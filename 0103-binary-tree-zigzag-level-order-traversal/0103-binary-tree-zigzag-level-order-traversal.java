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

        // store the answer
        List<List<Integer>> res = new ArrayList<>();

        // if root is null
        if (root == null)
            return res;

        // flag to tell which pattern to follow L->R or R->L
        boolean leftToRight = true;

        Queue<TreeNode> nodeQ = new LinkedList<>();
        nodeQ.add(root);

        while (!nodeQ.isEmpty()) {

            int size = nodeQ.size();

            List<Integer> list = new ArrayList<>(Collections.nCopies(size, 0));
            for (int i = 0; i < size; i++) {

                TreeNode currNode = nodeQ.poll();

                int index = leftToRight ? i : size - 1 - i;

                if (currNode.left != null)
                    nodeQ.add(currNode.left);
                if (currNode.right != null)
                    nodeQ.add(currNode.right);

                list.set(index, currNode.val);
            }
            leftToRight = !leftToRight;
            res.add(list);
        }
        return res;
    }
}