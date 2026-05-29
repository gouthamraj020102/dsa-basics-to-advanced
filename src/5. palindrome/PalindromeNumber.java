// Write a function to check whether a number is a palindrome
// A palindrome number reads the same forward and backward (e.g., 121, 12321)
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
