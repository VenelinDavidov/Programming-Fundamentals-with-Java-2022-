package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int factor = Integer.parseInt(scanner.nextLine());

        int firstPower = power;
        int countPoke = 0;
        while (power >= distance) {
            power -= distance;
            countPoke++;

            if (power == firstPower / 2) {
                if (factor != 0){
                    power /= factor;
                }
            }
        }
        System.out.println(power);
        System.out.println(countPoke);
    }
}
