
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 1};
        int[] sortedArray = mergeSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));
    }

    public static int[] mergeSort(int[] arr) {
        if(arr.length <= 1) return arr;
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return mergeTwoSortedArrays(left, right);
    }

    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
        int arr[] = new int[arr1.length + arr2.length];
        int p1 = 0, p2 = 0;
        int index = 0;
        while(index < arr.length) {
            if(p2 >= arr2.length || (p1 < arr1.length && arr1[p1] <= arr2[p2])) {
                arr[index++] = arr1[p1++];
            } else {
                arr[index++] = arr2[p2++];
            }
        }
        return arr;
    }
}
