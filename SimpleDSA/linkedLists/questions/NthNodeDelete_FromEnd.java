package SimpleDSA.linkedLists.questions;

/**
 * NthNodeDelete_FromEnd
 */

public class NthNodeDelete_FromEnd {

    public static class Node {

        int data;
        Node next;

        Node(int value) {
            this.data = value;
            this.next = null;
        }
    }

    public static void display(Node head) {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void NthNodeFrom_end_delete(Node head, int n) {

        // Removing the Nth node feom the last with only a single traversal
        // this is called the tortle rabit technique

        Node fast = head;
        Node slow = head;

        for (int i = 0; i <= n - 1; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            head = head.next;
            return;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

    }

    public static Node saparate(Node head) {

        Node temp = head;

        Node odd = new Node(0);
        Node todd = odd;

        Node even = new Node(10);
        Node teven = even;

        while (temp != null) {
            if (temp.data % 2 != 0) {
                todd.next = temp;
                temp = temp.next;
                todd = todd.next;
            } else {

                teven.next = temp;
                todd.next = todd.next.next;
                temp = temp.next;
                teven = teven.next;
            }
            todd.next = even.next;
        }
        return head;
    }

    public static void baz(Node head) {
        if (head == null)
            return;
        baz(head.next.next);
        System.out.print(head.data + " ");
    }

    public static void main(String[] args) {

        Node a = new Node(206);
        Node b = new Node(250);
        Node c = new Node(420);
        Node d = new Node(200);
        Node e = new Node(99);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        NthNodeFrom_end_delete(a, 4);

        display(a);
        System.out.println();
        System.out.println("after Baz");

        baz(a);

    }
}