/**
Level 2 - Loops
Problem: Count negative elements in array

Question: Write a method to count the number of negative elements in an array.
Counts occurrences of negative values using loop iteration.

Algorithm Approach:
- Initialize counter to 0
- Iterate through each element in the array
- Increment counter if element is less than 0
- Return total count

Example:
- Input: [2, -9, 17, 0, 1, -10, -4, -8]
- Output: 4 (count of negative numbers: -9, -10, -4, -8)

Edge Cases:
- No negative numbers: Returns 0
- All negative numbers: Returns array length
- Array contains zero: Zero is not negative, not counted
- Single element: Returns 0 or 1 based on value
*/

public class CountNegativeElements {
    public static void main(String args[]) {
        int arr[] = { 2, -9, 17, 0, 1, -10, -4, -8 };
        int result = countNegativeNumbers(arr);
        System.out.println("Number of negative elements in the array: " + result);
    }

    public static int countNegativeNumbers(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        return count;
    }
}
