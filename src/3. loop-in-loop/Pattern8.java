/**
Problem: Print binary alternating pattern (1 and 0) with increasing count

Question: Write a program to print a binary alternating pattern (1 and 0) where each row contains increasing count
Shows nested loops with conditional logic to alternate between two values

Algorithm Approach:
- Two approaches provided:
  1. printPattern(): Check if column index is even (print 1) or odd (print 0)
  2. printPatternV2(): Use toggle variable to alternate values
- Outer loop: n times for rows
- Inner loop: (i+1) times for columns
- Alternate between 1 and 0 based on position

Example Output (n=5):
1
1 0
1 0 1
1 0 1 0
1 0 1 0 1

Edge Cases:
- n=1: Single "1"
- n=0: No output
- Even vs odd rows: Both handled correctly
*/

public class Pattern8 {
    public static void main(String[] args) {
        printPattern(5);
        printPatternV2(6);
    }

    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if(j % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void printPatternV2(int n) {
        for (int i = 0; i < n; i++) {
            int toggle = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(toggle + " ");
                toggle = 1 - toggle; // Toggle between 1 and 0
            }
            System.out.println();
        }
    }
}
