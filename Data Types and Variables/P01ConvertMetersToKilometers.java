package DataTypesAndVariables;

import java.util.Scanner;

public class P01ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short meters = Short.parseShort(scanner.nextLine());
        double km = meters /1000.0;

        System.out.printf("%.2f",km);
    }
}
