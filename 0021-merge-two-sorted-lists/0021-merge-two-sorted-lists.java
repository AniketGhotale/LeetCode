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
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode head = null;
        ListNode res = null;
        ListNode newN = null;
        while(temp1 != null  && temp2 != null){
            if(temp1.val <= temp2.val){
                newN = new ListNode(temp1.val);
                temp1 = temp1.next;
            }else{
                newN = new ListNode(temp2.val);
                temp2 = temp2.next;
            }

            //ListNode newN = new ListNode(temp1.val);
                if(head == null){
                    head = newN;
                    head.next = null;
                    res = head;
                }else{
                    res.next = newN;
                    res = newN;
                }
                
        }

        while(temp1 != null){
            ListNode newNode = new ListNode(temp1.val);
            temp1 = temp1.next;
            if(head == null){
                head = newNode;
                head.next = null;
                res = head;
            }else{
                res.next = newNode;
                res = newNode;
            }
        }


        while(temp2 != null){
            ListNode newNode = new ListNode(temp2.val);
            temp2 = temp2.next;
            if(head == null){
                head = newNode;
                head.next = null;
                res = head;
            }else{
                res.next = newNode;
                res = newNode;
            }
        }
        return head;
    }
}