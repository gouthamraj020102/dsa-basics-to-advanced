/**
Problem: Print an inverted right-angled triangle of numbers

Question: Write a program to print an inverted right-angled triangle of numbers where each row contains decreasing count of numbers from 1
Demonstrates reverse iteration pattern with decreasing inner loop bounds

Algorithm Approach:
- Two approaches provided:
  1. printPattern(): Outer loop from n down to 1, inner loop from 1 to i
  2. printPatternV2(): Outer loop from 0 to n-1, inner loop from 0 to (n-i-1)
- Each row prints fewer elements than previous row
- Inverse of Pattern2

Example Output (n=5):
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

Edge Cases:
- n=1: Single "1"
- n=0: No output
- Large n: Demonstrates decreasing triangle pattern
*/

public class Pattern5 {
    public static void main(String[] args) {
        printPattern(5);
        printPatternV2(5);
    }

    public static void printPattern(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printPatternV2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
}
