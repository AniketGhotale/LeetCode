class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        
        int res = 0;

        for(int i=0; i<nums.size(); i++){
            if(k == getbinary(i)){
                res += nums.get(i);
            }
        }
        return res;
    }
    
    int getbinary(int n){
        String binary = "";
        while(n > 0){
            binary = (n % 2) + binary;
            n/=2;
        }
        int count = getcount(binary);
        return count;
    }

    int getcount(String binary){
        int count = 0;
        for(int i=0; i<binary.length(); i++){
            if(binary.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
}