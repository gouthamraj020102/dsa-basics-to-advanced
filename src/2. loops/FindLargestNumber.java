// Question: Write a function to find and return the largest element in an array
public class FindLargestNumber {
    public static void main(String args[]) {
        int arr[] = { 5, 0, 10, 8, 17, 1 };
        int result = findLargestNumber(arr);
        System.out.println("The largest element in the array is: " + result);
        int result1 = findLargestNumberV1(arr);
        System.out.println("The largest element in the array is: " + result1);
        int result2 = findLargestNumberV2(arr);
        System.out.println("The largest element in the array is: " + result2);
    }

    // Bug: Initializing largest with -1 fails when the array contains only negative numbers
    // Example: {-5, -2, -10} → expected output is -2, but this method returns -1
    public static int findLargestNumber(int arr[]) {
        int largest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int findLargestNumberV1(int arr[]) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }


    public static int findLargestNumberV2(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}