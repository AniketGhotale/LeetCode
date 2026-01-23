class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer> maps = new HashMap<>();
        HashMap<Character,Integer> mapt = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            maps.put(s.charAt(i),i);
        }
        for(int i=0; i<t.length(); i++){
            mapt.put(t.charAt(i),i);
        }

        int res = 0;
        for(int i=0 ;i<s.length(); i++){
            int sidx = maps.get(s.charAt(i));
            int tidx = mapt.get(s.charAt(i));
            res += Math.abs((sidx - tidx));
        }

        return res;

    }
}