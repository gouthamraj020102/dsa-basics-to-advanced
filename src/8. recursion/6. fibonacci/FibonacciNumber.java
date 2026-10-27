public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n; // Base case: return n for n = 0 or n = 1
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }
}
