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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head.next;
        while(next != null){
            if(curr.val != next.val){
                prev = curr;
                curr = curr.next;
                next = next.next;
            }else{
                while(next != null && curr.val == next.val){
                    next = next.next;
                }
                if(prev == null){
                    
                    head = next;
                }else{
                    prev.next = next;
                }
                //prev.next = next;
                curr = next;
                if(next != null){
                    next = next.next;
                }
                

            }
        }
        return head;
    }
}