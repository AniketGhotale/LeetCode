class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        Queue<String> q = new LinkedList<>();
        HashSet<String> v = new HashSet<>();
        q.add(startGene);
        v.add(startGene);
        int bcount = 0;

        while(!q.isEmpty()){
            
            int size = q.size();
            while(size > 0){
                String curr = q.remove();
                if(endGene.equals(curr)){
                    return bcount;
                }
                for(int i=0; i<bank.length; i++){
                    if( !v.contains(bank[i]) && issame(curr, bank[i]) ){
                        q.add(bank[i]);
                        v.add(bank[i]);
                        
                    }
                }
                size--;
            }
            
            bcount++;
        }
        return -1;
    }

    boolean issame(String a, String b){
        int count = 0;
        for(int i=0; i<8; i++){
            if(a.charAt(i) != b.charAt(i)){
                count++;
            }
        }
        return count == 1;
    }
}