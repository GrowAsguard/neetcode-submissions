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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode answer = new ListNode(0,head);
        ListNode front = answer;
        ListNode back = answer;
        for (int i=0; i<=n; i++){
            front = front.next;
        }
        while (front != null) {
            back = back.next;
            front = front.next;
        }
        back.next = back.next.next;
        return answer.next;
    }
}
