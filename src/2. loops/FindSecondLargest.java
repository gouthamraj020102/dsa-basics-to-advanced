/**
Level 3 - Loops
Problem: Find the second largest element in an array

Question: Write a method to find and return the second largest element in an array.
Tracks both the largest and second largest elements in a single pass.

Algorithm Approach:
- Track both largest and secondLargest values simultaneously
- Initialize both with Integer.MIN_VALUE
- Single pass through array:
  - If element > largest: update secondLargest = largest, then largest = element
  - Else if element > secondLargest AND element != largest: update secondLargest
- Return secondLargest

Example:
- Input: [5, 2, 9, 1, 5, 6]
- Output: 6 (largest=9, second=6)
- Input: [4, 9, 0, 2, 8, 7, 1]
- Output: 8 (largest=9, second=8)

Edge Cases:
- Array with less than 2 elements: Returns Integer.MIN_VALUE
- All same elements: Returns Integer.MIN_VALUE (no distinct second largest)
- Two elements: Returns the smaller one
- Duplicates of largest: Still finds second largest correctly
*/

public class FindSecondLargest {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int secondLargest = findSecondLargest(arr);
        System.out.println("The second largest number is: " + secondLargest);

        int [] arr2 = {4, 9, 0, 2, 8, 7, 1};
        int secondLargest2 = findSecondLargest(arr2);
        System.out.println("The second largest number is: " + secondLargest2);
    }

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return Integer.MIN_VALUE;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
