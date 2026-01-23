class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        HashSet<Character> jset = new HashSet<>();
        for(int i=0; i<jewels.length(); i++){
            jset.add(jewels.charAt(i));
        }

        int count = 0;
        for(int i=0 ;i<stones.length(); i++){
            if(jset.contains(stones.charAt(i))){
                count++;
            }
        }

        return count;
    }
}