import java.util.Set;
import java.util.HashSet;

public class solution_142 {
    public static void main(String[] args) {
        solution_142 solution = new solution_142();
        int arr[] = new int[]{1,2,3,4,5};
        LinkNode head = solution.generate(arr);
        solution.print(head);
        System.out.println(solution.deleteCrycle(head));
        LinkNode crycleHead = solution.generateCrycle(arr, 2);
        System.out.println(solution.deleteCrycle(crycleHead));
        System.out.println(solution.deleteCrycleByFloyd(crycleHead));
    }

    public LinkNode deleteCrycle(LinkNode head) {
        Set<LinkNode> linkAddr = new HashSet<LinkNode>();
        LinkNode fence = head;
        while(fence != null) {
            if(linkAddr.contains(fence)) {
                return fence;
            } else {
                linkAddr.add(fence);
                fence = fence.next;
            }
        }
        return null;
    }

    // Floyd判圈算法：环的长度、环的起始点、是否有环
    public LinkNode hasCrycle(LinkNode head) {
        LinkNode fast = head;
        LinkNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                return slow;
            }
        }
        return null;
    }

    public LinkNode deleteCrycleByFloyd(LinkNode head) {
        LinkNode meet = hasCrycle(head);
        if(meet == null) {
            return null;
        } else {
            LinkNode slow = head;
            while(slow != meet) {
                slow = slow.next;
                meet = meet.next;
            }
            return slow;
        }
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
        LinkNode fence = head.next;
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

    public void print(LinkNode head) {
        LinkNode fence = head;
        while(fence != null) {
            System.out.print(fence.value + " ");
            fence = fence.next;
        }
        System.out.println();
    }
}