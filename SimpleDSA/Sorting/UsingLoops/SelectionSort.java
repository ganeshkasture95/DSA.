package SimpleDSA.Sorting.UsingLoops;

public class SelectionSort {

    // Selection sort algorithm = ⁡⁢⁣⁢searches the array and keeps track of the
    // minimum
    // value during each⁡
    // iteration .at the end of each iteration we swap variables.

    // It runs in quadratic time and hence the timw complexity of the is⁡⁢⁣⁢ O(n^2)⁡
    // small data set = okay
    // largr dataset = not okay

    public static void main(String[] args) {
        int array[] = { 21, 232, 21, 54, 32, 2, 1, 23, 45, 6, 7, 8 };

        SelectionSort_GanuBhau(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }

    public static void SelectionSort_GanuBhau(int array[]) {

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
