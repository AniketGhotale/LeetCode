class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i=0; i<words.length; i++){
            if(words[i].contains(Character.toString(x))){
                list.add(i);
            }
        }
        return list;
    }
}