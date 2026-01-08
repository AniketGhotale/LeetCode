class Solution {
    public int reverse(int x) {
        int org = x;
        int rev = 0;

        
    if(x < 0){
        x = -x;
    }
        while(x>0){
            int last = x %10;
            x = x / 10;
            if (rev > Integer.MAX_VALUE / 10 || 
               (rev == Integer.MAX_VALUE / 10 && last > 7))
                return 0;

            if (rev < Integer.MIN_VALUE / 10 || 
               (rev == Integer.MIN_VALUE / 10 && last < -8))
                return 0;
            rev = rev * 10 + last;
            
        }
        if(org < 0){
            return -rev;
        }else{
            return rev;
        }
        
        

    }
}