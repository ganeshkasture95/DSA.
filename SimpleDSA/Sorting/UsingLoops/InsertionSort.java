package SimpleDSA.Sorting.UsingLoops;

/**
 * InsertionSort
 */
public class InsertionSort {

    // ⁡⁢⁣⁢Insertion sort compares the elements to the left ⁡⁡⁡
    // Runs in cuadratic time and Time complexith is ⁡⁢⁣⁢O(n^2)

    // Prefered aver Booble Sort And Insertion sort
    // ⁡⁢⁣⁢ Best Case = O(n)⁡

    public static void main(String[] args) {
        int array[] = { 2, 3, 2, 4, 1, 5, 4, 54, 3, 6 };

        InsertionSorte(array);
        System.out.println();
        System.out.println("final sorted array output");
        for (int i : array) {
            System.out.print(" " + i);
        }
    }

    public static void InsertionSorte(int array[]) {

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
            System.out.println();
            for (int k : array) {
                System.out.print(" " + k);
            }
        }

    }
}