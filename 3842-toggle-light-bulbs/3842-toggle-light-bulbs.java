class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        int res[] = new int[101];
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<bulbs.size(); i++){
            res[bulbs.get(i)]++;
        }

        for(int i=0; i<101; i++){
            if(res[i] % 2 == 1){
                list.add(i);
            }
        }
        return list;
    }
}