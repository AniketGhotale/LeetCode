class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int count = 0;
        int org = capacity;
        for(int i=0; i<plants.length; i++){
            if(capacity >= plants[i]){
                capacity -= plants[i];
                count++;
            }else{
                //count+=i;
                count += (2*i)+1;
                capacity = org;
                //count+=(i+1);
                capacity -= plants[i];
            }
        }
        return count;
    }
}