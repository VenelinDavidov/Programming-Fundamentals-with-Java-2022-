package ArraysLab;

import java.util.Scanner;

public class P02PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numberArr = new int[n];
        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            numberArr[i] = currentNum;

        }
        for (int i = numberArr.length - 1; i >= 0; i--) {
            System.out.printf("%d ", numberArr[i]);
        }
    }
}
