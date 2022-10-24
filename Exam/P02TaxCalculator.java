package ExamMid;

import java.util.Scanner;

public class P02TaxCalculator {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        String[] vehicles = scanner.nextLine().split(">>");

        double totalTaxPay = 0;

        for (int i = 0; i < vehicles.length; i++) {
            int counter = 0;
            double initialTax = 0;
            double totalTax = 0;

            String carType = vehicles[i].split("\\s+")[0];

            int payTax = Integer.parseInt(vehicles[i].split("\\s+")[1]);
            int kilometers = Integer.parseInt(vehicles[i].split("\\s+")[2]);

            switch (carType) {
                case "family":

                    initialTax = 50;
                    initialTax = initialTax - (payTax * 5);
                    counter = kilometers / 3000;
                    totalTax = (counter * 12) + initialTax;
                    System.out.printf("A %s car will pay %.2f euros in taxes.%n", carType, totalTax);
                    totalTaxPay += totalTax;
                    break;

                case "heavyDuty":

                    initialTax = 80;
                    initialTax = initialTax - (payTax * 8);
                    counter = kilometers / 9000;
                    totalTax = (counter * 14) + initialTax;
                    System.out.printf("A %s car will pay %.2f euros in taxes.%n", carType, totalTax);
                    totalTaxPay += totalTax;
                    break;

                case "sports":

                    initialTax = 100;
                    initialTax = initialTax - (payTax * 9);
                    counter = kilometers / 2000;
                    totalTax = (counter * 18) + initialTax;
                    System.out.printf("A %s car will pay %.2f euros in taxes.%n", carType, totalTax);
                    totalTaxPay += totalTax;
                    break;

                default:
                    System.out.println("Invalid car type.");
                    break;
            }
        }


        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.", totalTaxPay);
    }
}


