public class solution_86 {
    public static void main(String[] args) {}

    public static LinkNode partition(LinkNode head, int target) {
        if(head == null)
            return head;
        LinkNode dummy = new LinkNode(0);
        dummy.next = head;
        LinkNode fence = dummy;
        LinkNode lthead = new LinkNode(0);
        LinkNode ltfence = lthead;
        while(fence != null) {
            if(fence.next != null && fence.next.value == target) {
                ltfence = fence.next;
                ltfence = ltfence.next;
                fence.next = fence.next.next;
            } else {
                fence = fence.next;
            }
        }
        ltfence.next = dummy.next;
        return ltfence.next;
    }
}