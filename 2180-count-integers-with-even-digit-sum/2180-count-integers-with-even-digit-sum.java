class Solution {
    public int countEven(int num) {
        int count = 0;
        for(int i=2; i<=num; i++){
            if(iseven(i)){
                count++;
            }
        }
        return count;
    }
    boolean iseven(int n){
        int sum = 0;
        while(n > 0){
            int last = n % 10;
            sum += last;
            n /= 10;
        }
        if(sum % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}