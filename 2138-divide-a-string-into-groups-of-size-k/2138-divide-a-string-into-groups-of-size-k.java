class Solution {
    public String[] divideString(String s, int k, char fill) {
        ArrayList<String> arr = new ArrayList<>();
        int n = s.length();
        int f =0;
        int l = k;
        for(int i=0; l<=s.length(); i+=k){
            arr.add(s.substring(f,l));
            f = l;
            l+=k;
        }
        if(l > n && f < n){
            StringBuilder sb = new StringBuilder();
            for(int i=f; i<n;i++){
                sb.append(s.charAt(i));
            }
            for(int i=sb.length(); i<k; i++){
                sb.append(fill);
            }
            arr.add(sb.toString());
        }
        // if(k%s.length() == 0){
        //     int n = k/s.length();
        //     int f = 0;
        //     int l = k;
        //     for(int i=0; l<s.length(); i+=k){
        //         arr.add(s.substring(f,l));
        //         f = l;
        //         l+=k;
        //     }
        // }else{
        //     int n = k/s.length();
        //     int f = 0;
        //     int l = k;
        //     for(int i=0; l<s.length(); i+=k){
        //         arr.add(s.substring(f,l));
        //         f = l;
        //         l+=k;
        //     }
        //     String str = "";
        //     for(int i=f;i<s.length(); i++){
        //         str = str + s.charAt(i);
        //     }
        //     for(int i=str.length()-1; i<k; i++){
        //         str = str + fill;
        //     }
        //     arr.add(str);
        // }   
        String res[] = new String[arr.size()];
        for(int i=0; i<arr.size(); i++){
            res[i] = arr.get(i);
        }
        return res;
    }
}