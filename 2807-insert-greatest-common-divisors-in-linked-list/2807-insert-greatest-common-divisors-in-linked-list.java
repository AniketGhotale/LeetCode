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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode prev = head;
        ListNode next = head.next;

        while(next != null){
            int divisor = getDivisor(prev.val, next.val);
            ListNode temp = new ListNode(divisor);
            prev.next = temp;
            temp.next = next;
            prev = next;
            next = next.next;
        }
        

        return head;
    }
    int getDivisor(int a, int b){
            for(int i=b; i>=0; i--){
                if(a%i == 0 && b%i == 0){
                    return i;
                }
            }
            return -1;
        }
}