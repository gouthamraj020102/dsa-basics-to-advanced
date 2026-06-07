/**
Problem: Print an n x n square pattern of stars

Question: Write a program to print an n x n square pattern of stars using nested loops
Demonstrates nested loops for creating 2D patterns

Algorithm Approach:
- Outer loop: iterate n times for rows
- Inner loop: iterate n times for columns
- Print "* " for each column position
- Print newline after each row completes

Example Output (n=4):
 * * * *
 * * * *
 * * * *
 * * * *

Edge Cases:
- n=1: Single star
- n=0: No output
- Large n: Creates large grid, good for understanding nested loops
*/

public class Pattern1 {
    public static void main(String[] args) {
        printPattern(4);
    }

    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
