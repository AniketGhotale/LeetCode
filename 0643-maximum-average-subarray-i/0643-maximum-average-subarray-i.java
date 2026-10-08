class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = Double.NEGATIVE_INFINITY;
        int st = 0;
        int lt = k-1;
        int n = nums.length;
        double sum = 0;
            for(int i=st; i<=lt; i++){
                sum += nums[i];
            }
            avg = Math.max(avg, (sum/k));
            st++;
            lt++;
        while(lt < n){
            sum-=nums[st-1];
            sum+=nums[lt];
            avg = Math.max(avg, (sum/k));
            st++;
            lt++;
        }
        return avg;
    }
}