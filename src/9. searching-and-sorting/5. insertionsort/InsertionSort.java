public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        insertionSort(arr);
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            int current = arr[i];
            int previous = i - 1;

            // Move elements of arr[0..i-1], that are greater than current,
            // to one position ahead of their current position
            while (previous >= 0 && arr[previous] > current) {
                arr[previous + 1] = arr[previous];
                previous--;
            }
            arr[previous + 1] = current;
        }
    }
}
