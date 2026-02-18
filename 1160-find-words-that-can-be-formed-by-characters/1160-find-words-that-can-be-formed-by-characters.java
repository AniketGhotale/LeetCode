class Solution {
    public int countCharacters(String[] words, String chars) {
        int arr[] = new int[26];
        int sum = 0;
        for(int i=0; i<chars.length(); i++){
            arr[chars.charAt(i) - 'a']++;
        }
        for(String word : words){
            int arr2[] = new int[26];
            boolean flag = true;
            for(int i=0; i<word.length(); i++){
                arr2[word.charAt(i) - 'a']++;
                if(arr[word.charAt(i) - 'a'] < arr2[word.charAt(i) - 'a']){
                    flag = false;
                } 
            }
            if(flag){
                sum += word.length();
            }
        }
        return sum;
    }
}