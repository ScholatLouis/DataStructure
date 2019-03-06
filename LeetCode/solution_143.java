import java.util.Stack;

import com.sun.jndi.toolkit.url.Uri;

public class solution_143 {
    public static void main(String[] args) {}

    public static void reorderList(LinkNode head) {
        if(head == null || head.next == null)
            return ;
        
        LinkNode slow = head;
        LinkNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // set the tail to be null
        fast = slow.next;
        slow.next = null;
        slow = fast;
        LinkNode store = null;
        Stack<LinkNode> stack = new Stack<LinkNode>();
        while(slow != null) {
            stack.push(slow);
            slow = slow.next;
        }

        fast = head;
        while(!stack.isEmpty()) {
            store = stack.pop();
            store.next = fast.next;
            fast.next = store;
            fast = store.next;
        }
    }

    public static void reorderList2(LinkNode head) {
        if(head == null || head.next == null)
            return ;
        
        LinkNode fast = head;
        LinkNode slow = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        fast = slow.next;
        slow.next = null;
        slow = reverseList(fast);
        fast = head;
        while(slow != null) {
            LinkNode insertNode = slow;
            slow = slow.next;
            insertNode.next = fast.next;
            fast.next = insertNode;
            fast = insertNode.next;
        }
    }

    public static LinkNode reverseList(LinkNode head) {
        if(head == null)
            return head;
        LinkNode newHeader = null;
        LinkNode current = head;
        while(current != null) {
            LinkNode fence = current.next;
            current.next = newHeader;
            newHeader = current;
            current = fence;
        }
        return newHeader;
    }
}