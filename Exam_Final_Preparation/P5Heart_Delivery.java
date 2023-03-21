package Final_Exam_Preparation;

import java.util.Arrays;
import java.util.Scanner;

public class P5Heart_Delivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] houses = Arrays
                .stream(scanner.nextLine().split("@"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int currentPosition = 0;
        String command = scanner.nextLine();

        while (!command.equals("Love!")) {
            String[] commandAndParameter = command.split(" ");
            int jump = Integer.parseInt(commandAndParameter[1]);
            currentPosition += jump;

            if (currentPosition >=  houses.length) {
                currentPosition = 0;
            }
            if (houses[currentPosition] > 0) {
                houses[currentPosition]-=2;
                if (houses[currentPosition]==0){
                    System.out.printf("Place %d has Valentine's day.%n",currentPosition);
                }
            } else {
                System.out.printf("Place %d already had Valentine's day.%n",currentPosition);
            }

            command = scanner.nextLine();
        }

        int failed = 0;
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] != 0) {
                failed++;
            }
        }

        System.out.printf("Cupid's last position was %d.%n", currentPosition);
        if (failed > 0) {
            System.out.printf("Cupid has failed %d places.%n", failed);
        } else {
            System.out.println("Mission was successful.");
        }
    }
}

