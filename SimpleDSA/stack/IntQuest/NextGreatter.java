package SimpleDSA.stack.IntQuest;

import java.util.Stack;

/**
 * NextGreatter
 */
public class NextGreatter {

    public static int[] nextGretterElement(int arr[]) {

        int n = arr.length;
        int res[] = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (st.peek() <= arr[i] && !st.isEmpty()) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(arr[i]);

        }

        return res;

    }

    public static void main(String[] args) {

        int arr[] = { 1, 4, 5, 7, 10, 5, 3, 2, 8 };

        int res[] = findNextGreater(arr);

        for (int i : res) {
            System.out.print(i + " ");
        }

    }

    public static int[] findNextGreater(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }

        return nge;
    }

    // public static void main(String[] args) {
    // int arr[] = { 1, 4, 5, 7, 10, 5, 3, 2, 8 };
    // int nge[] = findNextGreater(arr);

    // for (int i = 0; i < nge.length; i++) {
    // System.out.print(nge[i] + " ");
    // }
    // System.out.println();
    // }
}

// ?