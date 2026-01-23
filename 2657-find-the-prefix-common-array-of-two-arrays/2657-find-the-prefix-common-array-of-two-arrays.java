class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        
        HashSet<Integer> aset = new HashSet<>();
        HashSet<Integer> bset = new HashSet<>();
        int res[] = new int[A.length];
        
        for(int i=0; i<A.length; i++){
            aset.add(A[i]);
            // if(bset.contains(A[i])){
            //     count++;
            // }
            bset.add(B[i]);
            // if(aset.contains(B[i])){
            //     count++;
            // }
            int count = 0;
            for (int val : aset) {
                if (bset.contains(val)) {
                    count++;
                }
            }
            res[i] = count;
        }   

        return res;     
    }
}