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
    public int twiceOfVal(ListNode head){
        if(head == null) return 0;

        int doubleValue = head.val * 2 + twiceOfVal(head.next);
        head.val = doubleValue%10;
        return doubleValue/10;
    }
    public ListNode doubleIt(ListNode head) {
        int carry = twiceOfVal(head);

        if(carry != 0){
            head = new ListNode(carry,head);
        }
        return head;
    }
}