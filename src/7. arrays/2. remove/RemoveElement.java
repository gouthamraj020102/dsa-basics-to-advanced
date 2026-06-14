/** https://leetcode.com/problems/remove-element/description/
Problem: Remove all occurrences of a value from array

Question: Remove all occurrences of a given value from an array in-place and return the number of remaining elements
Uses a two-pointer technique to move non-matching elements to the beginning of the array while preserving their relative order
Returns the count of elements that are not equal to the specified value

Algorithm Approach:
- Two-pointer technique: k tracks position of next non-matching element
- Iterate through array with pointer i
- When nums[i] != val, place nums[i] at nums[k] and increment k
- All non-matching elements moved to beginning
- Relative order of remaining elements is preserved

Example:
- Input: [3, 2, 2, 3], val = 3
- Output: 2, modified array: [2, 2, _, _]
- Input: [0, 1, 2, 2, 3, 0, 4, 2], val = 2
- Output: 5, modified array: [0, 1, 3, 0, 4, _, _, _]

Edge Cases:
- Value not present: Returns array length (all elements remain)
- All elements match value: Returns 0
- Single element: Returns 0 or 1 based on match
- Empty array: Returns 0
*/

import java.util.Arrays;
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums1 = {3, 2, 2, 3};
        System.out.println(removeElement(nums1, 3)); // Output: 2

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(removeElement(nums2, 2)); // Output: 5
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        System.out.println("Modified array: " + Arrays.toString(nums));
        return k;
    }
}
