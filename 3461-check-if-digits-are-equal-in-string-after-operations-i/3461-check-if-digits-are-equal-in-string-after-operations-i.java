class Solution {
    public boolean hasSameDigits(String s) {
        

        while(s.length() > 2){
            int n=s.length();
            StringBuilder str = new StringBuilder();
            
            for(int i=1; i<n; i++){
                int sum = ( (int)s.charAt(i-1) + (int)(s.charAt(i)) )%10;
                str.append(sum);
            }
            s=str.toString();
        }
        if(s.charAt(0) == s.charAt(1)){
            return true;
        }
        return false;
    }
}