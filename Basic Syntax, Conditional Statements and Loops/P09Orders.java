package ExerciseBasicSyntax;

import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());
        double price = 0;
        int days = 0;
        int capsulesCount = 0;
        double sum = 0;
        double currentPrice = 0;


        for (int i = 1; i <= orders; i++) {
            price = Double.parseDouble(scanner.nextLine());
            days = Integer.parseInt(scanner.nextLine());
            capsulesCount = Integer.parseInt(scanner.nextLine());
            currentPrice = (days * capsulesCount) * price;
            System.out.printf("The price for the coffee is: $%.2f%n", currentPrice);
            sum = sum + currentPrice;
        }
        System.out.printf("Total: $%.2f", sum);
    }
}
