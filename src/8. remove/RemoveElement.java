
// https://leetcode.com/problems/remove-element/description/
import java.util.Arrays;
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums1 = {3, 2, 2, 3};
        System.out.println(removeElement(nums1, 3)); // Output: 2

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(removeElement(nums2, 2)); // Output: 5
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        System.out.println("Modified array: " + Arrays.toString(nums));
        return k;
    }
}
