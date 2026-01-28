class Solution {
    public int gcdOfOddEvenSums(int n) {
        int a=n*n;
        int b=n*n + n;
        int ans=gcd(a,b);
        return ans;
    }
    public int gcd(int a,int b){
        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }
        while(a!=b){
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }
        return a;
    }
}
