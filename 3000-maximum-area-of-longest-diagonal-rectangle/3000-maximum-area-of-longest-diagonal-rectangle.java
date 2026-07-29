class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int lr = -1;
        double la = -1;

        for(int i=0; i<dimensions.length; i++){
            double l = dimensions[i][0];
            double w = dimensions[i][1];
            double res = Math.sqrt((l*l) + (w*w));
            if(res > la){
                la = res;
                lr = i;
            }else if(res == la && (dimensions[lr][0] * dimensions[lr][1] < dimensions[i][0] * dimensions[i][1])){
                la = res;
                lr = i;
            }
        }
        return dimensions[lr][0] * dimensions[lr][1];
    }
}