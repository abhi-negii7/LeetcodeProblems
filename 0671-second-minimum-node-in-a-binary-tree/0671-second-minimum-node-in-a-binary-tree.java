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
    public int findSecondMinimumValue(TreeNode root) {
        long minArr[] = { Long.MAX_VALUE, Long.MAX_VALUE };

        secondMin(minArr, root);
        if (minArr[1] == Long.MAX_VALUE)
            return -1;
        return (int) minArr[1];
    }

    public long secondMin(long[] minArr, TreeNode root) {

        if (root == null)
            return Long.MAX_VALUE;

        long leftMin = secondMin(minArr, root.left);
        long rightMin = secondMin(minArr, root.right);

        long min = Math.min(root.val, Math.min(leftMin, rightMin));
        if (minArr[0] > min) {
            minArr[1] = minArr[0];
            minArr[0] = min;
        }
        if (root.val > minArr[0] && root.val < minArr[1]) {
            minArr[1] = min;
        }

        return minArr[0];
    }
}