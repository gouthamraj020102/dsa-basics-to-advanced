public class SumOfAllTheNumbers {

    static int[] arr = {5, 3, 2, 0, 1};

    public static void main(String[] args) {
        int sum = sumOfAllNumbers(arr.length - 1);
        System.out.println("Sum of all the numbers " + java.util.Arrays.toString(arr) + " is: " + sum);
    }

    public static int sumOfAllNumbers(int n) {
        if (n == 0) {
            return arr[0];
        }
        return arr[n] + sumOfAllNumbers(n - 1);
    }
}
