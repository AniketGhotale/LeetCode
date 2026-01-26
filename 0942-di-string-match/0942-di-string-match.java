class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int res[] = new int[n+1];
        int first = 0;
        int last = n;
        for(int i=0; i<n-1;i++){
            if(s.charAt(i) == 'I'){
                res[i] = first;
                first++;
            }else{
                res[i] = last;
                last--;
            }
        }
        if(s.charAt(n-1) == 'I'){
            res[n-1] = first;
            res[n] = last;
        }else{
            res[n-1] = last;
            res[n] = first;
        }
        return res;
    }
}