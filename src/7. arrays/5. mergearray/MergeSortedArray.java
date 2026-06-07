/** https://leetcode.com/problems/merge-sorted-array/description/
Problem: Merge two sorted arrays

Question: Merge two sorted arrays into the first array in-place, where the first array has enough space to hold all elements

Algorithm Approach:
- Two approaches provided:
  1. merge(): Copy nums1 to temp, merge forward from start
  2. mergeV2(): Work backward from end (optimal, no extra space needed)
- mergeV2 uses three pointers starting from end
- Compare elements and place larger at end of nums1
- Move pointer of processed element backward

Example:
- Input: nums1 = [1, 2, 3, 0, 0, 0], m = 3, nums2 = [2, 5, 6], n = 3
- Output: nums1 = [1, 2, 2, 3, 5, 6]
- Input: nums1 = [1], m = 1, nums2 = [], n = 0
- Output: nums1 = [1]

Edge Cases:
- Empty nums2: nums1 remains unchanged
- Empty nums1: All elements come from nums2
- One element arrays: Simple comparison and placement
- All elements in nums2 smaller: Moved to front

Constraints: nums1 has length m+n with first m elements filled
*/

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
