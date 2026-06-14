/** https://leetcode.com/problems/reverse-string/description/
Problem: Reverse a string represented as character array

Question: Reverse a string represented as a character array in-place without using extra space
Implements a two-pointer approach where pointers move towards the center, swapping characters at each step
Modifies the array in-place by swapping elements from both ends until they meet in the middle

Algorithm Approach:
- Two-pointer technique: one at start, one at end
- Swap characters at both pointers
- Move pointers toward center (while i < length/2)
- Continue until pointers meet in middle
- String is reversed in-place

Example:
- Input: ['h', 'e', 'l', 'l', 'o']
- Output: ['o', 'l', 'l', 'e', 'h']
- Input: ['H', 'a', 'n', 'n', 'a', 'h']
- Output: ['h', 'a', 'n', 'n', 'a', 'H']

Edge Cases:
- Single character: No change needed
- Empty array: No operation needed
- Two characters: Simple swap
- Palindrome string: Still reverses (looks same after)
*/

import java.util.Arrays;
public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println(Arrays.toString(s)); // Output: [o, l, l, e, h]
        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(s2);
        System.out.println(Arrays.toString(s2)); // Output: [h, a, n, n, a, H]
    }

    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }
}
