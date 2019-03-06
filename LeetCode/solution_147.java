public class solution_147 {
    public static void main(String[] args) {}

    public static LinkNode insertionSortList(LinkNode head) {
        if(head == null) 
            return head;
        LinkNode dummy = new LinkNode(0);
        LinkNode compare = head;
        while(compare != null) {
            LinkNode fence = dummy;
            LinkNode store = compare;
            while(fence != null && fence.next != null && store.value > fence.value && store.value > fence.next.value) {
                fence = fence.next;
            }
            compare = compare.next;
            store.next = fence.next;
            fence.next = store;
        }
        return dummy.next;
    }
}