/**
Problem: Count the number of digits in a number

Question: Write a method that returns the count of digits in a number
Counts the total number of digits present in an integer using division operations in a loop
Uses the mathematical approach of repeatedly dividing by 10 to count digits

Algorithm Approach:
- Handle zero as a special case: 0 has 1 digit
- Convert negative numbers to positive using Math.abs()
- Repeatedly divide by 10 and increment counter
- Continue until number becomes 0

Example:
- Input: 298 → Output: 3
- Input: -298 → Output: 3 (negative sign ignored)
- Input: 0 → Output: 1
- Input: 12345 → Output: 5

Edge Cases:
- Zero: Returns 1 (special case)
- Negative numbers: Absolute value used, sign ignored
- Single digit: Returns 1 immediately
- Large numbers: Works correctly due to division approach
*/

public class CountDigit {
    public static void main(String[] args) {
        int number = -298;
        int result = countDigitsInNumber(number);
        System.out.println("The count of digits in number: " + number + " is: " + result);
    }

    public static int countDigitsInNumber(int n) {
        int count = 0;
        if (n == 0) {
            return 1;
        }
        // Converting negative number to positive
        n = Math.abs(n);
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}
