/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // if(head == null || head.next == null){
        //     return;
        // }
        // ListNode prev = head;
        // if(prev.val == node.val){
        //     head = null;
        // }
        // ListNode curr = head.next;
        // while(curr != null){
        //     if(curr.val != node.val){
        //         prev = curr;
        //         curr = curr.next;
        //     }else{
        //         prev.next = curr.next;
        //         return;
        //     }
        // }
        node.val = node.next.val;
        node.next = node.next.next;
    }
}