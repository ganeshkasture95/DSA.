package SimpleDSA.Sorting.practice_gk;

/**
 * merg_sort
 */
public class merg_sort {

    public static void main(String[] args) {
        int arr[] = { 3, 2, 5, 4, 3, 5, 98, 7, 756, 5, 4, 43, 34 };
        int n = arr.length;

        devide(arr, 0, n - 1);

        for (int i : arr)
            System.out.print(" " + i);
    }

    public static void devide(int array[], int si, int ei) {

        if (si >= ei)
            return;

        int mid = si + (ei - si) / 2;
        devide(array, si, mid);
        devide(array, mid + 1, ei);

        concure(array, si, mid, ei);

    }

    public static void concure(int array[], int si, int mid, int ei) {

        int merged_array[] = new int[ei - si + 1];

        int ils = si;
        int irs = mid + 1;

        int x = 0;

        while (ils <= mid && irs <= ei) {
            if (array[ils] > array[irs]) {
                merged_array[x++] = array[irs++];
            } else {
                merged_array[x++] = array[ils++];
            }
        }
        while (irs <= ei) {
            merged_array[x++] = array[irs++];
        }
        while (ils <= mid) {
            merged_array[x++] = array[ils++];
        }

        for (int i = 0, j = si; i < merged_array.length; i++, j++) {
            array[j] = merged_array[i];
        }
    }
}