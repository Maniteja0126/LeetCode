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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        int prefixSum= 0;
        Map<Integer , ListNode> map = new HashMap<>();
        map.put(prefixSum , dummy);

        while(head != null){
            prefixSum += head.val;
            map.put(prefixSum,head);
            head = head.next;
        }

        head = dummy;
        prefixSum=0;

        while(head != null){
            prefixSum += head.val;
            head.next =map.get(prefixSum).next;
            head = head.next;
        }
        return dummy.next;
        
    }
}