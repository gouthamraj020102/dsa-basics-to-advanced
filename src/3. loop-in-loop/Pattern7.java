/**
Problem: Print a centered pyramid pattern

Question: Write a program to print a centered pyramid using spaces and stars
Demonstrates nested loops with spacing to create a centered right-aligned triangle

Algorithm Approach:
- Two approaches provided:
  1. printPattern(): Separate loops for leading spaces and stars
  2. printPatternV2(): Combined loop with conditional spacing
- Outer loop: n times for rows
- Inner loop 1: print (n-i-1) leading spaces for centering
- Inner loop 2: print (i+1) stars

Example Output (n=5):
        *
      * *
    * * *
  * * * *
* * * * *

Edge Cases:
- n=1: Single centered star
- n=0: No output
- Large n: Creates large centered pyramid
*/

public class Pattern7 {
    public static void main(String[] args) {
        printPattern(5);
        printPatternV2(8);
    }

    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPatternV2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j < n - (i + 1)) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
