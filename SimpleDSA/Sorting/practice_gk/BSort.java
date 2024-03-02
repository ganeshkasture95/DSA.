package SimpleDSA.Sorting.practice_gk;

/**
 * BSort
 */
public class BSort {

    public static void main(String[] args) {
        int array[] = { 2, 3, 4, 2, 1, 3, 5, 4, 3, 2, 1, 3, 5, 6 };

        BBs(array);

        for (int i : array)
            System.out.print(" " + i);
    }

    public static void BBs(int array[]) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }
            System.out.println();
            for (int k : array)
                System.out.print(" " + k);
        }

    }
}