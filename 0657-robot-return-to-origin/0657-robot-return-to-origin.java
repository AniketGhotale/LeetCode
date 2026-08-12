class Solution {
    public boolean judgeCircle(String moves) {
        int h = 0;
        int v = 0;
        for(int i=0; i<moves.length(); i++){
            char ch = moves.charAt(i);
            if(ch == 'U'){
                h++;
            }else if( ch == 'D'){
                h--;
            }else if(ch == 'L'){
                v--;
            }else{
                v++;
            }
        }
        return (v==0 && h==0);
    }
}