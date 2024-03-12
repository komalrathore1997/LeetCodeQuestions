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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq=new PriorityQueue();
        for(ListNode list:lists){
            while(list!=null){
                pq.add(list.val);
                list=list.next;
            }
        }

        ListNode ans =new ListNode(-1);
        if(pq.size()<0) return null;
        else{
            ListNode dummy=ans;
            while(pq.size()!=0){
            dummy.next=new ListNode(pq.poll());
            dummy=dummy.next;
            }

        }

        return ans.next;

    }
}