class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> sb = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        String arr1[] = s1.split(" ");
        String arr2[] = s2.split(" ");
        for(String str : arr1){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        for(String str : arr2){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        // for(String str : arr1){
        //     if((s2.indexOf(str) == -1)){
        //         sb.add(str);
        //     }
        // }
        // for(String str : arr2){
        //     if(s1.indexOf(str) == -1){
        //         sb.add(str);
        //     }
        // }
        for(String key : map.keySet()){
            if(map.get(key) == 1){
                sb.add(key);
            }
        }
        String res[] = new String[sb.size()];
        for(int i=0; i<sb.size(); i++){
            res[i] = sb.get(i);
        }
        return res;
    }
}