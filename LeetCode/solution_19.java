public class solution_19 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        LinkNode head = generate(arr);
        print(head);
        head = removeNthNode(head, 1);
        print(head);
    }

    public static LinkNode removeNthNode(LinkNode head, int n) {
        if(head == null || n <= 0)
            return null;
        LinkNode dummyHead = new LinkNode();
        dummyHead.next = head;
        LinkNode fence = dummyHead;
        LinkNode kthNode = null;
        while(fence.next != null) {
            fence = fence.next;
            --n;
            if(n == 0) {
                kthNode = dummyHead;
            } else if(n < 0) {
                kthNode = kthNode.next;
            }
        }
        if(n > 0) {
            System.out.println("没有n个节点");
        } else {
            System.out.println(kthNode.value);
            kthNode.next = kthNode.next.next;
        }
        return dummyHead.next;
    }

    public static LinkNode generate(int[] arr) {
        if(arr == null || arr.length == 0) {
            return null;
        }
        LinkNode head = new LinkNode(0);
        LinkNode fence = head;
        for(int i = 0; i < arr.length; ++i) {
            LinkNode temp = new LinkNode(arr[i]);
            fence.next = temp;
            fence = fence.next;
        }
        return head.next;
    }

    public static void print(LinkNode head) {
        LinkNode fence = head;
        while(fence != null) {
            System.out.print(fence.value + " ");
            fence = fence.next;
        }
        System.out.println();
    }
}