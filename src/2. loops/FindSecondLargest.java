// Question: Write a function to find and return the second largest element in an array
public class FindSecondLargest {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int secondLargest = findSecondLargest(arr);
        System.out.println("The second largest number is: " + secondLargest);

        int [] arr2 = {4, 9, 0, 2, 8, 7, 1};
        int secondLargest2 = findSecondLargest(arr2);
        System.out.println("The second largest number is: " + secondLargest2);
    }

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return Integer.MIN_VALUE;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
