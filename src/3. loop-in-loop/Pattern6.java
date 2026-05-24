/* Prints an inverted right-angled triangle pattern of stars using nested loops. Expected Output (n=5):

 * * * * *
 * * * *
 * * *
 * *
 *

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
