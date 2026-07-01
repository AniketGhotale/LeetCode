import java.util.*;
import java.lang.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            mp.put(a, mp.getOrDefault(a, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char b = t.charAt(i);
            if (!mp.containsKey(b)) {
                return false;
            }

            mp.put(b , mp.get(b) -1);

            if(mp.get(b)  < 0){
                return false;
            }

        }
        return true;
    }
}
