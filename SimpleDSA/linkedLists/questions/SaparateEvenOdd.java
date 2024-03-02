package SimpleDSA.linkedLists.questions;

/**
 * SaparateEvenOdd
 */
public class SaparateEvenOdd {

    Node head;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static class LinkedListb {
        Node head = null;
        Node tail = null;

        void addNode(int data) {
            Node a = new Node(data);
            if (head == null) {
                head = a;
                tail = a;
            } else {
                tail.next = a;
                tail = tail.next;
            }
        }

        void print() {

            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.print("Null");
        }

    //     public static Node saparate(Node head) {

    //         Node temp = head;

    //         Node e = new Node(3);
    //         Node etemp = e;

    //         Node odd = head;

    //         while (temp != null) {

    //             if (temp.data % 2 != 0) {
    //                 odd.next = temp;
    //                 odd = odd.next;
    //                 temp = temp.next;
    //             } else {
    //                 etemp.next = temp;
    //                 temp = temp.next;
    //                 etemp = etemp.next;
    //             }
    //         }
    //         odd.next = e.next;

    //         return head;
    //     }
    // }


    

    public static void main(String[] args) {

        LinkedListb li = new LinkedListb();

        li.addNode(3);
        li.addNode(5);
        li.addNode(4);
        li.addNode(6);
        li.addNode(9);
        li.addNode(8);
        li.addNode(88);
        li.addNode(810);

        li.print();
        System.out.println();
        LinkedListb.saparate(li.head);
        li.print();

    }
}