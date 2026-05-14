// Question: Write a function to count the number of negative elements in an array
public class CountNegativeElements {
    public static void main(String args[]) {
        int arr[] = { 2, -9, 17, 0, 1, -10, -4, -8 };
        int result = countNegativeNumbers(arr);
        System.out.println("Number of negative elements in the array: " + result);
    }

    public static int countNegativeNumbers(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        return count;
    }
}
