package ExerciseArrays;

import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countWagon = Integer.parseInt(scanner.nextLine());
        // съхраняваме хората, които се качват.
        int[] wagons = new int[countWagon];
        for (int wagon = 0; wagon < countWagon; wagon++) {
            int countPeople = Integer.parseInt(scanner.nextLine());
            wagons[wagon] = countPeople;
        }
        //[13, 24, 8]
        //2. отпечатаме
        //2.1. for -> индексите
        /*for (int index = 0; index <= wagons.length - 1; index++) {
            int currentElement = wagons[index];
            System.out.print(currentElement + " ");
        }
        System.out.println();*/

        //2.2. foreach -> елементите

        int sum = 0;
        for (int number : wagons) {
            System.out.print(number + " ");
            sum += number;
        }
        System.out.println();
        System.out.println(sum);
        //3. сумираме хората
        //System.out.println(Arrays.stream(wagons).sum());
    }
}
