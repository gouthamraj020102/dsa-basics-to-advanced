/**
Problem: Print a right-angled triangle of numbers (increasing)

Question: Write a program to print a right-angled triangle of numbers where each row contains numbers from 1 to the row number
Demonstrates nested loops with dynamic value printing instead of static symbols

Algorithm Approach:
- Outer loop: iterate from 1 to n for rows
- Inner loop: iterate from 1 to current row number
- Print column number in each position
- Dynamic output instead of static symbols

Example Output (n=5):
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

Edge Cases:
- n=1: Single "1"
- n=0: No output
- Large n: Numbers will eventually exceed single digits
*/

public class Pattern3 {
    public static void main(String[] args) {
        printPattern(5);
    }

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
