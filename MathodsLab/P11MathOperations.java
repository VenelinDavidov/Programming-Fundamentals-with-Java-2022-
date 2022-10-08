package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int number2 = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat ("##.##");

        System.out.println(df.format(operations(number1, operator, number2)));
    }

    public static double operations (int number1, String operator, int number2) {
        double res = 0;
        switch (operator) {
            case "*":
                res = number1 * number2;
                break;
            case "/":
                res = number1 * 1.0 / number2;
                break;
            case "+":
                res = number1 + number2;
                break;
            case "-":
                res = number1 - number2;
                break;
        }
        return res;
    }
}