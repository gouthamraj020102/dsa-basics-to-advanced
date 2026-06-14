/**
Level 2 - Loops
Problem: Find the smallest element in an array

Question: Write a method to find and return the smallest element in an array
Finds the minimum value by comparing array elements

Algorithm Approach:
- Initialize smallest with Integer.MAX_VALUE
- Iterate through each element in array
- Compare element with current minimum
- Update minimum if current element is smaller
- Return the minimum value found

Example:
- Input: [-9, -19, -3]
- Output: -19
- Input: [5, 0, 10, 8, 17, 1]
- Output: 0

Edge Cases:
- All negative numbers: Finds the most negative
- Single element: Returns that element
- Array with zero: Zero handled correctly
- Duplicate smallest values: Returns one of them
- Large integers: Works due to Integer.MAX_VALUE initialization
*/

public class FindSmallestNumber {
    public static void main(String args[]) {
        int arr[] = { -9, -19, -3 };
        int result = findSmallestNumber(arr);
        System.out.println("The smallest element in the array is: " + result);
    }

    public static int findSmallestNumber(int arr[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
