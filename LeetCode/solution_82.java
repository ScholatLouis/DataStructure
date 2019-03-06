public class solution_82 {
    public static void main(String[] args) {}

    public static LinkNode deleteDuplicates(LinkNode head) {
        if(head == null)
            return null;
        LinkNode dummy = new LinkNode(0);
        LinkNode fence = dummy;
        LinkNode prev = dummy;
        while(fence != null) {
            while(fence.next != null && fence.value == fence.next.value) {
                fence = fence.next;
            }
            if(prev.next == fence) {
                prev = prev.next;
                fence = fence.next;
            }
            if(prev.next != fence) {
                prev.next = fence.next;
            }
        }
        return dummy.next;
    }
}