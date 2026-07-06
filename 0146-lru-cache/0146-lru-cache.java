class LRUCache {
    HashMap<Integer,Node> hm = new HashMap<>();
    Node head = new Node(0, 0);
    Node tail = new Node(0, 0);
    int capacity;

    class Node{
        int key, val;
        Node prev, next;
        
        Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(hm.containsKey(key)){
            Node node = hm.get(key);
            remove(node);
            insertToFront(node);
            return node.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        Node node = new Node(key, value);
        if(hm.containsKey(key)){
            remove(hm.get(key));
            hm.put(key, node);
            insertToFront(node);
        }else{
            if(capacity>hm.size()){
                insertToFront(node);
                hm.put(key, node);
            }else{
                hm.remove(tail.prev.key);
                remove(tail.prev);
                hm.put(key, node);
                insertToFront(node);
            }
        }
    }

    private void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insertToFront(Node node){
        Node temp = head.next;
        node.next = temp;
        node.prev = head;
        head.next = node;
        temp.prev = node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */