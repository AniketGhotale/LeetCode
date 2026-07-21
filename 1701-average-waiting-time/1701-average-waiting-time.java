class Solution {
    public double averageWaitingTime(int[][] customers) {
        long total = 0;
        int n = customers.length;
        long s = customers[0][0];
        for(int i=0; i<n; i++){
            int a = customers[i][0];
            int t = customers[i][1];
            if(a > s){
                s = a+t;
                total += s - a;
            }else{
                s += t;
                total += s - a;
            }
            
            
        }
        return (double) total/n;
    }
}