class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int arr[] = new int[101];
        int count = 0;
        for(int i=lowLimit; i<=highLimit; i++){
            int sum = addition(i);
            arr[sum]++;
            if(arr[sum] > count){
                count = arr[sum];
            }
        }
        return count;
    }
    int addition(int num){
        int temp = num;
        int sum = 0; 
        while(temp > 0){
            int last = temp % 10;
            sum += last;
            temp /= 10;
        }
        return sum;
    }
}