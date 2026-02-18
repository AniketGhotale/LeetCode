class Solution {
    public String addSpaces(String s, int[] spaces) {
        //int n = s.length();
        int start = 0;
        StringBuilder res = new StringBuilder();
        //String res = "";
        for(int i=0; i<spaces.length; i++){
            //res += s.substring(start,spaces[i]) + " ";
            res.append(s.substring(start,spaces[i]) + " ");
            start = spaces[i];
        }
        res.append(s.substring(start));
        // s.slice(s.charAt(spaces[i]));
        return res.toString();
    }
}