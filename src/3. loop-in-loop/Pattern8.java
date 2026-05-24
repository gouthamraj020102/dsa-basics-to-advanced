/* Prints a binary alternating pattern (1 and 0) increasing in each row. Expected Output (n=5):

1
1 0
1 0 1
1 0 1 0
1 0 1 0 1

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
