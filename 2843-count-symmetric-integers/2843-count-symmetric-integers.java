class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i=low; i<=high; i++){
            String s = String.valueOf(i);
            int n = s.length();
            if(n%2==1){
                continue;
            }
            int f = 0;
            int l = 0;
            for(int j=0; j<n/2; j++){
                f += s.charAt(j) - '0';
            }
            for(int j=n/2; j<n; j++){
                l += s.charAt(j) - '0';
            }
            if(f == l){
                count++;
            }
        }
        return count;
    }
}