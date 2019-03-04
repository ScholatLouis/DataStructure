public class solution_203 {
    public static void main(String[] args) {}

    public static LinkNode removeElements(LinkNode head, int target) {
        if(head == null)
            return head;
        
        LinkNode dummy = new LinkNode(0);
        dummy.next = head;
        LinkNode prev = dummy;
        LinkNode fence = head;
        while(fence != null) {
            if(fence.value == target) {
                prev.next = fence.next;
                fence = fence.next;
            } else {
                fence = fence.next;
                prev = prev.next;
            }
        }

        return dummy.next;
    }
}