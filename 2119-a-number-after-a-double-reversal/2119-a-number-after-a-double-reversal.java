class Solution {
    public boolean isSameAfterReversals(int num) {
        
        int rev1 = reverse(num);
        int rev2 = reverse(rev1);
        return num == rev2;





        // int last = num%10;
        // if(last==0){
        //     while(num>0){
        //         last = num%10;
        //         if(last!=0){
        //             return false;
        //         }
        //         num/=10;
        //     }
        //     return true;
        // }else{
        //     return true;
        // }
    }

    int reverse(int n){
        int temp = n;
        int rev = 0;
        while(n>0){
            int last = n%10;
            rev = (rev*10) + last;
            n/=10;
        }
        return rev;
    }
    
}