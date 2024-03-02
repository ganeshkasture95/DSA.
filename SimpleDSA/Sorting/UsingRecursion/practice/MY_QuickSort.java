package SimpleDSA.Sorting.UsingRecursion.practice;

public class MY_QuickSort {
    public static void main(String[] args) {
        int arr[] = { 9, 6, 5, 4, 3, 4, 3, 2, 1 };
        int n = arr.length;

        devide(arr, 0, n - 1);

        for (int i : arr)
            System.out.print(" " + i);
    }

    public static void devide(int arr[], int low, int high) {

        if (low < high) {
            int piv_ind = partition(arr, low, high);

            devide(arr, low, piv_ind - 1);
            devide(arr, piv_ind + 1, high);
        }
    }

    public static int partition(int arr[], int low, int high) {
        int pivit = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivit) {
                i++;

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;

    }
}
