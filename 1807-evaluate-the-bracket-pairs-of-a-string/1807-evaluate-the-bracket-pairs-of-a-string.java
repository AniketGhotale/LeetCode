class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        
        String arr[] = s.split("\\(");
        HashMap<String, String> map = new HashMap<>();
        for(int i=0; i<knowledge.size(); i++){
            map.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }
        for(int i=0; i<arr.length; i++){
            int idx = arr[i].indexOf(')');
            if(idx == -1){
                continue;
            }else{
                String str = arr[i].substring(0,idx);
                String ext = arr[i].substring(idx+1);
                arr[i] = map.getOrDefault(str,"?") + ext;
                // if(map.containsKey(str)){
                //     String rep = map.get(str);
                //     String ext = arr[i].substring(idx+1);
                //     arr[i] = rep + ext;
                // }else{
                //     String ext = arr[i].substring(idx+1);
                //     arr[i] = "?" + ext;
                // }
            }
        }
        String res = String.join("",arr);
        return res;
    }
}