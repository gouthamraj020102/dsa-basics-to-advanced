/**
Problem: Print a right-angled triangle where each row repeats its row number

Question: Write a program to print a right-angled triangle of numbers where each row contains the row number repeated
Shows nested loops with repeated values based on row position

Algorithm Approach:
- Outer loop: iterate from 1 to n for rows
- Inner loop: iterate from 1 to current row number
- Print the row number (not column number) in each position
- Each row prints its row index i times

Example Output (n=5):
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

Edge Cases:
- n=1: Single "1"
- n=0: No output
- n>9: Row numbers will exceed single digits
*/

public class Pattern4 {
    public static void main(String[] args) {
        printPattern(5);
    }

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
