class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // int n = temperatures.length;
        // int res[] = new int[n];
        // for(int i=0; i<n; i++){
        //     int num = temperatures[i];
        //     int count = 1;
        //     for(int j=i+1; j<n; j++){
        //         if(temperatures[j] <= num ){
        //             count++;
        //         }else{
        //             res[i] = count;
        //             break;
        //         }
        //     }
        // }
        // return res;





        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() &&
                   temperatures[st.peek()] <= temperatures[i]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                res[i] = st.peek() - i;
            }

            st.push(i);
        }

        return res;
    }
}