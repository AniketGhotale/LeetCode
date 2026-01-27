class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<brokenLetters.length(); i++){
            set.add(brokenLetters.charAt(i));
        }
        int count = 0;
        String textarr[] = text.split(" ");
        for(int i=0; i<textarr.length; i++){
            for(int j=0; j<textarr[i].length(); j++){
                if(set.contains(textarr[i].charAt(j))){
                    break;
                }
                if(j == textarr[i].length()-1){
                    count++;
                }
            }
        }
        return count;
    }
}