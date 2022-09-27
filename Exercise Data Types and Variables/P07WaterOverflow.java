package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = 255;
        int currentLiters = 0;
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            int pourLitres = Integer.parseInt(scanner.nextLine());
            currentLiters += pourLitres;
            if (currentLiters > capacity) {
                System.out.println("Insufficient capacity!");
                currentLiters -= pourLitres;
            }
        }
        System.out.println(currentLiters);
    }
}
