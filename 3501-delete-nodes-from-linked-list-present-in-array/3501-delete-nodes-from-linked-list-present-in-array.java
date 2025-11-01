/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {

        ListNode ans = new ListNode(1);
        ListNode ansHead = ans;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        ListNode temp = head;

        while (temp != null) {
            if (!set.contains(temp.val)) {
                ans.next = temp;
                ans = ans.next;
            }
            temp = temp.next;
        }
        ans.next=null;
        return ansHead.next;
    }
}