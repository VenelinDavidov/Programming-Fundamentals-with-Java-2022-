package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int source = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int totalAmountSpices = 0;
        while (source >= 100) {
            int spices = source - 26;
            totalAmountSpices += spices;
            days++;
            source = source - 10;
        }
        System.out.println(days);

        if (totalAmountSpices >= 26) {
            totalAmountSpices -= 26;
        }
        System.out.println(totalAmountSpices);
    }
}
