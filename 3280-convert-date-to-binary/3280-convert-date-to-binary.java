class Solution {
    public String convertDateToBinary(String date) {
        String res  = "";
        String[] nums = date.split("-");
        boolean flag = false;
        for(String num : nums){
            res = res + getbinary(Integer.parseInt(num));
            res = res + "-";
            
        }
        res = res.substring(0, res.length()-1);
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