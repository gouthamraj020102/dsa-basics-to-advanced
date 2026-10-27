public class First5Numbers {
    public static void main(String[] args) {
        System.out.println("Sum of First 5 numbers is :" + sum(5));
    }

    public static int sum(int n) {
        if (n == 0)
            return 0;
        return n + sum(n - 1);
    }
}
