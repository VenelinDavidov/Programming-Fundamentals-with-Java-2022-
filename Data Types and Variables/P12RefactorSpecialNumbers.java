package DataTypesAndVariables;

import java.util.Scanner;

public class P12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean isSpecial = false;

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int number = i;

            while (number > 0) {
                sum += number % 10;
                number = number / 10;
            }

            isSpecial = (sum == 5) || (sum == 7) || (sum == 11);

            if (isSpecial) {
                System.out.printf("%d -> True%n",i);
            } else {
                System.out.printf("%d -> False%n",i);
            }
        }
    }
}
