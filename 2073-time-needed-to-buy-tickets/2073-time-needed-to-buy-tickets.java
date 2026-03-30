class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int num = tickets[k];
        int count = 0;
        int idx = 0;
        int n = tickets.length;
        while(true){
            if(tickets[idx] != 0){
                count++;
                tickets[idx]--;
            }
            idx = (idx + 1) % n;
            if(tickets[k] == 0){
                return count;
            }
        }
        // for(int i=0; i<tickets.length; i++){
        //     if(num > tickets[i]){
        //         count += tickets[i];
        //     }else{
        //         count+= num;
        //     }
        // }
        
    }
}