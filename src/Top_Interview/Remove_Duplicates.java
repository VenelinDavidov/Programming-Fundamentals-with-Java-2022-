package Top_Interview;

import java.util.Scanner;

public class Remove_Duplicates {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);


          int[] nums = {0,0,1,1,1,2,2,3,3,4};
          int result = removeDuplicates(nums);
          System.out.println(result);
    }

//    Input: nums = [1,1,2]
//    Output: 2, nums = [1,2,_]

    private static int removeDuplicates(int[] nums) {

        int k = 1;
         for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]){
              nums[k] = nums[i];
              k++;
            }
        }
         return k;
    }
}
