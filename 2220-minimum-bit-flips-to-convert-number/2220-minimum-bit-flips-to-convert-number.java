class Solution {
    public int minBitFlips(int start, int goal) {
        String b1 = getbinary(start);
        String b2 = getbinary(goal);
        int x = start ^ goal;
        return Integer.bitCount(x);
        // int count = 0;
        // int diff = b1.length() - b2.length();
        // if(diff > 0){
        //     b2 = addzero(diff,b2);
        // }else if(diff < 0){
        //     b1 = addzero(Math.abs(diff),b1);
        // }
        
        // for(int i=0; i<b1.length(); i++){
        //     if(b1.charAt(i) != b2.charAt(i)){
        //         count++;
        //     }
        // }
        
        //return count;
    }

    String getbinary(int n){
        String binary = "";
        while(n > 0){
            binary = (n % 2) + binary;
            n/=2;
        }
        return binary;
    }

    String addzero(int n, String s){
        for(int i=0; i<n;i++){
            s = '0' + s;
        }
        return s;
    }
}