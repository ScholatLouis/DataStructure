public class solution_25 {
    public static void main(String[] args) {

    }

    public LinkNode reverseKGroup(LinkNode head, int k) {
        LinkNode newHeader = new LinkNode(0);
        newHeader.next = head;
        LinkNode start = head;
        LinkNode end = head;
        int kgroup = k;
        while(end != null) {
            while(kgroup != 0 && end != null) {
                end = end.next;
                --kgroup;
            }
            head = swapKGroupPairs(newHeader, start, end, k);
            start = end;
            end = end.next;
            kgroup = k;
        }
        return newHeader;
    }

    public LinkNode swapKGroupPairs(LinkNode head, LinkNode start, LinkNode end) {
        while(start != end) {
            LinkNode fence = start;
            
        }
    }
}