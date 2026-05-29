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
