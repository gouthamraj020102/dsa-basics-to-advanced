// Question: Write a function to search for an element in an array and return its index. If the element is not found, return -1
public class ArrayElementSearch {
    public static void main(String args[]) {
        int number = 10;
        int arr[] = { 4, 2, 0, 10, 8, 30 };
        int result = searchElement(number, arr);
        System.out.println(result);
    }

    public static int searchElement(int number, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
