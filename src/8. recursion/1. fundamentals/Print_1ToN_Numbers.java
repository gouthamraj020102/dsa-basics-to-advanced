// This program prints numbers from 1 to n using recursion.
public class Print_1ToN_Numbers {
    public static void main(String[] args) {
        int n = 5;
        printToN(n);
    }

    public static void printToN(int n) {
        if (n == 0) {
            return;
        }
        printToN(n - 1);
        System.out.println(n);
    }
}
