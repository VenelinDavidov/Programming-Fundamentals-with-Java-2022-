package Top_Interview;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] num = {3, 2, 2, 3};
        int val = 3;

        int count = removeElement(num, val);

    }

    private static int removeElement(int[] num, int val) {

        int k = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] != val) {
                num[k] = num[i];
                k++;
            }
        }
        System.out.println(k);
        System.out.println(Arrays.toString(num));

        return k;
    }
}
