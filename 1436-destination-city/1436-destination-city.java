class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String,String> map = new HashMap<>();
        for(int i=0; i<paths.size(); i++){
            String src = paths.get(i).get(0);
            String dest = paths.get(i).get(1);
            if(map.containsKey(src)){
                map.remove(src);
            }else{
                map.put(src,"src");
            }
            if(map.containsKey(dest)){
                map.remove(dest);
            }else{
                map.put(dest,"dest");
            }
        }
        for(String key : map.keySet()){
            if(map.get(key) == "dest"){
                return key;
            }
        }
        return "";
    }
}