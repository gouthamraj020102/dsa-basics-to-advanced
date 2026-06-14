/**
Level 1 - Loops
Problem: Print all even numbers from an array

Question: Find and print all even numbers from an array
Iterates through an array and filters even elements

Algorithm Approach:
- Iterate through each element in the array
- Check if element modulo 2 equals 0 (even)
- Print the element if condition is true

Time Complexity: O(n) - iterate through all n elements once
Space Complexity: O(1) - no extra space for data structures

Example:
- Input: [10, 5, 7, 0, 8, 3, 80]
- Output: 10, 0, 8, 80

Edge Cases:
- Empty array: No output
- Array with no even numbers: No output
- Single even number: Prints that number
- Zero: Considered even and will be printed
*/

public class PrintEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 7, 0, 8, 3, 80};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
