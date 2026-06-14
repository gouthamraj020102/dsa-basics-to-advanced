/**
Problem: Check if a number is a palindrome

Question: Write a method to check whether a number is a palindrome. A palindrome number reads the same forward and backward (e.g., 121, 12321)
Reverses the number by extracting digits one by one using modulo and division operations, then compares it with the original number
Provides both a void method for printing results and a boolean method for returning the palindrome check result

Algorithm Approach:
- Store original number for comparison
- Extract digits from right to left using modulo (n % 10)
- Build reversed number by appending digits
- Compare original with reversed number
- Reject negative numbers as non-palindromes

Example:
- Input: 12321 → Output: true
- Input: 121 → Output: true
- Input: 123 → Output: false
- Input: -121 → Output: false (negative rejected)

Edge Cases:
- Single digit numbers (0-9): All are palindromes
- Negative numbers: Considered non-palindromes (sign changes)
- Numbers with trailing zeros: e.g., 1200 is not palindrome
- Zero: Considered a palindrome
- Number with multiple same digits: e.g., 1111 is palindrome
*/

public class PalindromeNumber {
    public static void main(String[] args) {
        checkIfPalindrome(12321);
        System.out.println(isPalindrome(-121));
    }

    public static void checkIfPalindrome(int n) {
        int originalNum = n;
        int reversedNum = 0;

        while (n > 0) {
            int remainder = n % 10; // Get the last digit
            reversedNum = reversedNum * 10 + remainder; // Append the digit to the reversed number
            n /= 10; // Remove the last digit
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int n) {
        int originalNum = n;
        int reversedNum = 0;
        if(n < 0) {
            return false; // Negative numbers are not palindromes
        }
        while (n > 0) {
            int remainder = n % 10;
            reversedNum = reversedNum * 10 + remainder;
            n /= 10;
        }
        return originalNum == reversedNum;
    }
}
