class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> map = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(map.contains(arr[i])){
                return true;
            }else if(arr[i]%2==0){
                map.add(arr[i]/2);
                map.add(arr[i]*2);
            }else{
                map.add(arr[i]*2);
            }
        }
        return false;
    }
}