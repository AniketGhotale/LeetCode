class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int res[] = new int[2];
        int first = 0;
        int last = numbers.length-1;
        while(first <= last){
            int total = numbers[first] + numbers[last];
            if(total == target){
                res[0] = first+1;
                res[1] = last+1;
                return res;
            }else if(target > total){
                first++;
            }else{
                last--;
            }
        }
        // for(int i=0; i<numbers.length; i++){
        //     for(int j=i+1;j<numbers.length; j++){
        //         if((numbers[i] + numbers[j]) == target){
        //             res[0] = i+1;
        //             res[1] = j+1;
        //             return res;
        //         }
        //     }
        // }
        return res;
    }
}