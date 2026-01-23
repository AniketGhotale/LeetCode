class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        
        HashSet<Integer> aset = new HashSet<>();
        HashSet<Integer> bset = new HashSet<>();
        int res[] = new int[A.length];
        int count = 0;
        for(int i=0; i<A.length; i++){
            aset.add(A[i]);
            if(bset.contains(A[i])){
                count++;
            }
            bset.add(B[i]);
            if(aset.contains(B[i])){
                count++;
            }
            res[i] = count;
            // for(int j=0; j<aset.size(); i++){
            //     if( bset.contains(aset.get(j))){
            //         res[i]++;
            //     }
            // }
        }   

        return res;     
    }
}