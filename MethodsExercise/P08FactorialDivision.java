package Methods_Exercise;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        long fact1 = calculateFactorial(number1); // фаториела на първото цисло;

        long fact2 = calculateFactorial(number2);   // факториела на второто  число.

        double result = fact1 * 1.0 / fact2; // делим фатроиели на числата.
        System.out.printf("%.2f",result);
    }

    // метод който намира факториела на дадено  число и ми го връща.
    public static long calculateFactorial(int number) {
        long fact = 1; //стойност на факториел
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
