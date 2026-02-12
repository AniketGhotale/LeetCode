class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> set1 = new HashMap<>();
        HashMap<String,Integer> set2 = new HashMap<>();
        int count = 0;
        for(int i=0; i<words1.length; i++){
            set1.put(words1[i],set1.getOrDefault(words1[i],0)+1);
        }
        for(int i=0; i<words2.length; i++){
            set2.put(words2[i],set2.getOrDefault(words2[i],0)+1);
        }
        for(String key : set1.keySet()){
            if((set2.containsKey(key) && set1.get(key)==1) && set2.get(key) == 1){
                count++;
            }
        }
        return count;
    }
}