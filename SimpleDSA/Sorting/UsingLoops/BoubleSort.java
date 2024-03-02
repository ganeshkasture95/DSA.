package SimpleDSA.Sorting.UsingLoops;

public class BoubleSort {

    // BoubleSort = is a sorting algorithm which compares the two adjacent elements
    // in the array
    // and swaps the heaavier element to the right side
    //
    // It is Quadratic algorithm and takes O(n^2) time

    public static void main(String[] args) {

        int array[] = { 2, 3, 434, 345, 454, 65, 76, 23, 789, 89 };

        BoobleSort_ByGanesh(array);

        for (int i : array) {
            System.out.print(" " + i);
        }
    }

    public static void BoobleSort_ByGanesh(int array[]) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

                // desending booble sort : change the sign in if condition
            }
        }
    }
}
