class Solution {
    public int countPrimes(int n) {
        int count = 0;
        if(n <= 2){
            return 0;
        }
        //count++;
        boolean arr[] = new boolean[n];
        int curr = 2;
        arr[0] = true;
        arr[1] = true;
        //arr[2] = false;

        
        while(curr < n){
            int inc = curr;
            if(arr[curr] == false){
                inc = curr * 2;
                count++;
            }
            for(int i=inc; i<n; i=i+curr){
                arr[i] = true;
            }
            curr++;
        }
        // for(int i=3; i<n; i=i+2){
        //     if(isprime(i)){
        //         count++;
        //     }
        // }
        return count;
    }
    // boolean isprime(int n){
    //     for(int i=2; i<n; i++){
    //         if(n % i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}