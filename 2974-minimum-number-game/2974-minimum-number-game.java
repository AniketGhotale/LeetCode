
class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> hp = new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
            hp.add(nums[i]);
        }
        int arr[] = new int[nums.length];
        int idx = 0;
        while(!hp.isEmpty()){
            int ali = hp.poll();
            int bob = hp.poll();
            arr[idx++] = bob;
            arr[idx++] = ali;
        }
        return arr;
    }
}