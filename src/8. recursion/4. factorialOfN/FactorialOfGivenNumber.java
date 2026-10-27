public class FactorialOfGivenNumber {
    public static void main(String[] args) {
        int number = 5; // Change this number to calculate factorial of a different number
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
