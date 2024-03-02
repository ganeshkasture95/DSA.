package SimpleDSA.Sorting.UsingRecursion.practice;

/**
 * mj
 */
public class mjSort {

    public static void main(String[] args) {
        int array[] = { 9, 8, 76, 5, 4, 3, 2, 5, 5, 1, 4, 35, 445, 67, 89, 67, 12, 344, 43, 21 };
        int n = array.length;

        DevideAndBreak(array, 0, n - 1);
        System.out.print("This is merj sort peoples");
        for (int i : array)
            System.out.print(" " + i);
    }

    public static void DevideAndBreak(int array[], int si, int ei) {

        if (si >= ei)
            return;

        int mid = si + (ei - si) / 2;

        DevideAndBreak(array, si, mid);
        DevideAndBreak(array, mid + 1, ei);

        ConqureAndSort(array, si, mid, ei);

    }

    private static void ConqureAndSort(int[] array, int si, int mid, int ei) {

        int merged[] = new int[ei - si + 1];

        int ils = si;
        int irs = mid + 1;

        int x = 0;

        while (ils <= mid && irs <= ei) {
            if (array[ils] <= array[irs]) {
                merged[x++] = array[ils++];
            } else {
                merged[x++] = array[irs++];
            }
        }
        while (ils <= mid) {
            merged[x++] = array[ils++];
        }
        while (irs <= ei) {
            merged[x++] = array[irs++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            array[j] = merged[i];
        }
    }

}