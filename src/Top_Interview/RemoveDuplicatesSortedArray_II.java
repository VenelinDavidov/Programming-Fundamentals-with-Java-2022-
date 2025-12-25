package Top_Interview;

import java.util.Scanner;

public class RemoveDuplicatesSortedArray_II {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int result = removeDuplicates(nums);
        System.out.println(result);
    }
    //Input: nums = [0,0,1,1,1,1,2,3,3]
    //Output: 7, nums = [0,0,1,1,2,3,3,_,_]

    private static int removeDuplicates(int[] nums) {

        int k = 2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
