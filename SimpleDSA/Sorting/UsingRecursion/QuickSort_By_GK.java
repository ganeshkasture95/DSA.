package SimpleDSA.Sorting.UsingRecursion;

/**
 * QuickSort_By_GK
 * 
 * take a pivit point
 * 
 * elements less than pivit -> left
 * element greter than pivit -> Right
 * 
 * Recursively the array gets sorted
 * 
 * time complexity O(n log n)
 * space O(n)
 */

public class QuickSort_By_GK {

    public static void main(String[] args) {
        int array[] = { 8, 5, 4, 3, 6, 4, 1, 9, 4, 3 };
        int n = array.length;

        devide(array, 0, n - 1);

        for (int i : array)
            System.out.print(" " + i);

    }

    public static void devide(int array[], int low, int high) {

        if (low < high) {
            int pivit_index = partition(array, low, high);

            devide(array, low, pivit_index - 1);
            devide(array, pivit_index + 1, high);
        }
    }

    public static int partition(int array[], int low, int high) {

        int pivit = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivit) {
                i++;
                // swapp
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = pivit;
        array[high] = temp;

        return i;
    }
}