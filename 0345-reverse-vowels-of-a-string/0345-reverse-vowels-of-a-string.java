class Solution {
    public String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        int i=0;
        int l = s.length()-1;
        while(i < l){
            while("aeiouAEIOU".indexOf(arr[i]) == -1 && i < l){
                i++;
            }
            while("aeiouAEIOU".indexOf(arr[l]) == -1 && i < l){
                l--;
            }
            char temp = arr[i];
            arr[i] = arr[l];
            arr[l] = temp;
            i++;
            l--;
        }
        return new String(arr);
    }
}