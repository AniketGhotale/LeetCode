class Solution {
    public int trailingZeroes(int n) {
        int fact = 1;
        int count =0;

        while(n > 0){
            count += n / 5;
            n = n/5;
        }

        // for(int i=n; i>=1; i--){
        //     fact *= i;
        // }
        // int count = 0;
        
        // while(0 == fact%10){
        //     count++;
        //     fact/=10;
        // }

        return count;
    }
}