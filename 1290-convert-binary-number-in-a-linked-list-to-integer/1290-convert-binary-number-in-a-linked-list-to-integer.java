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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        StringBuilder sb = new StringBuilder();
        //int num = 0;

        while(temp != null){
            sb.append(temp.val);
            //num = (num * 10) + temp.val;
            temp = temp.next;
        }


        int k=0;
        int res = 0;
        for(int i=sb.length()-1; i>=0; i--){
            if(sb.charAt(i) == '1'){
                res = res + (int)Math.pow(2,k);
            }
            k++;
        }
        // while(num > 0){
        //     int last = num % 10;

        //     res = res + (int)( Math.pow(2,i) * last );
        //     i++;
        //     num /= 10;
        // }
        return res;
    }
}