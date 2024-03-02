package SimpleDSA.Searching;

import java.util.Arrays;

/**
 * BinarySrarch
 * 
 * It is a Search Algorithm that finds the position of
 * a target value within a sorted array .
 * 
 * Half of the array is eleminated aeach "step"
 * 
 */

public class BinarySrarch {

    public static void main(String[] args) {
        int array[] = { 23, 44, 55, 66, 77, 88, 99, 100 };
        int target = 77;

        int index = Arrays.binarySearch(array, target);
        int index2 = binarySearchBy_GanuBhau(array, target);

        if (index >= 0 && index2 >= 0) {
            System.out.println("The element was found on the index  " + index + " in the array");
        } else {
            System.out.println("The elment was not found in the array");
        }
    }

    private static int binarySearchBy_GanuBhau(int[] array, int target) {

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {

            int middle = low + (high - low) / 2;
            int value = array[middle];

            System.out.println("middle : " + value);

            if (value < target)
                low = middle + 1;
            else if (value > target)
                high = middle - 1;
            else if (value == target)
                return value; // target not found
            else
                return -1;
        }
        return -1;
    }

}