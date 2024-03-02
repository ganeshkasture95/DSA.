package SimpleDSA.Searching;

class LinesrSearch {

    public static void main(String[] args) {

        // Linear Search = Iterate through a collection one element at a time
        // Rountime complexity :O(n)

        // Disadvantages : slow for larger data sets

        // Advantages : 1.Does not nead to be sorted
        // 2.fast for searching smaler and medium data sets
        // 3.Used for the elements which does not suport random access(Linked list)

        int array[] = { 1, 3, 4, 2, 3, 4, 5, 6, 783, 34, 3, 43, 4, 2 };

        int value = 2;
        int index = LinearS(array, value);

        if (index == -1) {
            System.out.println("We do not find the value " + value + " in the array");
        } else {
            System.out.println("The index of the element " + value + "  in the array is " + index);
        }

    }

    public static int LinearS(int array[], int value) {

        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                return i;
            }

        }
        return -1;
    }

}