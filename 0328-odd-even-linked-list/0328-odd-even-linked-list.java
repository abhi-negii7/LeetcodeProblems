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
    public ListNode oddEvenList(ListNode head) {

        ListNode oddL = new ListNode(1);
        ListNode evenL = new ListNode(2);

        ListNode tempOdd = oddL;
        ListNode tempEven = evenL;

        int count = 1;
        ListNode temp = head;
        while (temp != null) {
            // Odd 
            if (count % 2 != 0) {
                tempOdd.next = temp;
                tempOdd = tempOdd.next;
            } else {
                tempEven.next = temp;
                tempEven = tempEven.next;
            }
            temp = temp.next;
            count++;
        }
        tempEven.next = null;
        tempOdd.next = evenL.next;

        return oddL.next;

    }
}