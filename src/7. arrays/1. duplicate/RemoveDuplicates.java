// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
import java.util.Arrays;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        System.out.println(removeDuplicates(nums1)); // Output: 2

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums2)); // Output: 5
    }

    public static int removeDuplicates(int[] nums) {
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[x]) {
                x++;
                nums[x] = nums[i];
            }
        }
        System.out.println("Modified array: " + Arrays.toString(nums));
        return x + 1;
    }
}
