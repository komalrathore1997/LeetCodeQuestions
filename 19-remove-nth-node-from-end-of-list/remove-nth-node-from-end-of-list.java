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
        int size=0;

        ListNode listNode=head;
        if(listNode==null) return listNode;
        while(listNode!=null){
            size++;
            listNode=listNode.next;
        }

        int pos=size-n;
        if(pos==0){
            head=head.next;
            return head;
        }
        int data=0;
        ListNode curr=head;
        while(data<pos-1){
            curr=curr.next;
            data++;
        }
        curr.next=curr.next.next;

        return head;

    }
}