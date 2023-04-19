public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6};
        Node head = null;
        for (int i = list.length - 1; i >= 0; i--) {
            head = new Node(list[i], head);
        }
        System.out.println("Первоначальный список:");
        printList(head);

        head = reverse(head);
        System.out.println("Перевернутый список:");
        printList(head);
    }

    public static void printList(Node head) {
        Node prt = head;
        while (prt != null) {
            System.out.print(prt.data + " —> ");
            prt = prt.next;
        }
        System.out.println("null");
    }

    public static Node reverse(Node head) {
        Node previous = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}
