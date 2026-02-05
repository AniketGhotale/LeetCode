class Solution {
    public List<String> commonChars(String[] words) {
        List<String> res = new ArrayList<>();
        int min[] = new int[26];
        // for(int i=0; i<words[0].length(); i++){
        //     min[words[0].charAt(i) - 'a']++;
        // }
        Arrays.fill(min, Integer.MAX_VALUE);
        for(int i=0;i<words.length; i++){
            int freq[] = new int[26];
            for(int j=0; j<words[i].length(); j++){
                freq[words[i].charAt(j) - 'a']++;
            }

            for(int j=0; j<26;j++){
                min[j] = Math.min(min[j],freq[j]);
            }
        }
        for(int i=0; i<26;i++){
            while(min[i] > 0){
                res.add(String.valueOf((char)(i + 'a')));
                min[i]--;
            }
        }
        return res;
    }
}