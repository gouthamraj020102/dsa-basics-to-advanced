# DSA-basics-to-advanced

A comprehensive collection of Data Structures and Algorithms problems, starting from basic conditional logic to array manipulation techniques.

# Project Structure

## 1. if-else

**CheckEvenOdd.java**
- *Question:* Create a function to check whether a number is even or odd.
- Demonstrates basic conditional logic using if-else statements to determine number parity.

## 2. loops

### Level 1

**PrintEvenNumbers.java**
- *Question:* Find and print all even numbers from an array.
- Iterates through an array and filters even elements.

**PrintOddNumbers.java**
- *Question:* Find and print all odd numbers from an array.
- Demonstrates different loop approaches (for and while loops) to filter odd elements.

### Level 2

**ArrayElementSearch.java**
- *Question:* Write a function to search for an element in an array and return its index. If the element is not found, return -1.
- Linear search implementation with proper index handling.

**CountNegativeElements.java**
- *Question:* Write a function to count the number of negative elements in an array.
- Counts occurrences of negative values using loop iteration.

**FindLargestNumber.java**
- *Question:* Write a function to find and return the largest element in an array.
- Demonstrates multiple approaches to finding the maximum value with different initialization strategies.

**FindSmallestNumber.java**
- *Question:* Write a function to find and return the smallest element in an array.
- Finds the minimum value by comparing array elements.

### Level 3

**FindSecondLargest.java**
- *Question:* Write a function to find and return the second largest element in an array.
- Tracks both the largest and second largest elements in a single pass.

## 3. loop-in-loop

### Pattern1.java
- *Question:* Write a program to print an n x n square pattern of stars.
- Demonstrates nested loops for creating 2D patterns.
- Example Output (n=4):

  ```
  * * * *
  * * * *
  * * * *
  * * * *
  ```

### Pattern2.java
- *Question:* Write a program to print a right-angled triangle of stars where each row contains an increasing number of stars.
- Shows variable inner loop bounds to create progressive patterns.
- Example Output (n=5):

  ```
  *
  * *
  * * *
  * * * *
  * * * * *
  ```

### Pattern3.java
- *Question:* Write a program to print a right-angled triangle of numbers where each row contains numbers from 1 to the row number.
- Demonstrates nested loops with dynamic value printing instead of static symbols.
- Example Output (n=5):

  ```
  1
  1 2
  1 2 3
  1 2 3 4
  1 2 3 4 5
  ```

### Pattern4.java
- *Question:* Write a program to print a right-angled triangle of numbers where each row contains the row number repeated.
- Shows nested loops with repeated values based on row position.
- Example Output (n=5):

  ```
  1
  2 2
  3 3 3
  4 4 4 4
  5 5 5 5 5
  ```

### Pattern5.java
- *Question:* Write a program to print an inverted right-angled triangle of numbers where each row contains decreasing count of numbers from 1.
- Demonstrates reverse iteration pattern with decreasing inner loop bounds.
- Example Output (n=5):

  ```
  1 2 3 4 5
  1 2 3 4
  1 2 3
  1 2
  1
  ```

### Pattern6.java
- *Question:* Write a program to print an inverted right-angled triangle of stars where each row contains a decreasing number of stars.
- Shows reverse iteration with nested loops creating an inverted pattern.
- Example Output (n=5):

  ```
  * * * * *
  * * * *
  * * *
  * *
  *
  ```

### Pattern7.java
- *Question:* Write a program to print a centered pyramid using spaces and stars.
- Demonstrates nested loops with spacing to create a centered right-aligned triangle.
- Example Output (n=5):

  ```
          *
        * *
      * * *
    * * * *
  * * * * *
  ```

### Pattern8.java
- *Question:* Write a program to print a binary alternating pattern (1 and 0) where each row contains increasing count.
- Shows nested loops with conditional logic to alternate between two values.
- Example Output (n=5):

  ```
  1
  1 0
  1 0 1
  1 0 1 0
  1 0 1 0 1
  ```

### Pattern9.java
- *Question:* Write a program to print a binary pattern where 0 and 1 toggle throughout the entire output.
- Demonstrates state management across loops to create a continuous toggle pattern.
- Example Output (n=5):

  ```
  1
  0 1
  0 1 0
  1 0 1 0
  1 0 1 0 1
  ```

## 4. Count Digit

### CountDigit.java
- *Question:* Write a function that returns the count of digits in a number.
- Counts the total number of digits present in an integer using division operations in a loop.
- Uses the mathematical approach of repeatedly dividing by 10 to count digits.

### Edge Cases:
1. When the number is 0: Returns 1, as 0 is considered a single digit.
2. Handling negative numbers: Converts negative numbers to their absolute value before counting digits, so -298 has 3 digits (same as 298).

## 5. Palindrome Number

### PalindromeNumber.java
- *Question:* Write a function to check whether a number is a palindrome. A palindrome number reads the same forward and backward.
- Reverses the number by extracting digits one by one using modulo and division operations, then compares it with the original number.
- Provides both a void method for printing results and a boolean method for returning the palindrome check result.

### Edge Cases:
1. **Single digit numbers**: Any single digit (0-9) is considered a palindrome.
2. **Negative numbers**: Negative numbers are typically considered non-palindromes as the sign differs when reversed (e.g., -121 reversed reads as 121-).

## 6. Reverse Integer

### ReverseInteger.java
- *Question:* Write a function to reverse the digits of an integer, handling negative numbers and overflow cases.
- Reverses the number by extracting digits using modulo and division operations, then reconstructs the reversed number.
- Preserves the sign of the original number and handles integer overflow by returning 0 if the result exceeds 32-bit limits.

### Edge Cases:
1. **Numbers with trailing zeros**: Trailing zeros become leading zeros after reversal and are dropped (e.g., 120 becomes 21).
2. **Negative numbers**: The sign is preserved during reversal (e.g., -456 becomes -654).
3. **Integer overflow**: If the reversed number exceeds 32-bit integer limits, returns 0 to prevent overflow.

## 7. Arrays

### 1. Remove Duplicates

- *Question:* Remove duplicates from a sorted array in-place and return the number of unique elements.
- Implements a two-pointer approach to maintain unique elements at the beginning of the array while modifying it in-place.
- Returns the count of unique elements, with all unique values positioned at the start of the array.

#### Edge Cases:
1. **Single element array**: Returns 1 as there are no duplicates.
2. **Array with no duplicates**: Returns the array length.
3. **Array with all duplicates**: Returns 1 as all elements are the same.

### 2. Remove Element

- *Question:* Remove all occurrences of a given value from an array in-place and return the number of remaining elements.
- Uses a two-pointer technique to move non-matching elements to the beginning of the array while preserving their relative order.
- Returns the count of elements that are not equal to the specified value.

#### Edge Cases:
1. **Value not present**: Returns the array length (all elements remain).
2. **All elements match the value**: Returns 0 (all elements removed).
3. **Single element array**: Returns 0 or 1 depending on whether the element matches the value.

### 3. Reverse String

- *Question:* Reverse a string represented as a character array in-place without using extra space.
- Implements a two-pointer approach where pointers move towards the center, swapping characters at each step.
- Modifies the array in-place by swapping elements from both ends until they meet in the middle.

#### Edge Cases:
1. **Single character string**: Returns the same character (no change needed).
2. **Empty array**: No operation needed, returns immediately.
3. **Two character string**: Simply swaps the two characters.

### 4. Best Time to Buy and Sell Stock

- *Question:* Given an array of stock prices, find the maximum profit you can make by buying once and selling once.
- Implements a single-pass algorithm tracking the minimum price seen so far and calculating the maximum profit possible.
- Time Complexity: O(n), Space Complexity: O(1)

#### Algorithm Approach:
1. Track the minimum price encountered so far.
2. For each price, calculate the profit if sold at that price (current price - minimum price).
3. Update the maximum profit if the current profit is greater.
4. Return the maximum profit found.

#### Example:
- Input: `[3, 2, 6, 5, 0, 3]`
- Output: `4` (Buy at 2, Sell at 6)
- Input: `[7, 6, 4, 3, 1]`
- Output: `0` (No profit possible, prices only decrease)

#### Edge Cases:
1. **Single element array**: Returns 0 (cannot make a transaction).
2. **Decreasing prices**: Returns 0 (no profit opportunity).
3. **Two element array**: Returns the maximum of 0 and (second - first).
