public class solution_002 {
    public static void main(String[] args) { }

    public static LinkNode addTwoNumber(LinkNode l1, LinkNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        
        LinkNode head = new LinkNode(0);
        LinkNode fence = head;
        int carray = 0;
        
        while(l1 != null && l2 != null) {
            LinkNode temp = new LinkNode((l1.value + l2.value + carray) % 10);
            carray = (l1.value + l2.value) / 10;
            fence.next = temp;
            fence = fence.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null) {
            LinkNode temp = new LinkNode((l1.value + carray) % 10);
            carray = (l1.value + carray) / 10;
            fence.next = temp;
            fence = fence.next;
            l1 = l1.next;
        }

        while(l2 != null) {
            LinkNode temp = new LinkNode((l2.value + carray) % 10);
            carray = (l2.value + carray) / 10;
            fence.next = temp;
            fence = fence.next;
            l2 = l2.next;
        }

        if(carray != 0) {
            LinkNode temp = new LinkNode(1);
            fence.next = temp;
            fence = fence.next;
        }

        return head.next;
    }
}