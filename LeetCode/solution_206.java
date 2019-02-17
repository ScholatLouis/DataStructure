public class solution_206 {
    public static void main(String[] args) {
        solution_206 solution = new solution_206();
        int[] arr = new int[]{1,2,3,4,5};
        LinkNode head = solution.generateLinkedList(arr);
        solution.print(head);
        head = solution.reverseList(head);
        solution.print(head);
        head = solution.recursiveReverse(head, new LinkNode());
        solution.print(head);
    }

    // iterative solution
    public LinkNode reverseList(LinkNode head) {
        LinkNode newHeader = new LinkNode();
        LinkNode fence = null;
        while(head != null) {
            fence = head;
            head = head.next;
            fence.next = newHeader.next;
            newHeader.next = fence;
        }
        return newHeader.next;
    }

    // Error
    public LinkNode reverseList2(LinkNode head) {
        LinkNode newHeader = new LinkNode();
        LinkNode fence = null;
        // 错误地方：因为head的next被fence的next覆盖 导致head.next.next为null
        while(head != null) {
            fence = head;
            fence.next = newHeader.next;
            newHeader.next = fence;
            head = head.next;
        }
        return newHeader.next;
    }

    // recursive solution
    public LinkNode recursiveReverse(LinkNode head, LinkNode newHeader) {
        if(head != null) {
            LinkNode fence = head;
            head = head.next;
            fence.next = newHeader.next;
            newHeader.next =fence;
            return recursiveReverse(head, newHeader);
        } else {
            return newHeader.next;
        }
    }

    public LinkNode generateLinkedList(int[] arr) {
        LinkNode head = new LinkNode(0);
        LinkNode fence = head;
        for(int i = 0; i < arr.length; ++i) {
            fence.next = new LinkNode(arr[i]);
            fence = fence.next;
        }
        fence.next = null;
        return head;
    }

    public void print(LinkNode head) {
        LinkNode fence = head;
        while(fence != null) {
            System.out.print(fence.value + " ");
            fence = fence.next;
        }
        System.out.println();
    }
}