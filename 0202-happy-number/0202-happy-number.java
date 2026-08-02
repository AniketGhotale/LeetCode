class Solution {
    public boolean isHappy(int n) {
        int res = n;
        while(res > 5){
            int sum = 0;
            int temp = res; 
            while(temp > 0){
                int last = temp % 10;
                sum = sum + (last * last);
                temp /= 10;
            }
            res = sum;
        }
        if(res == 1){
            return true;
        }else{
            return false;
        }
    }
}