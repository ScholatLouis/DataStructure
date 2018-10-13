public class solution_876 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6};
        solution_876 solution = new solution_876();
        LinkNode head = solution.generateLink(nums);
        solution.middleNode(head);
    }

    public LinkNode generateLink(int[] nums) {
        LinkNode head = new LinkNode();
        LinkNode hence = head;
        for(int item : nums) {
            hence.next = new LinkNode(item);
            hence = hence.next;
        }
        hence.next = null;
        printLink(head);
        return head;
    }

    public void printLink(LinkNode head) {
        LinkNode hence = head.next;
        while(hence != null) {
            System.out.print(hence.value + " ");
            hence = hence.next;
        }
        System.out.println();
    }

    public LinkNode middleNode(LinkNode head) {
        int count = 1;
        int middleCount = 1;
        LinkNode hence = head.next;
        LinkNode middleNode = head.next;
        while(hence != null) {
            if(count % 2 == 0 || count/2 > middleCount) {
                middleNode = middleNode.next;
                ++middleCount;
            }
            hence = hence.next;
            ++count;
        }
        System.out.println(middleNode.value);
        return middleNode;
    }

    // middle就是一半 就是用两个指针一个走两步 一个走一步
    public LinkNode middleNode2(LinkNode head) {
        if(head == null) return head;
        LinkNode curr = head;
        LinkNode fast = head.next;
        while(fast != null) {
            curr = curr.next;
            fast = fast.next;
            if(fast != null) {
                fast = fast.next;
            }
        }

        return curr;
    }
}