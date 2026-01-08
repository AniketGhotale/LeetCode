class Solution {
    public boolean isPalindrome(int x) {
        int org = x;
        int newnum=0, last;

        while( x > 0){
            last = x % 10 ;
            newnum = newnum * 10 + last;
            x = x / 10;
        }
        
        if(org == newnum){
            return true;
        }else{
            return false;
        }
    }
}