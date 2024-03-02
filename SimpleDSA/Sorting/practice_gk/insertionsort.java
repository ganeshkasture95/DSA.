package SimpleDSA.Sorting.practice_gk;

/**
 * insertionsort
 */
public class insertionsort {

    public static void main(String[] args) {
        int ram[] = { 4, 5, 543, 2, 1 };

        inser(ram);

        for (int i : ram) {
            System.out.print(" " + i);
        }
    }

    public static void inser(int array[]) {

        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = temp;
        }
    }
}