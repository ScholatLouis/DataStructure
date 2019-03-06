public class solution_445 {
    public static void main(String[] args) {}

    public static LinkNode addTwoNumbers(LinkNode l1, LinkNode l2) {
        if(l1 == null && l2 == null) 
            return null;
        if(l1 == null) 
            return l2;
        if(l2 == null) 
            return l1;

        l1 = reverseList(l1);
        l2 = reverseList(l2);
        LinkNode newHeader = new LinkNode(0);
        LinkNode fence = newHeader;
        int carray = 0;
        while(l1 != null && l2 != null) {
            LinkNode store = new LinkNode((l1.value + l2.value + carray) % 10);
            carray = (l1.value + l2.value + carray) / 10;
            fence.next = store;
            fence = store;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null) {
            LinkNode store = new LinkNode((l1.value + carray) % 10);
            carray = (l1.value + carray) / 10;
            fence.next = store;
            fence = store;
            l1 = l1.next;
        }
        while(l2 != null) {
            LinkNode store = new LinkNode((l2.value + carray) % 10);
            carray = (l2.value + carray) / 10;
            fence.next = store;
            fence = store;
            l2 = l2.next;
        }
        if(carray != 0) {
            LinkNode store = new LinkNode(1);
            fence.next = store;
        }
        return reverseList(newHeader.next);
    }

    public static LinkNode reverseList(LinkNode head) {
        if(head == null) 
            return head;

        LinkNode newHeader = null;
        while(head != null) {
            LinkNode next = head.next;
            head.next = newHeader;
            newHeader = head;
            head = next;
        }
        return newHeader;
    }
}