class Solution {
    public String makeFancyString(String s) {
        if(s.length() < 3){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        int f = 0;
        int l = 1;
        sb.append(s.charAt(1));
        for(int i=2; i<s.length(); i++){
            if( (sb.charAt(f) == sb.charAt(l)) && sb.charAt(l) == s.charAt(i)){
                continue;
            }else{
                sb.append(s.charAt(i));
                l++;
                f++;
            }
        }
        return sb.toString();
    }
}