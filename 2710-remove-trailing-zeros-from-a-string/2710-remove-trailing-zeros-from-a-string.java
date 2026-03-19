class Solution {
    public String removeTrailingZeros(String num) {
        int lastidx = 0;
        for(int i=num.length()-1; i>=0; i--){
            if(num.charAt(i) != '0'){
                lastidx = i;
                break;
            }
        }
        return num.substring(0,lastidx+1);
    }
}