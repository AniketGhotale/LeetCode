class LRUCache {
    int count  = 0;
    int max;
    Queue<Integer> q = new LinkedList<>();
    HashMap<Integer,Integer> map = new HashMap<>();
    public LRUCache(int capacity) {
        max = capacity;
    }
    
    public int get(int key) {
        if(map.get(key) == null){
            return -1;
        }else{
            int keyy = map.get(key);
            q.remove(key);
            q.add(key);
            return keyy;
        } 
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            map.put(key,value);
            q.remove(key);
            q.add(key);
            return;
        }
        if(count < max){
            q.add(key);
            map.put(key,value);
            count++;
        }else{
            int keyy = q.poll();
            map.remove(keyy);
            map.put(key,value);
            q.add(key);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */