/* Prints a right-angled triangle pattern of numbers using nested loops. Expected Output (n=5):

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

*/
public class Pattern4 {
    public static void main(String[] args) {
        printPattern(5);
    }

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
