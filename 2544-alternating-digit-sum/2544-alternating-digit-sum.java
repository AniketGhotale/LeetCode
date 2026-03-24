class Solution {
    public int alternateDigitSum(int n) {
        String s = String.valueOf(n);
        boolean flag = true;
        int res = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int num = ch - '0';
            if(flag){
                res += num;
                flag = false;
            }else{
                res -= num;
                flag = true;
            }
        }
        return res;
    }
}