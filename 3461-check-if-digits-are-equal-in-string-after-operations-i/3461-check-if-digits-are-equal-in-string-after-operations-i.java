class Solution {
    public boolean hasSameDigits(String s) {
        

        while(s.length() > 2){
            int n=s.length();
            String str = "";
            for(int i=1; i<n; i++){
                int sum = ( (int)s.charAt(i-1) + (int)(s.charAt(i)) )%10;
                str += sum;
            }
            s=str;
        }
        if(s.charAt(0) == s.charAt(1)){
            return true;
        }
        return false;
    }
}