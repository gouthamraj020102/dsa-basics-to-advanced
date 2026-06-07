/**
Level 1 - Loops
Problem: Print all odd numbers from an array

Question: Find and print all odd numbers from an array.
Demonstrates different loop approaches (for and while loops) to filter odd elements

Algorithm Approach:
- Two approaches provided: using for loop and while loop
- Check if element modulo 2 is not equal to 0 (odd)
- Print the element if condition is true

Example:
- Input: [10, 5, 7, 0, 8, 3, 80]
- Output: 5, 7, 3

Edge Cases:
- Empty array: No output
- Array with no odd numbers: No output
- Single odd number: Prints that number
- Negative odd numbers: Handled correctly (-5 is odd)
*/

public class PrintOddNumbers {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 7, 0, 8, 3, 80};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
        int i = 0;
        while (i < numbers.length) {
            if (numbers[i] % 2 == 1) {
                System.out.print(numbers[i] + " ");
            }
            i++;
        }
        System.out.println();
    }
}
