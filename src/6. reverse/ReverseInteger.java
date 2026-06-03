// Write a function to reverse the digits of an integer, handling negative numbers and overflow
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverseInteger(123)); // Output: 321
        System.out.println(reverseInteger(-456)); // Output: -654
        System.out.println(reverseInteger(120)); // Output: 21
        System.out.println(reverseInteger(1534236469)); // Output: 0 (overflow)
    }

    public static int reverseInteger(int n) {
        long rev = 0;
        int nCopy = n; // Keep a copy of the original number for sign handling
        n = Math.abs(n); // Work with the absolute value

        while (n > 0) {
            int remainder = n % 10;
            rev = rev * 10 + remainder;
            n /= 10;
        }

        int limit = (int) Math.pow(2, 31);
        if (rev < -limit || rev > limit) {
            return 0; // Return 0 for overflow
        }
        return (int)(nCopy < 0 ? -rev : rev); // Return the reversed number with the correct sign
    }
}
