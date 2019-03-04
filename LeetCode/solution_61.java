public class solution_61 {
    public static void main(String[] args) {}

    public static LinkNode rotateList(LinkNode head, int k) {
        if(head == null || k <= 0)
            return head;
        LinkNode fence = head;
        int length = 0;
        while(fence != null) {
            fence = fence.next;
            ++length;
        }

        if(length <= k) 
            k = k % length;
        
        fence = head;
        while(length - k != 1) {
            ++k;
            fence = fence.next;
        }

        LinkNode reverseHead = fence.next;
        fence.next = null;
        return reverseList(head, reverseHead);
    }

    public static LinkNode reverseList(LinkNode head, LinkNode reverseHead) {
        if(reverseHead == null)
            return head;
        LinkNode fence = reverseHead;
        while(fence != null)
            fence = fence.next;
        fence.next = head;
        return reverseHead;
    }
}