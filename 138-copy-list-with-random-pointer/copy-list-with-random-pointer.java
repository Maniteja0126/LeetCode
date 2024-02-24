/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
        public static void insertCopy(Node head){
        Node temp = head;
        while(temp != null){
            Node nextElement = temp.next;
            Node copyNode = new Node(temp.val);
            copyNode.next=nextElement;
            temp.next = copyNode;
            temp=nextElement;
        }
    }
    public static void randomPointers(Node head){
        Node temp = head;
        while(temp != null){
            Node copyNOde = temp.next;
            if(temp.random != null){
                copyNOde.random = temp.random.next;
            }else{
                copyNOde.random = null;
            }
            temp=temp.next.next;
        }
    }
    public static Node getDeepCopy(Node head){
        Node temp = head;
        Node dummy = new Node(-1);
        Node res = dummy;

        while(temp != null){
            res.next = temp.next;
            res = res.next;
            temp.next=temp.next.next;
            temp=temp.next;

        }
        return dummy.next;
    }
    public Node copyRandomList(Node head) {
        insertCopy(head);
        randomPointers(head);
        return getDeepCopy(head);
    }
}