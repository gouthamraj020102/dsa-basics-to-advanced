// Question: Find and print all even numbers from an array
public class PrintEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 7, 0, 8, 3, 80};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
