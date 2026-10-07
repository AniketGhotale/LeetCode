class Solution {
    public String sortVowels(String s) {
        char arr[] = s.toCharArray();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if("aeiouAEIOU".indexOf(s.charAt(i)) != -1){
                list.add( (int)s.charAt(i));
            }
        }
        Collections.sort(list);
        int k = 0;
        for(int i=0; i<arr.length; i++){
            if("aeiouAEIOU".indexOf(arr[i]) != -1){
                arr[i] = (char) list.get(k).intValue();
                k++;
            }
        }
        return new String(arr);
    }
}