class Solution {
    public int reverseBits(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            int q = n % 2;
            sb.append(q);
            n /= 2;
        }
        while(sb.length() != 32){
            sb.append(0);
        }
        String s = sb.reverse().toString();
        int res = 0;
        int idx = 0;
        for(int i=s.length()-1; i>=0; i--){
            int l = s.charAt(i)-'0';
            res += Math.pow(2,i) * l;
            idx++;
        }
        return res;
        
    }
}