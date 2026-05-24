/* Prints an inverted right-angled triangle pattern of numbers using nested loops. Expected Output (n=5):

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

*/
public class Pattern5 {
    public static void main(String[] args) {
        printPattern(5);
        printPatternV2(5);
    }

    public static void printPattern(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printPatternV2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
}
