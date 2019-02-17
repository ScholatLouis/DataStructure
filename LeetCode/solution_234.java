public class solution_234 {
    public static void main(String args[]) {
        int[] arr = new int[]{1, 2, 3, 2, 1};
        LinkNode head = generate(arr);
        printLink(head);
        isPalindrome(head);
    }

    public static boolean isPalindrome(LinkNode head) {
        if(head == null) 
            return true;
        LinkNode fast = head;
        LinkNode slow = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null) {
            slow = slow.next;
        }
        slow = reverse(slow);
        printLink(slow);
        fast = head;
        while(slow != null) {
            if(slow.value != fast.value) {
                System.out.println(false);
                return false;
            }
            slow = slow.next;
            head = fast.next;
        }
        System.out.println(true);
        return true;
    }

    public static LinkNode reverse(LinkNode head) {
        LinkNode prev = null;
        while(head != null) {
            LinkNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static LinkNode generate(int[] arr) {
        if(arr.length == 0 || arr == null) 
            return null;
        LinkNode head = new LinkNode(arr[0]);
        LinkNode fence = head;
        for(int i = 1; i < arr.length; ++i) {
            LinkNode temp = new LinkNode(arr[i]);
            fence.next = temp;
            fence = fence.next;
        }
        return head;
    }

    public static void printLink(LinkNode head) {
        while(head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println();
    }
}