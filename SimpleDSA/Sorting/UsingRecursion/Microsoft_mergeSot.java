package SimpleDSA.Sorting.UsingRecursion;

public class Microsoft_mergeSot {
    public static void main(String[] args) {
        int array[] = { 2, 3, 4, 2, 1, 85, 43, 3, 4, 6, 9, 8 };
        int n = array.length;

        devide(array, 0, n - 1);

        for (int i : array)
            System.out.print(" " + i);

    }

    public static void devide(int array[], int si, int ei) {
        if (si >= ei)
            return;

        int mid = si + (ei - si) / 2;
        devide(array, si, mid);
        devide(array, mid + 1, ei);
        conqure(array, si, mid, ei);
    }

    public static void conqure(int arry[], int si, int mid, int ei) {

        int merged[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;

        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (arry[idx1] <= arry[idx2]) {
                merged[x++] = arry[idx1++];
            } else {
                merged[x++] = arry[idx2++];
            }
        }
        while (idx1 <= mid) {
            merged[x++] = arry[idx1++];
        }
        while (idx2 <= ei) {
            merged[x++] = arry[idx2++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arry[j] = merged[i];
        }
    }

}
