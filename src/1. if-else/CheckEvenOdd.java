/**
Problem: Check if a number is even or odd

Question: Create a method to check whether a number is even or odd
Demonstrates basic conditional logic using if-else statements to determine number parity

Algorithm Approach:
- Use the modulo operator (%) to determine remainder when dividing by 2
- If remainder is 0, number is even
- If remainder is 1, number is odd

Example:
- Input: 6 → Output: "6 is even"
- Input: 11 → Output: "11 is odd"

Edge Cases:
- Zero: Considered even (0 % 2 == 0)
- Negative numbers: Works correctly (-5 % 2 == -1, treated as odd)
- Large numbers: Works correctly due to modulo operation
*/

public class CheckEvenOdd {
    public static void main(String[] args) {
        isEvenOdd(6);
        isEvenOdd(11);
        isEvenOdd(11000050);
    }

    private static void isEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }
}