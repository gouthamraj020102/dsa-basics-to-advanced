/**
Problem: Print an inverted right-angled triangle of stars

Question: Write a program to print an inverted right-angled triangle of stars where each row contains a decreasing number of stars
Shows reverse iteration with nested loops creating an inverted pattern

Algorithm Approach:
- Two approaches provided:
  1. printPattern(): Outer loop from n down to 1, inner loop from 0 to i
  2. printPatternV2(): Outer loop from 0 to n-1, inner loop from 0 to (n-i-1)
- Each row prints fewer stars than previous row
- Inverse of Pattern2

Example Output (n=5):
 * * * * *
 * * * *
 * * *
 * *
 *

Edge Cases:
- n=1: Single star
- n=0: No output
- Large n: Creates inverted triangular pattern
*/

public class Pattern6 {
    public static void main(String[] args) {
        printPattern(5);
        printPatternV2(8);
    }

    public static void printPattern(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPatternV2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
