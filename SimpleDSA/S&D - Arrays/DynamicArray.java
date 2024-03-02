class DArray {

    int size;
    int capacity = 10;
    Object[] array;

    public DArray() {
        this.array = new Object[capacity];
    }

    public DArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void Add(Object Data) {
        if (size >= capacity) {
            grow();
        }
        array[size] = Data;
        size++;
    }

    public void Insert(int index, Object Data) {

    }

    public void Delete(Object Data) {

    }

    public int search(Object Data) {
        return -1;
    }

    private void grow() {

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {

        String string = "";
        for (int i = 0; i < size; i++) {
            string += array[i] + ", ";
        }
        return string;
    }

}

public class DynamicArray {
    public static void main(String[] args) {

        DArray dynamicArray = new DArray();

        System.out.println(dynamicArray.capacity);

        dynamicArray.Add("A");
        dynamicArray.Add("B");

        System.out.println(dynamicArray);
    }
}