class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        boolean visited[] = new boolean[strs.length];
        for(int i=0; i<strs.length; i++){
            if(visited[i]){
                continue;
            }
            int arr[] = new int[26];
            List<String> l = new ArrayList<>();
            for(char ch : strs[i].toCharArray()){
                arr[ch - 'a']++;
            }
            visited[i] = true;;
            l.add(strs[i]);
            for(int j=i+1; j<strs.length; j++){
                if(visited[j]){
                    continue;
                }
                int arr2[] = new int[26];
                for(char ch : strs[j].toCharArray()){
                    arr2[ch - 'a']++;
                }
                if(Arrays.equals(arr,arr2)){
                    l.add(strs[j]);
                    visited[j] = true;
                }

            }
            list.add(l);
        }
        return list;
    }
}