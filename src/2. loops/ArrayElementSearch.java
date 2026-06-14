/**
Level 2 - Loops
Problem: Linear Search in Array

Question: Write a method to search for an element in an array and return its index. If the element is not found, return -1
Linear search implementation with proper index handling

Algorithm Approach:
- Linear search: iterate through array from start to end
- Compare each element with target value
- Return index immediately when match is found
- Return -1 if loop completes without finding element

Example:
- Input: search for 10 in [4, 2, 0, 10, 8, 30]
- Output: 3 (index of 10)
- Input: search for 99 in [4, 2, 0, 10, 8, 30]
- Output: -1 (not found)

Edge Cases:
- Element not found: Returns -1
- Multiple occurrences: Returns index of first occurrence
- Element at start: Returns 0 immediately
- Element at end: Returns length-1 after full iteration
- Empty array: Returns -1
*/

public class ArrayElementSearch {
    public static void main(String args[]) {
        int number = 10;
        int arr[] = { 4, 2, 0, 10, 8, 30 };
        int result = searchElement(number, arr);
        System.out.println(result);
    }

    public static int searchElement(int number, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
