package SimpleDSA.Searching.practice_gk;

/**
 * BNSearch
 */
public class BNSearch {

    public static void main(String[] args) {
        int array[] = { 2, 3, 4, 2, 3, 2, 4, 3, 2, 32, 2 };

        int target = 32;

        System.out.println(BynarySearchingGanesh(array, target));
    }

    private static int BynarySearchingGanesh(int array[], int target) {

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;
            int value = array[mid];

            if (target < value) {
                high = mid - 1;
            } else if (target > value) {
                low = mid + 1;
            } else if (target == value) {
                return mid;
            }

        }

        return -1;
    }
}