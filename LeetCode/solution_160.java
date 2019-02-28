public class solution_160 {
    public static void main(String[] args) {

    }

    public static LinkNode getIntersectionNode(LinkNode headA, LinkNode headB) {
        if(headA == null || headB == null) return null;
        LinkNode l1 = headA, l2 = headB;
        if(getIntersection(headA, headB)) {
            while(l1 != l2) {
                l1 = l1 == null ? headB : l1.next;
                l2 = l2 == null ? headA : l2.next;
            }
            return l1;
        } else {
            return null;
        }
    }

    public static boolean getIntersection(LinkNode headA, LinkNode headB) {
        if(headA == null || headB == null)
            return false;
        LinkNode l1 = headA, l2 = headB;
        while(l1.next != null) {
            l1 = l1.next;
        }
        while(l2.next != null) {
            l2 = l2.next;
        }
        return l1 == l2;
    }
}