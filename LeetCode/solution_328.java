public class solution_328 {
    public static voi main(String[] args) {

    }

    public static LinkNode oddEvenList(LinkNode head) {
        if(head == null) return null;
        LinkNode evenHeader = new LinkNode();
        LinkNode evenFence = evenHeader;
        LinkNode oddFence = new LinkNode();
        oddFence = head;
        while(oddFence.next != null) {
            if(oddFence.value % 2 == 0) {
                evenFence.next = oddFence;
                evenHeader = evenFence.next;
                evenFence.next = oddFence.next.next;
            }
            oddFence = oddFence.next;
        }
        oddFence.next = evenHeader;
        return head;
    }

    public static LinkNode oddEventIndexList(LinkNode head) {
        if(head == null) return null;
        LinkNode evenHeader = head.next;
        LinkNode even = evenHeader;
        LinkNode odd = head;
        while(even != null && even.next != null) {
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }
        odd.next = evenHeader;
        return head;
    }
}