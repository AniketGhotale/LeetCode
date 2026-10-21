class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int p = 0;
        int m = 0;
        int g = 0;
        int sum = 0;

        String s = garbage[0];
        while(s.indexOf('G') != -1){
            g++;
            s = s.substring(s.indexOf('G')+1);
        }
        for(int i=1; i<garbage.length; i++){
            sum += travel[i-1];
            s = garbage[i];
            while(s.indexOf('G') != -1){
                g += sum;
                g++;
                sum = 0;
                s = s.substring(s.indexOf('G')+1);
            }

        }

        sum = 0;
        s = garbage[0];
        while(s.indexOf('P') != -1){
            p++;
            s = s.substring(s.indexOf('P')+1);
        }
        for(int i=1; i<garbage.length; i++){
            sum += travel[i-1];
            s = garbage[i];
            while(s.indexOf('P') != -1){
                p += sum;
                p++;
                sum = 0;
                s = s.substring(s.indexOf('P')+1);
            }

        }
        sum = 0;

        s = garbage[0];
        while(s.indexOf('M') != -1){
            m++;
            s = s.substring(s.indexOf('M')+1);
        }

        for(int i=1; i<garbage.length; i++){
            sum += travel[i-1];
            s = garbage[i];
            while(s.indexOf('M') != -1){
                m += sum;
                m++;
                sum = 0;
                s = s.substring(s.indexOf('M')+1);
            }
            
        }

        return p+g+m;
    }
}