public class LinkList {

    private LinkedNode head = null;
    private LinkedNode current = null;
    
    public class LinkedNode {
        private int value;
        private LinkedNode next;
        public LinkedNode(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedNode addNode(int value) {
        LinkedNode node = new LinkedNode(value);
        if(head == null) {
            head = node;
            current = head;
        } else {
            current.next = node;
            current = current.next;
        }
        return head;
    }

    public void printLink() {
        if(head != null) {
            current = head;
            while(current != null) {
                System.out.println(current.value);
                current = current.next;
            }
        } else {
            System.out.println("Empty LinkList");
        }
    }

    public void reverse() {
        LinkedNode prev = null;
        while(head != null) {
            LinkedNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        head = prev;
    }

    public void delete(int value) {
        LinkedNode fence = head;
        while(fence != null) {
            if(fence.value == value) {
                if(fence.next == null) {
                    // can't delete the last node in the list
                    // TO DO
                    fence = null;
                } else {
                    fence.value = fence.next.value;
                    fence.next = fence.next.next;
                }
                break;
            } else {
                fence = fence.next;
            }      
        }
    }

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.addNode(1);
        linkList.addNode(3);
        linkList.addNode(5);
        linkList.addNode(7);
        linkList.printLink();
        linkList.reverse();
        System.out.println("reverse the linkList");
        linkList.printLink();
        System.out.println("delete");
        linkList.delete(5);
        linkList.printLink();
    }
}