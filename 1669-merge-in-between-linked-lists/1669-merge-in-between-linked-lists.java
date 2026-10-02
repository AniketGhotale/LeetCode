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
        ListNode head1 = list1;
        for(int i=0; i<a-1; i++){
            head1 = head1.next;
        }
        ListNode tail2 = list2;
        while(tail2.next != null){
            tail2 = tail2.next;
        }
        ListNode tail1 = head1;
        for(int i=0; i<=b-a; i++){
            tail1 = tail1.next;
        }
        head1.next = list2;
        tail2.next = tail1.next;

        return list1;
    }


}