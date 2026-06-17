// This program prints numbers from n down to 1 using recursion.=
public class Print_Nto1_Numbers {
    public static void main(String[] args) {
        int n = 5;
        printToN(n);
    }

    public static void printToN(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printToN(n - 1);
    }
}