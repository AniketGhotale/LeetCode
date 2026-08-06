class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<>();
        int n= nums.length; 

        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int res = 0-nums[i];
            int la = i+1;
            int r = n-1;


            while(la < r){
                int sum = nums[la] + nums[r];
                if(sum < res){
                    la++;
                }else if(sum > res){
                    r--;
                }else{
                    ArrayList<Integer> l = new ArrayList<>();
                        l.add(nums[i]);
                        l.add(nums[la]);
                        l.add(nums[r]);
                        
                        //if(!list.contains(l)){
                            list.add(l);
                        //}
                    la++;
                    r--;
                    while (la < n && nums[la] == nums[la - 1]) {
                        la++;
                    }
                    while (r > la && nums[r] == nums[r + 1]) {
                        r--;
                    }
                }
            }
        }
        return list;
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         if( (i!= j) && ( (m1.containsKey(nums[i] + nums[j])) && m1.get(nums[i] + nums[j]) != i && (m1.get(nums[i] + nums[j]) != j) )){
        //             ArrayList<Integer> l = new ArrayList<>();
        //                 l.add(nums[i]);
        //                 l.add(nums[j]);
        //                 l.add( - (nums[i] + nums[j]));
        //                 Collections.sort(l);
        //                 if(!list.contains(l)){
        //                     list.add(l);
        //                 }
        //         }
        //     }
        // }
        // Arrays.sort(nums);
        // int i = 0, j=0 , k=0;
        // while(i < n){
        //     if( (i!=j && j!=k) && (nums[i] + nums[j] + nums[k] == 0) ){
        //                 ArrayList<Integer> l = new ArrayList<>();
        //                 l.add(nums[i]);
        //                 l.add(nums[j]);
        //                 l.add(nums[k]);
        //                 Collections.sort(l);
        //                 if(!list.contains(l)){
        //                     list.add(l);
        //                 }
        //     }
        //     i++;
        //     j=( (j+2) % n);
        //     k= ((k+3) % n);

        // }


        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         for(int k=j+1; k<n; k++){
        //             if( (i!=j && j!=k) && (nums[i] + nums[j] + nums[k] == 0) ){
        //                 ArrayList<Integer> l = new ArrayList<>();
        //                 l.add(nums[i]);
        //                 l.add(nums[j]);
        //                 l.add(nums[k]);
        //                 Collections.sort(l);
        //                 if(!list.contains(l)){
        //                     list.add(l);
        //                 }
        //                 break;
        //             }
        //         }
        //     }
        // }
        
     }
}