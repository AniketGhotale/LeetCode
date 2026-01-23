class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int res[] = new int[friends.length];
        int top=0;
        for(int i=0; i<order.length; i++){
            for(int j=0; j<friends.length; j++){
                if(order[i] == friends[j]){
                    res[top] = friends[j];
                    top++;
                    break;
                }
            }
        }

        return res;
    }
}