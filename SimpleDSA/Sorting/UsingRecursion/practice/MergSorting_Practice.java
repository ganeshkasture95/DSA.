package SimpleDSA.Sorting.UsingRecursion.practice;

public class MergSorting_Practice {
    public static void main(String[] args) {
        int array[] = { 2, 4, 2, 5, 2, 1, 91, 2, 81, 75, 63 };
        int n = array.length;

        DevideAndDevide(array, 0, n - 1);

        for (int i : array)
            System.out.print(" " + i);
    }

    public static void DevideAndDevide(int array[], int si, int ei) {

        if (si >= ei)
            return;

        int mid = si + (ei - si) / 2;

        DevideAndDevide(array, si, mid);
        DevideAndDevide(array, mid + 1, ei);

        ConqureAndRule(array, si, mid, ei);
    }

    private static void ConqureAndRule(int[] array, int si, int mid, int ei) {

        int merary[] = new int[ei - si + 1];

        int ils = si;
        int irs = mid + 1;

        int x = 0;

        while (ils <= mid && irs <= ei) {
            if (array[ils] <= array[irs]) {
                merary[x++] = array[ils++];
            } else {
                merary[x++] = array[irs++];
            }
        }
        while (ils <= mid) {
            merary[x++] = array[ils++];
        }
        while (irs <= ei) {
            merary[x++] = array[irs++];
        }

        for (int i = 0, j = si; i < merary.length; i++, j++) {
            array[j] = merary[i];
        }

    }

}
