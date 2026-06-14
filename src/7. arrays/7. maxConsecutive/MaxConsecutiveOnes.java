/** https://leetcode.com/problems/max-consecutive-ones/description/
Problem: Max Consecutive Ones

PROBLEM STATEMENT:
Given a binary array nums (containing only 0s and 1s), find the maximum number
of consecutive 1s in the array.

ALGORITHM EXPLANATION:
Single Pass Approach:
1. Keep track of current consecutive count and maximum count seen so far
2. Iterate through the array:
   - If current element is 1, increment the current count
   - If current element is 0, update max with current count and reset current to 0
3. After loop, compare max with final current count (in case array ends with 1s)

EXAMPLES:
Input: [1, 1, 0, 1, 1, 1]
Output: 3 (three consecutive 1s at the end)

Input: [1, 0, 1, 1, 0, 1]
Output: 2 (two consecutive 1s in the middle)

EDGE CASES:
- Array with all 1s: [1, 1, 1, 1] → Output: 4
- Array with all 0s: [0, 0, 0] → Output: 0
- Single element [1] → Output: 1
- Single element [0] → Output: 0
- Array starting with 0s: [0, 0, 1, 1] → Output: 2
*/

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
        int [] nums2 = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums2));
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        return Math.max(maxCount, count);
    }
}
