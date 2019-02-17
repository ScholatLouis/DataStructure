public class solution_24 {
    public static void main(String[] args) {
        solution_24 solution = new solution_24();
        int[] arr = new int[]{1,2};
        // LinkNode head = solution.generate(arr);
        // solution.print(head);
        // head = solution.swapPairs(head);
        // solution.print(head);
        LinkNode head = solution.generateWithoutHead(arr);
        solution.print(head);
        head = solution.swapPairs2(head);
        solution.print(head);
    }

    // 带表头的交换
    public LinkNode swapPairs(LinkNode head) {
        LinkNode fence = head.next;
        LinkNode prev = head;
        while(fence != null && fence.next != null) {
            LinkNode temp = fence.next;
            fence.next = fence.next.next;
            temp.next = fence;
            prev.next = temp;
            prev = fence;
            fence = fence.next;
        }
        return head;
    }

    public LinkNode swapPairs2(LinkNode head) {
        LinkNode newHeader = new LinkNode(0);
        newHeader.next = head;
        LinkNode prev = newHeader;
        LinkNode fence = newHeader.next;
        while(fence != null && fence.next != null) {
            LinkNode temp = fence.next;
            fence.next = fence.next.next;
            temp.next = fence;
            prev.next = temp;
            prev = fence;
            fence = fence.next;
        }
        return newHeader.next;
    }

    public LinkNode swapPairs3(LinkNode head) {
        return null;
    }

    public LinkNode swapPairsRecursion(LinkNode head, LinkNode newHeader) {
        return null;
    }

    // 不带表头的交换 不带表头可以自己创建一个newHeader然后将newHeader.next = head，最后返回newHeader.next
    // 这种在只有一个节点的时候直接返回null
    // 时间复杂度O(n) 空间复杂度O(n)
    public LinkNode swapPairsWithoutHead(LinkNode head) {
        LinkNode newHeader = new LinkNode(0);
        newHeader.next = head;
        LinkNode newFence = newHeader;
        LinkNode fence = head;
        while(fence != null && fence.next != null) {
            newFence.next = fence.next;
            fence.next = fence.next.next;
            newFence.next.next = fence;
            newFence = fence;
            fence = fence.next;
        }
        return newHeader.next;
    }

    // 带表头的链表
    public LinkNode generate(int[] arr) {
        LinkNode head = new LinkNode(0);
        LinkNode fence = head;
        for(int i = 0; i < arr.length; ++i) {
            fence.next = new LinkNode(arr[i]);
            fence = fence.next;
        }
        return head;
    }

    // 不带表头的链表
    public LinkNode generateWithoutHead(int[] arr) {
        LinkNode head = new LinkNode(arr[0]);
        LinkNode fence = head;
        for(int i = 1; i < arr.length; ++i) {
            fence.next = new LinkNode(arr[i]);
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