class Solution {
    public String convertDateToBinary(String date) {
        String res  = "";
        String num = "";
        boolean flag = false;
        for(int i=0; i<date.length(); i++){
            if(date.charAt(i) == '-'){
                if(flag){
                    res = res  + "-" + getbinary(Integer.parseInt(num));
                    num = "";
                }else{
                    res = res   + getbinary(Integer.parseInt(num));
                    num = "";
                    flag = true;
                }
                
            }else{
                num = num + date.charAt(i);
            }
        }
        res = res  + "-" + getbinary(Integer.parseInt(num));
        return res;
    }

    public String getbinary(int n){
        String binary = "";
        while(n > 0){
            binary = (n % 2) + binary;
            n/=2;
        }
        return binary;
    }
}