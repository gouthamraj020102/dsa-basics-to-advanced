public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int result1 = binarySearch(arr, 9);
        System.out.println("Element found at index: " + result1);
        int result2 = binarySearch(arr, 10);
        System.out.println("Element found at index: " + result2);
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (arr[mid] == target) {
                return mid; // Return the index of the target element
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Return -1 if the target element is not found
    }
}