package Top_Interview;

import java.util.Arrays;
import java.util.Scanner;


public class Rotate_Array {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
        System.out.println("Rotated array: " + Arrays.toString(nums));
    }

    //Input: nums = [1,2,3,4,5,6,7], k = 3
    //Output: [5,6,7,1,2,3,4]
    //Explanation:
    //rotate 1 steps to the right: [7,1,2,3,4,5,6]
    //rotate 2 steps to the right: [6,7,1,2,3,4,5]
    //rotate 3 steps to the right: [5,6,7,1,2,3,4]

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k < 0) {
            k += nums.length;
        }
        reverse(nums, 0, nums.length - k - 1); // 1,2,3,4
        reverse(nums, nums.length - k, nums.length - 1); //5,6,7
        reverse(nums, 0, nums.length - 1); //5,6,7,1,2,3,4
    }


    public static void reverse(int[] nums, int i, int j) {
        int li = i;
        int ri = j;

        while (li < ri) {
            int temp = nums[li];
            nums[li] = nums[ri];
            nums[ri] = temp;

            li++;
            ri--;
        }
    }
}