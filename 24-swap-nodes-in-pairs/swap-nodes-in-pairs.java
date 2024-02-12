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
    public ListNode swapPairs(ListNode head) {
        ListNode z =new ListNode();
        ListNode current = head;
        ListNode previous = z;

        if(current == null || current.next == null){
            return head;
        }
        while(current != null && current.next != null){
            previous.next = current.next;
            current.next = previous.next.next;
            previous.next.next = current;
            previous = current;
            current = current.next;
        }
        return z.next;
        
    }
}