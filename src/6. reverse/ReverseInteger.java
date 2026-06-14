/**
Problem: Reverse an integer with overflow handling

Question: Write a method to reverse the digits of an integer, handling negative numbers and overflow cases
Reverses the number by extracting digits using modulo and division operations, then reconstructs the reversed number
Preserves the sign of the original number and handles integer overflow by returning 0 if the result exceeds 32-bit limits

Algorithm Approach:
- Use long to prevent integer overflow during reversal
- Work with absolute value of number
- Extract digits from right to left using modulo
- Build reversed number by appending digits
- Check for 32-bit integer overflow limits
- Return 0 if reversed number exceeds limits
- Preserve original sign in final result

Example:
- Input: 123 → Output: 321
- Input: -456 → Output: -654
- Input: 120 → Output: 21 (trailing zero dropped)
- Input: 1534236469 → Output: 0 (overflow)

Edge Cases:
- Trailing zeros: Become leading zeros and are dropped (120 → 21)
- Negative numbers: Sign preserved (-456 → -654)
- Integer overflow: Returns 0 if outside [-2^31, 2^31-1]
- Single digit: Returns same digit
- Zero: Returns zero
*/

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverseInteger(123)); // Output: 321
        System.out.println(reverseInteger(-456)); // Output: -654
        System.out.println(reverseInteger(120)); // Output: 21
        System.out.println(reverseInteger(1534236469)); // Output: 0 (overflow)
    }

    public static int reverseInteger(int n) {
        long rev = 0;
        int nCopy = n; // Keep a copy of the original number for sign handling
        n = Math.abs(n); // Work with the absolute value

        while (n > 0) {
            int remainder = n % 10;
            rev = rev * 10 + remainder;
            n /= 10;
        }

        int limit = (int) Math.pow(2, 31);
        if (rev < -limit || rev > limit) {
            return 0; // Return 0 for overflow
        }
        return (int)(nCopy < 0 ? -rev : rev); // Return the reversed number with the correct sign
    }
}
