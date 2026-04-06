class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int res[] = new int[2];
        int suma = 0;
        int sumb = 0;

        for(int i=0; i<aliceSizes.length; i++){
            suma += aliceSizes[i];
        }

        for(int i=0; i<bobSizes.length; i++){
            sumb += bobSizes[i];
        }

        int diff = (suma - sumb) /2;
        // for(int i=0; i<aliceSizes.length; i++){
        //     for(int j=0; i<bobSizes.length; j++){
        //         if(aliceSizes[i] - bobSizes[j] == diff){
        //             return new int[]{aliceSizes[i], bobSizes[j]};
        //         }
        //     }
        // }
        for (int x : aliceSizes) {
            for (int y :bobSizes) {
                if (x - y == diff) {
                    return new int[]{x, y};
                }
            }
        }
        return new int[0];
    }
}