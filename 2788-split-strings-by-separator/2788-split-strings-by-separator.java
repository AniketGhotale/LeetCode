class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new ArrayList<>();

        for(int i=0; i<words.size(); i++){
            int curr = 0;
            for(int j=0; j<words.get(i).length(); j++){
                if(words.get(i).charAt(j) == separator){
                    if(curr < j){
                        list.add(words.get(i).substring(curr,j));
                    }
                    curr=j+1;
                }
            }
            if(curr < words.get(i).length()){
                list.add(words.get(i).substring(curr,words.get(i).length()));
            }
        }
        return list;
    }
}