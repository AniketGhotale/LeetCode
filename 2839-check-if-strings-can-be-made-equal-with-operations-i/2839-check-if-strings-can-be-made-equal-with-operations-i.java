class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        StringBuilder sb = new StringBuilder(s1);
        char temp1 = sb.charAt(0);
        sb.setCharAt(0, sb.charAt(2));
        sb.setCharAt(2,temp1);
        if(sb.toString().equals(s2)){
            return true;
        }
        temp1 = sb.charAt(1);
        sb.setCharAt(1,sb.charAt(3));
        sb.setCharAt(3,temp1);
        if(sb.toString().equals(s2)){
            return true;
        }
        sb = new StringBuilder(s1);
        temp1 = sb.charAt(1);
        sb.setCharAt(1,sb.charAt(3));
        sb.setCharAt(3,temp1);
        if(sb.toString().equals(s2)){
            return true;
        }
        return false;     
    }
}