class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int res = 0;
        boolean flag = false;
        for(int i=0; i<fruits.length; i++){
            int f = fruits[i];
            for(int j=0; j<baskets.length; j++){
                if(f <= baskets[j]){
                    baskets[j] = -1;
                    flag = true;
                    break;
                }
            }
            if(flag){
                flag=false;
            }else{
                res++;
            }
        }
        return res;
    }
}