class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0) + 1);
        }
        //List<Map.entry<Character,Integer>> list = new ArrayList<>(map.entryset());
        List<Character> keys = new ArrayList<>(map.keySet());
        keys.sort((a,b) -> map.get(b) - map.get(a));
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<keys.size(); i++){
            sb.append(String.valueOf(keys.get(i)).repeat(map.get(keys.get(i))));
        }
        return sb.toString();
        //list.sort((a,b) -> b.getvalue() - a.getvalue());

    }
}