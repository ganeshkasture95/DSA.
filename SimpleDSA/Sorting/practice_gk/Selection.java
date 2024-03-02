package SimpleDSA.Sorting.practice_gk;

/**
 * Selection
 */
public class Selection { // ⁡⁢⁣⁢ jay sri ram ⁡

    public static void main(String[] args) {
        int array[] = { 2, 3, 2, 1, 4, 9, 8, 7 };

        selectionsorting(array);

        for (int i : array)
            System.out.print(" " + i);
    }

    public static void selectionsorting(int array[]) {

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
