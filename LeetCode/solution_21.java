public class solution_21 {
    public static void main(String[] args) {

    }

    public static LinkNode mergeTwoLink(LinkNode headA, LinkNode headB) {
        if(headA == null || headB == null)
            return null;
        LinkNode newHeader = new LinkNode();
        LinkNode fence = newHeader;
        while(headA != null && headB != null) {
            if(headA.value > headB.value) {
                fence.next = headB;
                headB = headB.next;
                fence = fence.next;
            } else {
                fence.next = headA;
                headA = headA.next;
                fence = fence.next;
            }
        }

        if(headA == null && headB != null) {
            fence.next = headB;
        }
        if(headA != null && headB == null) {
            fence.next = headA;
        }

        return newHeader;
    }
}