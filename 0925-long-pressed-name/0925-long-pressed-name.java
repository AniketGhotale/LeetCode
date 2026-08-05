class Solution {
    public boolean isLongPressedName(String name, String typed) {

        int f = 0;
        int s = 0;
        char last = name.charAt(0);
        while(f < name.length() && s < typed.length()){
            if(name.charAt(f) == typed.charAt(s)){
                last = name.charAt(f);
                f++;
                s++;
                
            }else if(typed.charAt(s) != last){
                return false;
                
            }else{
                s++;
            }
            
        }
        

        while(s < typed.length()){
            if(typed.charAt(s) != last){
                return false;
            }
            s++;
        }
        return f == name.length();
        
    }
}