class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0;
        int res = 0;
        for(String row : bank){
            int count = 0;
            for(char ch : row.toCharArray()){
                if(ch == '1'){
                    count++;
                }
            }
            if(count > 0){
                res+=(prev*count);
                prev = count;
            }
        }
        return res;
    }
}