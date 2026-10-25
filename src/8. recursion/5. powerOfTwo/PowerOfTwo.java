public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        System.out.println("2 raised to the power of " + n + " is: " + powerOfTwo(n));
    }

    public static boolean powerOfTwo(int n) {
        if (n == 1) {
            return true;
        } else if (n < 1 || n % 2 != 0) {
            return false;
        }
        return powerOfTwo(n/2);
    }
}
