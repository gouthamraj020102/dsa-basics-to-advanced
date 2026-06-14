/** https://leetcode.com/problems/missing-number/
Problem: Missing Number

PROBLEM STATEMENT:
Given an array nums containing n distinct numbers taken from the range [0, n],
find the missing number in the array.

ALGORITHM EXPLANATION:
Two Approaches Provided:

APPROACH 1 - Using Extra Space (Array Marking):
1. Create a result array of size n
2. For each number in input array, mark its position in result array
3. Scan result array and find the unmarked position (contains 0)
4. That unmarked position + 1 is the missing number
Time: O(n), Space: O(n)

APPROACH 2 - Optimal (Sum Formula) - RECOMMENDED:
1. Calculate expected sum using formula: n * (n + 1) / 2
   (sum of numbers from 0 to n)
2. Calculate actual sum of array elements
3. Missing number = Expected sum - Actual sum
Time: O(n), Space: O(1)

WHY SUM APPROACH WORKS:
If array [0, n] is missing one number, the difference between expected
and actual sum gives us the missing number directly.

EXAMPLES:
Input: [3, 0, 1]  (missing 2 from range [0, 3])
Output: 2
Expected sum: 0+1+2+3 = 6
Actual sum: 3+0+1 = 4
Missing: 6 - 4 = 2

Input: [0, 1]  (missing 2 from range [0, 2])
Output: 2
Expected sum: 0+1+2 = 3
Actual sum: 0+1 = 1
Missing: 3 - 1 = 2

Input: [9, 6, 4, 2, 3, 5, 7, 0, 1]  (missing 8 from range [0, 9])
Output: 8

EDGE CASES:
- Missing number is 0: [1, 2, 3] → Output: 0
- Missing number is n: [0, 1, 2] → Output: 3
- Single element [0]: missing 1 → Output: 1
- Array of length n+1 always contains exactly one missing number
*/

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(findMissingNumber(nums));
        int [] nums2 = {0,1};
        System.out.println(missingNumber(nums2));
        int [] nums3 = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums3));
    }

    // Approach 1: Using extra space
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) result[nums[i]-1] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            if (result[i] == 0) return i+1;
        }
        return 0;
    }

    // Approach 2: Using sum formula
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int actualSum = 0;
        int totalSum = n * (n + 1) / 2;
        for (int i = 0; i < n; i++) {
            actualSum += nums[i];
        }
        return totalSum - actualSum;
    }
}
