class Solution {
    public boolean areNumbersAscending(String s) {
        int last = 0;
        int curr = 0;
        int n = s.length();
        String arr[] = s.split(" ");
        for(int i=0; i<arr.length; i++){
            String ch = arr[i];
            if(Character.isDigit(ch.charAt(0)) && Integer.parseInt(ch) <= last){
                return false;
            }
            if(Character.isDigit(ch.charAt(0))){
                last = Integer.parseInt(ch);
            }
            
        }
        return true;
    }
}