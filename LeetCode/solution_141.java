import java.util.Set;
import java.util.HashSet;

public class solution_141 {
    public static void main(String[] args) {
        solution_141 solution = new solution_141();
        int arr[] = new int[]{1,2,3,4,5};
        LinkNode head = solution.generate(arr);
        solution.print(head);
        System.out.println(solution.hasCrycle(head));
        LinkNode crycleHead = solution.generateCrycle(arr, 2);
        solution.printCrycle(crycleHead);
        System.out.println(solution.hasCrycle(crycleHead));
        System.out.println(solution.hasCrycle2(crycleHead));
    }

    public Boolean hasCrycle2(LinkNode head) {
        Set<String> nodeAddr = new HashSet<String>();
        // Set<LinkNode> nodeAddr = new HashSet<LinkNode>();
        LinkNode fence = head;
        while(fence != null) {
            if(nodeAddr.contains(fence.toString())) {
                return true;
            } else {
                nodeAddr.add(fence.toString());
            }
            fence = fence.next;
        }
        return false;
    }

    public Boolean hasCrycle(LinkNode head) {
        LinkNode fast = head;
        LinkNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }

    public LinkNode generate(int[] arr) {
        LinkNode head = new LinkNode(0);
        LinkNode fence = head;
        for(int i = 0; i < arr.length; ++i) {
            LinkNode temp = new LinkNode(arr[i]);
            fence.next = temp;
            fence = fence.next;
        }
        return head;
    }

    public LinkNode generateCrycle(int[] arr, int pos) {
        LinkNode head = generate(arr);
        LinkNode fence = head;
        while(pos != 0) {
            fence = fence.next;
            --pos;
        }
        LinkNode tail = fence;
        while(tail.next != null) {
            tail = tail.next;
        }
        tail.next = fence;
        return head;
    }

    public void printCrycle(LinkNode head) {
        LinkNode fast = head.next;
        LinkNode slow = head.next;
        while(fast != null && fast.next != null) {
            System.out.print(slow.value + " ");
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                System.out.println();
                return ;
            }
        }
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