/* Prints a right-angled triangle pattern of stars using nested loops. Expected Output (n=5):

 *
 * *
 * * *
 * * * *
 * * * * *

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
