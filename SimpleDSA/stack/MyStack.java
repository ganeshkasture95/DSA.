package SimpleDSA.stack;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {

        Stack<String> sack = new Stack<String>();
        System.out.println(sack.empty());

        // ganesh kasture

        sack.push("Ganesh");

        System.out.println(sack.empty());
        System.out.println(sack.firstElement());

        sack.push("Kasture");

        System.out.println(sack.elementAt(1));

        System.out.println(sack);

        Stack<String> sack2 = new Stack<String>();
        sack2.push("HI");
        sack2.push("Ganesh");
        sack.push("2024");

        System.out.println(sack2);

        sack2.pop();
        System.out.println(sack2);

        String hi = sack2.pop();
        System.out.println(hi);

        System.out.println(sack);

        System.out.println(sack.search("2024"));

        // A stack is ⁡⁢⁣⁢LIFO datastructure⁡
        // stores the data in vertical tower building blocks
        // we can push , pop , and seach the oblect in the stack

    }
}
