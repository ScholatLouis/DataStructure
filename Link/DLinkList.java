public class DLinkList {

    private DLinkNode head = null;
    private DLinkNode current = null;

    public class DLinkNode {
        private int value;
        private DLinkNode prev, next;
        public DLinkNode(int value) {
            this.value = value;
            this.prev = this.next = null;
        }
    }

    public void addNode(int value) {
        DLinkNode node = new DLinkNode(value);
        if(head == null) {
            head = node;
            current = head;
        } else {
            current.next = node;
            current = node.prev;
            current = node;
        }
    }

    public void reverse() {
        DLinkNode next = null;
        DLinkNode current = head;
        while(head != null) {
            System.out.println(head.value);
            next = head.next;
            head = next;
            head.next = current;
            current.prev = head;
            current = head;
        }
        head = current;
    }

    public void printLink() {
        DLinkNode fence = head;
        while(fence != null) {
            System.out.println(fence.value);
            fence = fence.next;
        }
    }

    public static void main(String[] args) {
        System.out.println("DLinkList");
        DLinkList dLinkList = new DLinkList();
        dLinkList.addNode(1);
        dLinkList.addNode(3);
        dLinkList.addNode(5);
        dLinkList.addNode(7);
        dLinkList.printLink();
        System.out.println("reverse");
        dLinkList.reverse();
        dLinkList.printLink();
    }
}