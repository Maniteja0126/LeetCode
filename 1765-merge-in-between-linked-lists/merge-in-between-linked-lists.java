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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode bthNode = null;
        ListNode athNode= null;
        int NodeIndex = 0;
        ListNode curr = list1;

        while(curr != null){
            if(NodeIndex == a-1) athNode = curr;
            if(NodeIndex == b+1){
                bthNode = curr;
                break;
            }
            NodeIndex++;
            curr=curr.next;
        }

        athNode.next = list2;
        curr = list2;

        while(curr != null && curr.next != null) curr= curr.next;

        curr.next = bthNode;
        return list1;
    }
}