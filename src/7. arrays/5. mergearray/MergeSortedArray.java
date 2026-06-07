import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        mergeV2(nums1, 3, nums2, 3);
        printArray(nums1);
        int[] nums3 = {1};
        merge(nums3, 1, new int[]{}, 0);
        printArray(nums3);
        int[] nums4 = {2, 0};
        merge(nums4, 1, new int[]{1}, 1);
        printArray(nums4);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        // Way 1: Using extra space
        // int nums1Copy[] = new int[m];
        // System.arraycopy(nums1, 0, nums1Copy, 0, m);

        // Way 2: Using Arrays.copyOf
        int[] nums1Copy = Arrays.copyOf(nums1, m);

        // Way 3: Using Arrays.copyOfRange
        // int[] nums1Copy = Arrays.copyOfRange(nums1, 0, m);

        int p1Index = 0, p2Index = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (p2Index >= n || (p1Index < m && nums1Copy[p1Index] < nums2[p2Index])) {
                nums1[i] = nums1Copy[p1Index++];
            } else {
                nums1[i] = nums2[p2Index++];
            }
        }
    }

    public static void mergeV2(int[] nums1, int m, int[] nums2, int n) {
        int p1Index = m-1;
        int p2Index = n-1;
        for (int i = nums1.length-1; i >= 0; i--) {
            if (p2Index < 0 || (p1Index >= 0 && nums1[p1Index] > nums2[p2Index])) {
                nums1[i] = nums1[p1Index--];
            } else {
                nums1[i] = nums2[p2Index--];
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
