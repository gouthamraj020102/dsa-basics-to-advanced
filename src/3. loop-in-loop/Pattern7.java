/* Prints a right-angled triangle pattern with spaces creating a centered pyramid. Expected Output (n=5):

         *
       * *
     * * *
   * * * *
 * * * * *

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
