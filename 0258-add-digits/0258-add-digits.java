class Solution {
    public int addDigits(int num) {
        while(num > 9){
            num = adddigit(num);
        }
        return num;
    }
    int adddigit(int n){
        int sum = 0;
        while(n > 0){
            int last = n % 10;
            sum += last;
            n /= 10;
        }
        return sum;
    }
}