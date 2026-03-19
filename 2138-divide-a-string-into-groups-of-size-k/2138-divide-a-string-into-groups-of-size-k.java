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
            sb.append(s.substring(f));
            // for(int i=f; i<n;i++){
            //     sb.append(s.charAt(i));
            // }
            for(int i=sb.length(); i<k; i++){
                sb.append(fill);
            }
            arr.add(sb.toString());
        }  
        String res[] = new String[arr.size()];
        for(int i=0; i<arr.size(); i++){
            res[i] = arr.get(i);
        }
        return res;
    }
}