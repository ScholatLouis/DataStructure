public class solution_237 {
    public static void main(String[] args) {

    }

    public static void deleteNode(LinkNode node) {
        node.value = node.next.value;
        node.next = node.next.next;
    }
}