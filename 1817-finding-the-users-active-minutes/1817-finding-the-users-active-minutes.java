class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer,HashSet<Integer>> map = new HashMap<>();
        int res[] = new int[k];
        for(int i=0; i<logs.length; i++){
            int user = logs[i][0];
            int minute = logs[i][1];
            map.putIfAbsent(user, new HashSet<>());
            map.get(user).add(minute);
        }
        for(int key : map.keySet()){
            res[map.get(key).size() - 1]++;
        }
        return res;
    }
}