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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       List<Integer> listObj=new ArrayList<>();
       while(list1!=null){
          listObj.add(list1.val);
          list1=list1.next;
       }

       while(list2!=null){
          listObj.add(list2.val);
          list2=list2.next;
       }

       Collections.sort(listObj);
       ListNode dummy=new ListNode(-1);
       ListNode temp=dummy;
       for(int i=0;i<listObj.size();i++){
           ListNode node=new ListNode(listObj.get(i));
           temp.next=node;

           temp=temp.next;
       }

       return dummy.next;
        
    }
}