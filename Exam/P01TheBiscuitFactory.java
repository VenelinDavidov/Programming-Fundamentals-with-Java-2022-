package ExamMid;

import java.util.Scanner;

public class P01TheBiscuitFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBiscuits = Integer.parseInt(scanner.nextLine());
        int employees = Integer.parseInt(scanner.nextLine());
        int biscuitFor30Day = Integer.parseInt(scanner.nextLine());

        double totalBiscuitsPerPersonForMonth = countBiscuits * employees * 20;
        double biscuitForThirdDay = (countBiscuits * 0.75 * 10) * employees;

        double total = totalBiscuitsPerPersonForMonth + biscuitForThirdDay;

        double difference = total - biscuitFor30Day;
        double percentages = Math.abs(difference / biscuitFor30Day * 100);


        if (total > biscuitFor30Day) {
            System.out.printf("You have produced %.0f biscuits for the past month.%n", total);
            System.out.printf("You produce %.2f percent more biscuits.", percentages);
        } else {
            System.out.printf("You have produced %.0f biscuits for the past month.%n", total);
            System.out.printf("You produce %.2f percent less biscuits.", percentages);
        }

    }
}
