class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> list = new ArrayList<>();
        //Stack<Integer> s = new Stack<>();
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<target.length; i++){
            set.add(target[i]);
        }
        for(int i=1; i<=n; i++){
            if(count == target.length){
                return list;
            }
            if(set.contains(i)){
                list.add("Push");
                count++;
                //s.push(i);
            }else{
                list.add("Push");
                list.add("Pop");
            }
        }
        return list;
    }
}