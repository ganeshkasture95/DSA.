package SimpleDSA.stack;

import java.util.Stack;

public class st {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(3);
        st.push(345);

        System.out.println(st);
        st.push(43);

        System.out.println(st);

        System.out.println(st.peek());

    }

}
