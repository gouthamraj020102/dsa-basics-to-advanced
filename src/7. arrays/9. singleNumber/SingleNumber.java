/** https://leetcode.com/problems/single-number/
Problem: Single Number

PROBLEM STATEMENT:
Given a non-empty array of integers nums, every element appears twice except
for one element that appears exactly once. Find that single element.

ALGORITHM EXPLANATION:
Two Approaches Provided:

APPROACH 1 - Using HashMap:
1. Create a HashMap to store frequency of each number
2. Iterate through array and count occurrences
3. Iterate through array again and find element with frequency 1
Time: O(n), Space: O(n)

APPROACH 2 - Using XOR (Optimal) - RECOMMENDED:
1. Initialize result = 0
2. XOR each element: result ^= nums[i]
3. Return result
Time: O(n), Space: O(1)

WHY XOR APPROACH WORKS:
XOR Properties:
- a ^ a = 0 (same number XORed gives 0)
- a ^ 0 = a (any number XORed with 0 gives itself)
- XOR is commutative: a ^ b ^ a = b

Therefore: Since every number appears twice except one, when we XOR all
numbers, pairs cancel out to 0, leaving only the single number.

EXAMPLES:
Input: [4, 1, 2, 1, 2]
Output: 4
Explanation: 4 ^ 1 ^ 2 ^ 1 ^ 2 = 4 ^ (1 ^ 1) ^ (2 ^ 2) = 4 ^ 0 ^ 0 = 4

Input: [2, 2, 1]
Output: 1
Explanation: 2 ^ 2 ^ 1 = 0 ^ 1 = 1

EDGE CASES:
- Single element [5]: Output: 5
- Array with one pair and single: [1, 1, 3] → Output: 3
- Negative numbers: [-1, -1, 5] → Output: 5
- All numbers same except last: [7, 7, 7, 7, 9] → Output: 9

COMPARISON:
HashMap Approach: Simple to understand, uses extra space O(n)
XOR Approach: Elegant, uses constant space O(1), leverages bit manipulation
*/

import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
        System.out.println(singleNumberUsingXOR(nums));
        int [] nums2 = {2,2,1};
        System.out.println(singleNumber(nums2));
        System.out.println(singleNumberUsingXOR(nums2));
    }

    // Approach 1: Using HashMap
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hash.containsKey(nums[i])) {
                hash.put(nums[i], 1);
            } else {
                hash.put(nums[i], hash.get(nums[i]) + 1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (hash.get(nums[i]) == 1) {
                return nums[i];
            }
        }
        return 0;
    }

    // Approach 2: Using XOR
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int singleNumberUsingXOR(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        return xor;
    }
}
