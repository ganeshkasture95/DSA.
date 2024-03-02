package SimpleDSA.Searching.practice_gk;

/**
 * BSearch
 */
public class BSearch {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 9, 17, 27, 37, 48, 59, 65, 73, 93, 100, 200 };
        int target = 73;
        int index = Binarysearch(array, target);

        if (index >= 0) {
            System.out.println("we found the element " + target + " at the index " + index + " in the array");
        } else {
            System.out.println("We do not found the element " + target + " in the array");
        }

    }

    public static int Binarysearch(int array[], int target) {

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {

            int middle = low + (high - low) / 2;
            int value = array[middle];

            if (target > value) {
                low = middle + 1;
            } else if (target < value) {
                high = middle - 1;
            } else if (value == target) {
                return middle;
            } else {
                return -1;
            }
        }
        return -1;
    }

}