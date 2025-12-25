package Top_Interview;

import java.util.Arrays;
import java.util.Scanner;

public class Majority_Element {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          int[] nums = {3,2,3};
          int result = majorityElement(nums);
          System.out.println(result);
    }

    //Input: nums = [2,2,1,1,1,2,2]
    //Output: 2

    private static int majorityElement(int[] nums) {

        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
