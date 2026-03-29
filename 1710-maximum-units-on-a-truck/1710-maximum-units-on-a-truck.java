class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> a[1] - b[1]);
        int count = 0;
        int idx = boxTypes.length-1;
        while(truckSize > 0 && idx >=0){
            int a = boxTypes[idx][0];
            int b = boxTypes[idx][1];
            if(truckSize >= a){
                count += (a * b);
                idx--;
                truckSize -= a;
            }else{
                count += truckSize * b;
                truckSize = 0;
            }
        }
        return count;
    }
}