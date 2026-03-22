class Solution {
    public String toGoatLatin(String sentence) {
        String arr[] = sentence.split(" ");
        String vowel = "aeiouAEIOU";
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(vowel.indexOf(arr[i].charAt(0)) != -1){
                arr[i] = arr[i] + "ma";
                arr[i] = appendstr(arr[i],i);
            }else{
                arr[i] = arr[i].substring(1) + arr[i].charAt(0) + "ma";
                //arr[i] = arr[i].concat("ma");
                arr[i] = appendstr(arr[i],i);
            }
        }
        String ans  = String.join(" ",arr);
        return ans;
    }
    String appendstr(String str, int n){
        for(int i=0; i<=n; i++){
            str = str + "a";
        }
        return str;
    }
}