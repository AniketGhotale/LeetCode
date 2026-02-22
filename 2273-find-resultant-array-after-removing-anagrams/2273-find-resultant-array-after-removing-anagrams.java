class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        list.add(words[0]);
        for(int i=1; i<words.length; i++){
            if(!anagram(words[i],words[i-1])){
                list.add(words[i]);
            }
        }
        return list;
    }
    boolean anagram(String s1,String s2){
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        for(int i=0; i<s1.length(); i++){
            arr1[s1.charAt(i) - 97]++;
        }
        for(int i=0; i<s2.length(); i++){
            arr2[s2.charAt(i) - 97]++;
        }
        if(Arrays.equals(arr1,arr2)){
            return true;
        }
        return false;
    }
}