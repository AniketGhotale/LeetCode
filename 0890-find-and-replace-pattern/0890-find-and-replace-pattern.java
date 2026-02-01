class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (word.length() != pattern.length()) continue;

            HashMap<Character, Character> pToW = new HashMap<>();
            HashMap<Character, Character> wToP = new HashMap<>();

            boolean match = true;

            for (int i = 0; i < word.length(); i++) {
                char p = pattern.charAt(i);
                char w = word.charAt(i);

                if (pToW.containsKey(p)) {
                    if (pToW.get(p) != w) {
                        match = false;
                        break;
                    }
                } else {
                    pToW.put(p, w);
                }

                if (wToP.containsKey(w)) {
                    if (wToP.get(w) != p) {
                        match = false;
                        break;
                    }
                } else {
                    wToP.put(w, p);
                }
            }

            if (match) {
                result.add(word);
            }
        }

        return result;
    }
}
