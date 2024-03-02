package SimpleDSA.Searching;

public class Interpoletion_Search {
    public static void main(String[] args) {

        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int index = InterpoletionSearch(array, 8);

        if (index >= 0) {
            System.out.println("We found the element on index :" + index);
        } else {
            System.out.println("We do ot found the element in the array");
        }

    }

    public static int InterpoletionSearch(int array[], int value) {

        int low = 0;
        int high = array.length - 1;

        while (value >= array[low] && value <= array[high] && high >= low) {

            int probe = low + (high - low) * (value - array[low]) / (array[high] * array[low]);

            System.out.println("Probe: " + probe);

            if (value == array[probe]) {
                return probe;
            } else if (value > array[probe]) {
                low = probe + 1;
            } else if (value < array[probe]) {
                high = probe - 1;
            } else {
                return -1;
            }
        }
        return -1;
    }
}
