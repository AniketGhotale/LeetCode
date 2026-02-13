class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int limit = 0;
        int line = 1;
        int res[] = new int[2];
        for(int i=0; i<s.length(); i++){
            int charWidth = widths[s.charAt(i) - 'a'];
            if(limit + charWidth <= 100){
                limit+=charWidth;
            }else{
                line++;
                limit = 0;
                limit+=charWidth;
            }
        }
        res[0] = line;
        res[1] = limit;
        return res;
    }
}