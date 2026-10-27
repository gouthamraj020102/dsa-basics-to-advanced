public class SumOfOddNumbers {

    static int[] arr = {5, 2, 6, 1, 3};

    public static void main(String[] args) {
        int sum = sumOfOddNumbers(arr.length - 1);
        System.out.println("Sum of odd numbers from " + java.util.Arrays.toString(arr) + " is: " + sum);
    }

    static int sumOfOddNumbers(int n) {
        boolean isOdd = arr[n] % 2 != 0;
        if (n == 0) {
            return isOdd? arr[0] : 0;
        }
        return (isOdd ? arr[n] : 0) + sumOfOddNumbers(n - 1);
    }
}
