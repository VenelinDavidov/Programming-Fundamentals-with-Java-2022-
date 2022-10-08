package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);


        double numInput = Double.parseDouble(scanner.nextLine());
        double powerInput = Double.parseDouble(scanner.nextLine());

        double result = mathPower(numInput, powerInput);

        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(result));
    }

    public static double mathPower(double num, double power) {
        // 2^4  -> 2 * 2 * 2 * 2
        double result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * num;
        }

        return result;
    }
}
