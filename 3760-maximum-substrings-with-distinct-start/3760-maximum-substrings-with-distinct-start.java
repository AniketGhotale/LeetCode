class Solution {
    public int maxDistinct(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int count=0;
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i),(map.getOrDefault(s.charAt(i),0)+1));
        }

        return map.size();

        // for(int i=0; i<s.length(); i++){
        //     if(map.get(s.charAt(i))==1 ){
        //         count++;
        //     }else{
        //         map.put(s.charAt(i),(map.get(s.charAt(i))-1));
        //     }
        // }

        // return count;
    }
}