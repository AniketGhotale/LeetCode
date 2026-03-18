class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=left; i<=right; i++){
            if(isSelfdivide(i)){
                list.add(i);
            }
        }
        return list;
    }
    boolean isSelfdivide(int n){
        boolean flag = true;
        int num = n;
        while(num > 0){
            int last = num%10;
            if(last == 0){
                return false;
            }
            if(n%last != 0){
                return false;
            }
            num/=10;
        }
        return true;
    }
}