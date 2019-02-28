public class solution_83 {
    public static void main(String[] args) {

    }

    public static LinkNode deleteDuplicates(LinkNode head) {
        if(head == null)
            return null;
        LinkNode dummy = new LinkNode();
        dummy.next = head;
        LinkNode pre = dummy;
        LinkNode fence = dummy.next;
        while(fence != null) {
            if(pre.value == fence.value) {
                LinkNode deleteNode = fence;
                pre.next = fence.next;
                deleteNode = null;
                fence = fence.next;
            } else {
                if(fence != null) {
                    pre = pre.next;
                    fence = fence.next;
                }
            }
        }
        return dummy.next;
    }

    public static LinkNode deleteDuplicates2(LinkNode head) {
        if(head == null) return null;
        LinkNode fence = head.next;
        LinkNode pre = head;
        while(fence != null) {
            if(fence.value == pre.value) {
                pre.next = fence.next;
                fence = fence.next;
            } else {
                fence = fence.next;
                pre = pre.next;
            }
        }
        return head;
    }
}