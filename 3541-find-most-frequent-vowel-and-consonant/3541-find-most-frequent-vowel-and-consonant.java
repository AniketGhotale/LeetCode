class Solution {
    public int maxFreqSum(String s) {
        int maxv = 0;
        int maxc = 0;
        HashMap<Character,Integer> mapv = new HashMap<>();
        HashMap<Character,Integer> mapc = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                mapv.put(s.charAt(i), (mapv.getOrDefault(s.charAt(i),0)+1));
                if(mapv.get(s.charAt(i)) > maxv){
                    maxv = mapv.get(s.charAt(i));
                }
            }else{
                mapc.put(s.charAt(i), (mapc.getOrDefault(s.charAt(i),0)+1));
                if(mapc.get(s.charAt(i)) > maxc){
                    maxc = mapc.get(s.charAt(i));
                }
            }
        }
        return maxc + maxv;
    }
}