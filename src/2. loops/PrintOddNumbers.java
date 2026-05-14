// Question: Find and print all odd numbers from an array
public class PrintOddNumbers {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 7, 0, 8, 3, 80};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
        int i = 0;
        while (i < numbers.length) {
            if (numbers[i] % 2 == 1) {
                System.out.print(numbers[i] + " ");
            }
            i++;
        }
        System.out.println();
    }
}
