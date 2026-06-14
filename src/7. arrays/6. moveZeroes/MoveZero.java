/** https://leetcode.com/problems/move-zeroes/description/
Problem: Move all zeroes to end of array

Question: Move all zero elements in an array to the end while maintaining the relative order of non-zero elements.

Algorithm Approach:
- Two-pass algorithm:
  Pass 1: Move all non-zero elements to front using index pointer
  Pass 2: Fill remaining positions with zeros
- Relative order of non-zero elements preserved
- Array modified in-place

Example:
- Input: [0, 1, 0, 3, 12]
- Output: [1, 3, 12, 0, 0]
- Input: [0]
- Output: [0]
- Input: [1, 2, 3]
- Output: [1, 2, 3]

Edge Cases:
- No zeroes: Array remains unchanged
- All zeroes: Array remains all zeroes
- Single element: Returns same element
- Array already sorted: No changes if zeros already at end
- No non-zero elements: All become zeros
*/

public class MoveZero {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    private static void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        for (int j = index; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}
