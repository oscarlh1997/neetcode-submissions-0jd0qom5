class LRUCache {
        int maxCapacity = 0;
        Map<Integer,Integer> map = new HashMap();
        LinkedList<Integer> leastUsed = new LinkedList();
        
    public LRUCache(int capacity) {
        maxCapacity = capacity;
        
    }
    
    public int get(int key) {
        if(map.containsKey(key))    {
            leastUsed.remove((Integer) key);
            leastUsed.addFirst(key);
            return map.get(key);
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            leastUsed.remove((Integer) key);
        } else if (map.size() >= maxCapacity) {
            int last = leastUsed.removeLast();
            map.remove(last);
        }
        map.put(key, value);
        leastUsed.addFirst(key);
    }
}