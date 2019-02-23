public class Link {
    
    public class LinkNode {
        int value;
        LinkNode next;
        public LinkNode() {
            this.next = null;
        }
        public LinkNode(int val) {
            this.value = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 4, 6, 8};
        Link link = new Link();
        // LINK ADD DELETE REVERSE SERACH OPERATION
        LinkNode head = link.generateLink(arr);
        link.printLink(head);
        head = link.reverseLink(head);
        link.printLink(head);
        head = link.addByIndex(head, 3, 10);
        link.printLink(head);
        head = link.deleteByIndex(head, 3);
        link.printLink(head);
        head = link.deleteByTarget(head, 11);
        link.printLink(head);
        head = link.deleteByTarget(head, 8);
        link.printLink(head);
        System.err.println(link.searchByTarget(head, 12));
        System.out.println(link.searchByTarget(head, 4));

        // LINK LOOP
    }

    public LinkNode generateLink(int[] arr) {
        LinkNode head = new LinkNode();
        LinkNode fence = head;
        for(int num : arr) {
            LinkNode temp = new LinkNode(num);
            fence.next = temp;
            fence = fence.next;
        }
        return head.next;
    }

    public LinkNode deleteByIndex(LinkNode head, int index) {
        if(head == null || index <= 0)
            return null;
        LinkNode dummy = new LinkNode();
        dummy.next = head;
        LinkNode pre = dummy;
        while(index > 1) {
            pre = pre.next;
            --index;
        }
        LinkNode deleteNode = pre.next;
        pre.next = deleteNode.next;
        deleteNode = null;
        return dummy.next;
    }

    public LinkNode deleteByTarget(LinkNode head, int target) {
        if(head == null)
            return null;
        LinkNode dummy = new LinkNode();
        dummy.next = head;
        LinkNode prev = dummy, current = dummy.next;
        while(current != null) {
            if(current.value == target)
                break;
            prev = prev.next;
            current = current.next;
        }
        if(current != null) {
            prev.next = current.next;
            current = null;
        } else {
            System.out.println("NOT FOUND");
        }
        return dummy.next;
    }

    public LinkNode addByIndex(LinkNode head, int index, int target) {
        if(head == null || index <= 0) 
            return null;
        LinkNode dummy = new LinkNode();
        dummy.next = head;
        LinkNode current = dummy;
        while(index > 1) {
            current = current.next;
            --index;
        }
        LinkNode insertNode = new LinkNode(target);
        insertNode.next = current.next;
        current.next = insertNode;
        return dummy.next;
    }

    public boolean searchByTarget(LinkNode head, int target) {
        if(head == null)
            return false;
        LinkNode fence = head;
        while(fence != null) {
            if(fence.value == target)
                return true;
            fence = fence.next;
        }
        return false;
    }

    public LinkNode reverseLink(LinkNode head) {
        if(head == null)
            return null;
        LinkNode newHeader = new LinkNode();
        while(head != null) {
            LinkNode next = head.next;
            head.next = newHeader;
            newHeader = head;
            head = next;
        }
        return newHeader;
    }

    public void printLink(LinkNode head) {
        LinkNode fence = head;
        while(fence != null) {
            System.out.print(fence.value + " ");
            fence = fence.next;
        }
        System.out.println();
    }

    /**
     * check the link if there is a loop
     */
    public boolean LinkLoop(LinkNode head) {
        if(head == null) return false;
        LinkNode fast = head, slow = head;
        while(fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
                return true;
        }
        return false;
    }

    public LinkNode getLoopNode(LinkNode head) {
        if(head == null) return null;
        if(LinkLoop(head)) {
            LinkNode fast = head.next.next;
            LinkNode slow = head.next;
            while(fast != slow) {
                slow = slow.next;
                fast = fast.next.next;
            }
            fast = head;
            while(fast != slow) {
                fast = fast.next;
                slow = slow.next;
            }
            return fast;
        }
        return null;
    }

    public int getLoopLength(LinkNode head) {
        if(head == null) return 0;
        if(LinkNode(head)) {
            LinkNode fast = head.next.next;
            LinkNode slow = head.next;
            while(fast != slow) {
                slow = slow.next;
                fast = fast.next.next;
            }
            int length = 0;
            fast = fast.next;
            while(fast != slow) {
                fast = fast.next;
                ++length;
            }
            return length;
        }
        return 0;
    }
}