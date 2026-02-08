class Solution {
    public String[] findWords(String[] words) {
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";
        List<String> list = new ArrayList<>();
        for(String s : words){
            String org = s;
            s = s.toLowerCase();
            if(s1.indexOf(s.charAt(0)) != -1){
                for(int i=0; i<s.length(); i++){
                    if(s1.indexOf(s.charAt(i)) == -1){
                        break;
                    }
                    if(i==s.length()-1){
                        list.add(org);
                    }
                }
            }else if(s2.indexOf(s.charAt(0)) != -1){
                for(int i=0; i<s.length(); i++){
                    if(s2.indexOf(s.charAt(i)) == -1){
                        break;
                    }
                    if(i==s.length()-1){
                        list.add(org);
                    }
                }
            }else{
                for(int i=0; i<s.length(); i++){
                    if(s3.indexOf(s.charAt(i)) == -1){
                        break;
                    }
                    if(i==s.length()-1){
                        list.add(org);
                    }
                }
            }
        }
        String res[] = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}