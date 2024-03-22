package SimpleDSA.stack.IntQuest;

import java.util.Scanner;
import java.util.Stack;

/**
 * BalancedBracket
 */
public class BalancedBracket {

    public static boolean isBalanced(String str) {

        Stack<Character> st = new Stack<Character>();

        int n = str.length();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false;
                } else if (st.peek() == '(') {
                    st.pop();
                }
            }
        }

        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);

        System.out.print("Enter a sequence of the brackets: ");
        String str = cs.nextLine();

        Boolean ans = isBalanced(str);

        if (ans == true) {
            System.out.println("The sequence of brackets is balanced.");
        } else {
            System.out.println("The sequence of brackets is not balanced.");
        }
    }
}