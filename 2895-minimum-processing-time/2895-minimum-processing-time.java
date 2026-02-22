class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(tasks,Collections.reverseOrder());
        Collections.sort(processorTime);
        int n = tasks.size();
        int maxTime = 0;
        int taskIndex = 0;
        for(int i=0; i<processorTime.size(); i++){
            int currentmax = 0;
            //for(int j=0; j<4; j++){
                //currentmax = Math.max(currentmax, processorTime.get(i) + tasks.get(taskIndex));
                // taskIndex += 4;
            //}
            maxTime = Math.max(maxTime,processorTime.get(i) + tasks.get(taskIndex));
            taskIndex += 4;
        }
        return maxTime;



        // int fi = processorTime.get(0);
        // int la = processorTime.get(1);
        // for(int i=0; i<n/2; i++){
        //     if(la + tasks.get(i) > fmax){
        //         fmax = la + tasks.get(i);
        //     }
        // }
        // for(int i=n/2; i<n; i++){
        //     if(fi + tasks.get(i) > lmax){
        //         lmax = fi + tasks.get(i);
        //     }
        // }
        // return Math.max(lmax,fmax);
    }
}