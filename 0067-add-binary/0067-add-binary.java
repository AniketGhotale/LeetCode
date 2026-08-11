class Solution {
    public String addBinary(String a, String b) {
        int la = a.length()-1;
        int lb = b.length()-1;
        int c = 0;
        StringBuilder sb = new StringBuilder();
        while(la >= 0 && lb >= 0){
            int na = a.charAt(la) - '0';
            int nb = b.charAt(lb) - '0';
            if( (na + nb + c) == 0){
                sb.append('0');
                c = 0;
            }else if( (na + nb + c) == 1){
                sb.append('1');
                c = 0;
            }else if( (na + nb + c) == 2){
                sb.append('0');
                c = 1;
            }else{
                sb.append('1');
                c = 1;
            }
            la--;
            lb--;
        }

        while(la >= 0){
            int na = a.charAt(la) - '0';
            if( (na + c) == 0){
                sb.append('0');
                c = 0;
            }else if( (na + c) == 1){
                sb.append('1');
                c = 0;
            }else{
                sb.append('0');
                c = 1;
            }
            la--;
        }

        while(lb >= 0){
            int nb = b.charAt(lb) - '0';
            if( (nb + c) == 0){
                sb.append('0');
                c = 0;
            }else if( (nb + c) == 1){
                sb.append('1');
                c = 0;
            }else{
                sb.append('0');
                c=1;
            }
            lb--;
        }

        if(c == 1){
            sb.append('1');
        }

        return sb.reverse().toString();
    }
}