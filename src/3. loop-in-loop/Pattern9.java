/* Prints a binary toggling pattern where 0 and 1 alternate across the entire output. Expected Output (n=5):

1
0 1
0 1 0
1 0 1 0
1 0 1 0 1

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
