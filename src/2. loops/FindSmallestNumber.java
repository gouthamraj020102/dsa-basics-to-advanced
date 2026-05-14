// Question: Write a function to find and return the smallest element in an array
public class FindSmallestNumber {
    public static void main(String args[]) {
        int arr[] = { -9, -19, -3 };
        int result = findSmallestNumber(arr);
        System.out.println("The smallest element in the array is: " + result);
    }

    public static int findSmallestNumber(int arr[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
