class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i=0; i<allowed.length(); i++){
            set.add(allowed.charAt(i));
        }
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words[i].length(); j++){
                if(!set.contains(words[i].charAt(j))){
                    break;
                }else if(j == words[i].length()-1){
                    count++;
                }
            }
        }
        return count;
    }
}