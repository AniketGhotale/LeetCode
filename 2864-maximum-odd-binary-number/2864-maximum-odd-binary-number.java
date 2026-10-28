class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder sb = new StringBuilder();
        int o = 0;
        int z = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '0'){
                z++;
            }else{
                o++;
            }
        }
        for(int i=0; i<o-1; i++){
            sb.append(1);
        }
        for(int i=0; i<z; i++){
            sb.append(0);
        }
        sb.append(1);
        return sb.toString();
    }
}