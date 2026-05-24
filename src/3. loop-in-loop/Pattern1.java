/* Prints an n x n square pattern of stars using nested loops. Expected Output (n=4):

 * * * *
 * * * *
 * * * *
 * * * *

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
