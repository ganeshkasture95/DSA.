package SimpleDSA.linkedLists.questions;

/**
 * NthNodeFromEnd
 */
public class NthNodeFromEnd {

    public static class Node {
        int data;
        Node next;

        Node(int v) {
            this.data = v;
            this.next = null;
        }
    }

    public static int size(Node head) {

        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static Node nthNode(Node head, int n) {

        // formula to calculate (nth node from last) from the first
        int m = size(head) - n + 1;

        Node temp = head;

        for (int i = 1; i <= m - 1; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public static Node displayrev(Node head) {

        if (head.next == null)
            return head;

        displayrev(head.next);
        head.next.next = head;

    }

    public static void main(String[] args) {

        Node a = new Node(100);
        Node b = new Node(54);
        Node c = new Node(45);
        Node d = new Node(87);

        a.next = b;
        b.next = c;
        c.next = d;

        displayrev(a);

    }
}