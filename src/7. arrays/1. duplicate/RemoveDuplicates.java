/** https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
Problem: Remove duplicates from sorted array

Question: Remove duplicates from a sorted array in-place and return the number of unique elements
Implements a two-pointer approach to maintain unique elements at the beginning of the array while modifying it in-place
Returns the count of unique elements, with all unique values positioned at the start of the array

Algorithm Approach:
- Two-pointer technique: x tracks position of next unique element
- Iterate through array with pointer i
- When nums[i] > nums[x], increment x and assign nums[i] to nums[x]
- Maintains unique elements at the beginning of array
- Original array is modified in-place

Example:
- Input: [1, 1, 2]
- Output: 2, modified array: [1, 2, _]
- Input: [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
- Output: 5, modified array: [0, 1, 2, 3, 4, _, _, _, _, _]

Edge Cases:
- Single element: Returns 1
- No duplicates: Returns array length
- All duplicates: Returns 1
- Empty array: Returns 0

Constraints: Array must be sorted in ascending order
*/

import java.util.Arrays;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        System.out.println(removeDuplicates(nums1)); // Output: 2

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums2)); // Output: 5
    }

    public static int removeDuplicates(int[] nums) {
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[x]) {
                x++;
                nums[x] = nums[i];
            }
        }
        System.out.println("Modified array: " + Arrays.toString(nums));
        return x + 1;
    }
}
