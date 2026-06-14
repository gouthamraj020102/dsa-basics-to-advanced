/**
Problem: Print a right-angled triangle of stars (increasing)

Question: Write a program to print a right-angled triangle of stars where each row contains an increasing number of stars
Shows variable inner loop bounds to create progressive patterns

Algorithm Approach:
- Outer loop: iterate n times for rows (i from 0 to n-1)
- Inner loop: iterate (i+1) times for columns
- Variable inner loop bounds create progressive increase
- Print "* " for each column position

Example Output (n=5):
 *
 * *
 * * *
 * * * *
 * * * * *

Edge Cases:
- n=1: Single star
- n=0: No output
- Large n: Creates triangular pattern
*/

public class Pattern2 {
    public static void main(String[] args) {
        printPattern(5);
    }

    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
