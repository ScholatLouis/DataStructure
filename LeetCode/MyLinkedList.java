public class MyLinkedList {    
    class ListNode {
        int val;
        ListNode next;
        ListNode(int value) {
            this.val = value;
            this.next = null;
        }
    }
    
    ListNode head = null;

    /** Initialize your data structure here. */
    public MyLinkedList() {
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index < 0)
            return -1;
        ListNode fence = head;
        while(index > 0) {
            fence = fence.next;
            --index;
        }
        return fence.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode store = new ListNode(val);
        if(head == null)
            head = store;
        else {
            store.next = head;
            head = store;
        }
        
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode store = new ListNode(val);
        if(head == null) {
            head = store;
        } else {
            ListNode fence = head;
            while(fence != null) {
                fence = fence.next;
            }
            fence.next = store;
        }
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index < 0)
            return ;
        ListNode store = new ListNode(val);
        if(index == 0) {
            store.next = head;
            head = store;
        } else {
            ListNode prev = head;
            while(index > 0) {
                prev = prev.next;
                --index;
            }
            store.next = prev.next.next;
            prev.next = store;
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index < 0) 
            return ;
        if(index == 0) {
            head = head.next;
        } else {
            ListNode prev = head;
            while(index > 1) {
                prev = prev.next;
                --index;
            }
            prev.next = prev.next.next;
        }
    }

    public void print(LinkNode head) {
        LinkNode fence = head;
        while(fence != null) {
            System.out.print(fence.value + " ");
            fence = fence.next;
        }
    }
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        // myLinkedList.print(head);
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */