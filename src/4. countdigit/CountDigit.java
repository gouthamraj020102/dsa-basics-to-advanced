// Write a function that returns the count of digits in a number
public class CountDigit {
    public static void main(String[] args) {
        int number = -298;
        int result = countDigitsInNumber(number);
        System.out.println("The count of digits in number: " + number + " is: " + result);
    }

    public static int countDigitsInNumber(int n) {
        int count = 0;
        if (n == 0) {
            return 1;
        }
        // Converting negative number to positive
        n = Math.abs(n);
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}
