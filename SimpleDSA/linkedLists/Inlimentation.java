package SimpleDSA.linkedLists;

public class Inlimentation {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList_By_Ganesh {

        public Node head = null;
        public Node tail = null;

        void addlast(int value) {
            Node new_node = new Node(value);

            if (head == null) {
                head = new_node;
            } else {
                tail.next = new_node;
            }

            tail = new_node;
        }

    }

    public static void print(LinkedList_By_Ganesh list) {

        while (list.head != null) {
            System.out.print(" " + list.head.data);
            list.head = list.head.next;

        }

    }

    public static void main(String[] args) {

        LinkedList_By_Ganesh list = new LinkedList_By_Ganesh();

        list.addlast(4);
        list.addlast(332);

        print(list);

    }

}
