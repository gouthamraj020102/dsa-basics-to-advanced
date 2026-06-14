/**
Level 2 - Loops
Problem: Find the largest element in an array

Question: Write a method to find and return the largest element in an array
Demonstrates multiple approaches to finding the maximum value with different initialization strategies

Algorithm Approach:
- Three approaches provided:
  1. findLargestNumber(): Initialize with -1 (INCORRECT for all-negative arrays)
  2. findLargestNumberV1(): Initialize with first element (CORRECT)
  3. findLargestNumberV2(): Initialize with Integer.MIN_VALUE (OPTIMAL)
- Compare each element with current maximum
- Update maximum if current element is larger

Example:
- Input: [5, 0, 10, 8, 17, 1]
- Output: 17
- Input: [-5, -2, -10]
- Output: -2 (using V1 or V2; V1 would fail)

Edge Cases:
- All negative numbers: Approach 1 fails, should use V1 or V2
- Single element: Returns that element
- Array with zero: Zero handled correctly
- Duplicate largest values: Returns one of them
*/

public class FindLargestNumber {
    public static void main(String args[]) {
        int arr[] = { 5, 0, 10, 8, 17, 1 };
        int result = findLargestNumber(arr);
        System.out.println("The largest element in the array is: " + result);
        int result1 = findLargestNumberV1(arr);
        System.out.println("The largest element in the array is: " + result1);
        int result2 = findLargestNumberV2(arr);
        System.out.println("The largest element in the array is: " + result2);
    }

    // Bug: Initializing largest with -1 fails when the array contains only negative numbers
    // Example: {-5, -2, -10} → expected output is -2, but this method returns -1
    public static int findLargestNumber(int arr[]) {
        int largest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int findLargestNumberV1(int arr[]) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }


    public static int findLargestNumberV2(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}