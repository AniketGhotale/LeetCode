class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int count = 0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0;
        int j=0;
        while(i<players.length && j<trainers.length){
            if(players[i] <= trainers[j]){
                count++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        // for(int i=0; i<players.length; i++){
        //     for(int j=0; j<trainers.length; j++){
        //         if(players[i] <= trainers[j]){
        //             players[i] = -1;
        //             trainers[j] = -1;
        //             count++;
        //             break;
        //         }
        //     }
        // }
        return count;
    }
}