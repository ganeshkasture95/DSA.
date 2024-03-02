package SimpleDSA.linkedLists;

public class Linked_List {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void displayrecursive(Node head) {

        if (head == null)
            return;
        displayrecursive(head.next);
        System.out.print(" " + head.data);

    }

    public static void display(Node head) {
        if (head == null)
            return;

        System.out.print(" " + head.data);
        display(head.next);

    }

    public static int length(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;

    }

    public static void main(String[] args) {

        Linked_List list = new Linked_List();

        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(6);
        Node d = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;

        display(a);
        System.out.println();
        displayrecursive(a);
        System.out.println();

        System.out.println("The length of the linked lst = " + length(a));
    }
}
