class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<target.length; i++){
            set.add(target[i]);
        }
        for(int i=1; i<=n; i++){
            if(s.size() == target.length){
                return list;
            }
            if(set.contains(i)){
                list.add("Push");
                s.push(i);
            }else{
                list.add("Push");
                list.add("Pop");
            }
        }
        return list;
    }
}