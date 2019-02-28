import java.util.HashMap;

public class LRU {
    // 双向链表的节点定义
    public class Node {
        Node prev;
        Node next;
        int key;
        int value;
        Node(Integer key, Integer value) {
            this.key = key;
            this.value = value;
        }
    }

    // head & tail are dummy nodes
    Node head;      // oldest
    Node tail;      // yongest
    int capacity;   // cache容量
    HashMap<Integer, Node> map = new HashMap<Integer, Node>();
    // initial LRU cache
    public LRU(int capacity) {
       this.capacity = capacity; 
       head = new Node(null, null);
       tail = new Node(null, null);
       head.next = tail;
       tail.prev = head;
    }

    public int get(int k) {
        Node node = map.get(k);
        if(node != null) {
            n.prev.next = n.next;
            n.next.prev = n.prev;
            appendTail(n);
            return node.value;
        }
        return -1;
    }

    public void set(int key, int value) {
        Node node = map.get(key);
        if(node != null) {
            node.value = value;
            map.put(key, node);
            node.prev.next = node.next;
            node.next.prev = node.prev;
            appendTail(node);
            return ;
        } else if(map.size() == capacity) {
            Node temp = head.next;
            head.next = temp.next;
            head.next.prev = head;
            map.remove(temp.key);
        }
        node = new Node(key, value);
        appendTail(node);
        map.put(key, node);
    }

    private void appendTail(Node node) {
        
    }
}