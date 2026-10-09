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
        if(head == null || head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        for(int i=0; i<n; i++){
            fast = fast.next;
        }

        if(fast == null){
            return head.next;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;














        // if(head == null || head.next == null){
        //     return null;
        // }
        // ListNode fast = head;
        // ListNode prev = head; 
        // for(int i=0; i<n; i++){
        //     fast = fast.next;
        // }
        // if(fast == null){
        //     return head.next;
        // }
        // ListNode node = head;
        // while(fast != null){
        //     prev = node;
        //     fast = fast.next;
        //     node = node.next;
        // }
        // prev.next = node.next;
        // return head;
    }
}

















// if(head == null || head.next == null){
//             return null;
//         }
//         ListNode fast = head;
//         ListNode prev = head;
//         ListNode delnode = head;

//         for(int i=0; i<n; i++){
//             fast = fast.next;
//         }

//         if(fast == null){
//             return head.next;
//         }

//         while(fast != null){
//             prev = delnode;
//             delnode = delnode.next;
//             fast = fast.next;
//         }

//         prev.next = delnode.next;
//         return head;