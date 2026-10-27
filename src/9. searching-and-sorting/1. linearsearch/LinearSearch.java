public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {4, 9, 1, 0, 2};
        int result1 = linearSearch(arr, 0);
        System.out.println("Element found at index: " + result1);
        int result2 = linearSearch(arr, 10);
        System.out.println("Element found at index: " + result2);
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index of the target element
            }
        }
        return -1; // Return -1 if the target element is not found
    }
}
