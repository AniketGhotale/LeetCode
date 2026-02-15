class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> winnerlist = new ArrayList<>();
        List<Integer> losserlist = new ArrayList<>();
        HashMap<Integer,Integer> winner = new HashMap<>();
        HashMap<Integer,Integer> losser = new HashMap<>();
        for(int i=0; i<matches.length; i++){
            int win = matches[i][0];
            int loss = matches[i][1];
            winner.put(win,winner.getOrDefault(win,0)+1);
            losser.put(loss,losser.getOrDefault(loss,0)+1);
        }
        for(int win : winner.keySet()){
            if(!losser.containsKey(win)){
                winnerlist.add(win);
            }
        }
        for(int lose : losser.keySet()){
            if(losser.get(lose) == 1){
                losserlist.add(lose);
            }
        }
        Collections.sort(winnerlist);
        Collections.sort(losserlist);
        list.add(winnerlist);
        list.add(losserlist);
        return list;
    }
}