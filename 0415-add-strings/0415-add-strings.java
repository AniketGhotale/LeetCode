class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;    
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(i>=0 || j>=0 || carry !=0){
            int n1 = i>=0?num1.charAt(i)-'0':0;
            int n2 = j>=0?num2.charAt(j)-'0':0;
            int sum = n1 + n2 + carry;
            carry = sum / 10;
            sb.append(sum % 10);
            i--;
            j--;
        }

        return sb.reverse().toString();
        // int n1 = 0;
        // int n2 = 0;
        // for(int i=0; i<num1.length(); i++){
        //     char ch = num1.charAt(i);
        //     int num = ch - '0';
        //     n1 = (n1 * 10) + num;
        // }

        // for(int i=0; i<num2.length(); i++){
        //     char ch = num2.charAt(i);
        //     int num = ch - '0';
        //     n2 = (n2 * 10) + num;
        // }
        // return String.valueOf(n1+n2);
    }
}