class Solution {
    public int similarPairs(String[] words) {
        int count = 0;
        HashSet<Character> set1 = new HashSet<>();
        int arr[] = new int[26];
        int arr2[] = new int[26];
        HashSet<Character> set2 = new HashSet<>();
        for(int i=0; i<words.length; i++){
            String word = words[i];
            for(int j=0; j<word.length();j++){
                arr[word.charAt(j) - 'a']++;
            }
            for(int j=i+1; j<words.length; j++){
                String curr = words[j];
                for(int k=0; k<curr.length(); k++){
                    arr2[curr.charAt(k) - 'a']++;
                }
                boolean flag = true;
                for(int k=0; k<26; k++){
                    if(arr[k] == 0 && arr2[k] != 0 || arr[k] != 0 && arr2[k] == 0){
                        flag = false;
                    }
                    arr2[k] = 0;
                }
                if(flag){
                    count++;
                }
            }
            for(int k=0; k<26; k++){
                arr[k] = 0;
            }
        }
        return count;
    }
}