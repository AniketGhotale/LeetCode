class Solution {
    public boolean isLongPressedName(String name, String typed) {

        int f = 0;
        int s = 0;
        char lastt = name.charAt(0);
        while(f < name.length() && s < typed.length()){
            if(name.charAt(f) == typed.charAt(s)){
                lastt = name.charAt(f);
                f++;
                s++;
                
            }else if(typed.charAt(s) != lastt){
                return false;
                
            }else{
                s++;
            }
            
        }
        char last = name.charAt(name.length()-1);

        while(s < typed.length()){
            if(typed.charAt(s) != last){
                return false;
            }
            s++;
        }
        return f == name.length();
        // if( (name.length() == typed.length()) && (name.indexOf(typed) == -1)){
        //     return false;
        // }
        // boolean flag = true;
        // int arr[] = new int[26];
        // int k=0;
        // int n=name.length();
        // for(int i=0; i<typed.length(); i++){
        //     arr[typed.charAt(i) - 'a']++;
        //     if(k < n){
        //         arr[name.charAt(k) - 'a']--;
        //         k++;
        //     }
        // }

        // for(int i=0; i<26; i++){
        //     if(arr[i] < 0){
        //         flag = false;
        //     }
        // }
        
        // return flag;
    }
}