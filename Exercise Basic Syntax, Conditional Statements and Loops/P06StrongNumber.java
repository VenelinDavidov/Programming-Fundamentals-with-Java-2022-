package ExerciseBasicSyntax;

import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());
        int startNum = number;

        int sumFac = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            int fact = 1;
            for (int i = 1; i <= lastDigit; i++) {
                fact = fact * i;
            }
            sumFac += fact;
            number = number / 10;
        }

        if (sumFac == startNum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
