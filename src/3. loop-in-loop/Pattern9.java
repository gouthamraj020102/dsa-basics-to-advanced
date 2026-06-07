/**
Problem: Print binary pattern with continuous toggle across entire output

Question: Write a program to print a binary pattern where 0 and 1 toggle throughout the entire output (not resetting per row)
Demonstrates state management across loops to create a continuous toggle pattern

Algorithm Approach:
- Single toggle variable maintained across all iterations
- Outer loop: n times for rows
- Inner loop: (i+1) times for columns
- Toggle value switches on every print operation
- Creates different pattern than Pattern8 where toggle resets per row

Example Output (n=5):
1
0 1
0 1 0
1 0 1 0
1 0 1 0 1

Edge Cases:
- n=1: Single "1"
- n=0: No output
- Pattern depends on continuous state, not row-by-row
- Compare with Pattern8 to understand state management
*/

public class Pattern9 {
    public static void main(String[] args) {
        printPattern(5);
    }

    public static void printPattern(int n) {
        int toggle = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(toggle + " ");
                toggle = 1 - toggle; // Toggle between 0 and 1
            }
            System.out.println();
        }
    }
}
