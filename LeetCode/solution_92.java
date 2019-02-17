public class solution_92 {
    public static void main(String[] args) {
        solution_92 solution = new solution_92();
        int[] arr = new int[]{1,2,3,4,5};
        LinkNode head = solution.generate(arr);
        solution.print(head);
        head = solution.reverseBetween2(head, 1, 5);
        solution.print(head);
    }

    public LinkNode reverseBetween(LinkNode head, int m, int n) {
        LinkNode newHeader = new LinkNode(0);
        newHeader.next = head;
        int currenPos = 1;
        LinkNode pre = newHeader;
        while(currenPos < m) {
            ++currenPos;
            pre = pre.next;
        }
        LinkNode start = pre.next;
        LinkNode tail = pre;
        while(currenPos <= n) {
            ++currenPos;
            tail = tail.next;
        }
        tail = tail.next;
        pre.next = tail;
        currenPos = m;
        while(currenPos <= n) {
            LinkNode temp = start;
            start = start.next;
            temp.next = pre.next;
            pre.next = temp;
            ++currenPos;
        }
        return newHeader.next;
    }

    public LinkNode reverseBetween2(LinkNode head, int m, int n) {
        if(head == null) return head;
        LinkNode newHeader = new LinkNode(0);
        newHeader.next = head;
        LinkNode pre = newHeader;
        for(int i = 0; i < m-1; ++i) pre = pre.next;
        LinkNode start = pre.next;
        LinkNode then = start.next;
        for(int i = 0; i < n-m; ++i) {
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }
        return newHeader.next;
    }

    public LinkNode generate(int[] arr) {
        LinkNode head = new LinkNode(arr[0]);
        LinkNode fence = head;
        for(int i = 1; i < arr.length; ++i) {
            LinkNode temp = new LinkNode(arr[i]);
            fence.next = temp;
            fence = fence.next;
        }
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