// Question: Create a function to check whether a number is even or odd.
public class CheckEvenOdd {
    public static void main(String[] args) {
        isEvenOdd(6);
        isEvenOdd(11);
        isEvenOdd(11000050);
    }

    private static void isEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }
}