package SimpleDSA.stack;

/**
 * LLStack
 */
public class LLStack {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack {

        Node head = null;
        int size = 0;

        public void push(int value) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                size++;
            } else {
                newNode.next = head;
                head = newNode;
                size++;
            }
        }

        public void disply() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void pop() {
            if (head == null) {
                System.out.println("Stack is empty");
            } else {
                head = head.next;
                size--;
            }

        }

        void peek() {
            if (head == null) {
                System.out.println("Stack is empty");
            } else {
                System.out.println("Top element is: " + head.data);
            }
        }

        void size() {
            System.out.println("Size of stack is: " + size);
        }

    }

    public static void main(String[] args) {

        System.out.println("Implimentation of stack using Linked List ");

        Stack st = new Stack();
        st.push(120);
        st.push(192);
        st.push(194);
        st.push(194);
        st.push(119);

        st.disply();

        st.pop();

        st.disply();
        st.peek();

        st.size();

    }

}