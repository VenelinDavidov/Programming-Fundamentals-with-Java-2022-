package Final_Exam_Preparation;

import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] targets = nextIntArray(scanner);
        String command = scanner.nextLine();
        int totalShot = 0;
        while (!command.equals("End")) {
            int targetIndex = Integer.parseInt(command);
            if (isValidIndex(targets, targetIndex)) {
                int shotTarget = targets[targetIndex];
                if (shotTarget != -1) {
                    totalShot++;
                    targets[targetIndex] = -1;
                    registrarTargetHit(targets, shotTarget);
                }
            } else {

            }


            command = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", totalShot);
        printArray(targets, " ");

    }

    private static void registrarTargetHit(int[] targets, int shotTarget) {
        for (int i = 0; i < targets.length; i++) {
            if (targets[i] != -1) {
                if (targets[i] > shotTarget) {
                    targets[i] -= shotTarget;
                } else {
                    targets[i] += shotTarget;
                }
            }
        }
    }

    private static boolean isValidIndex(int[] array, int targetIndex) {
        return targetIndex >= 0 && targetIndex < array.length;
    }

    private static void printArray(int[] array, String separator) {
        //Shot targets 3 ->
        // -1 -1 130 -1
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(separator);
            }
        }
    }

    private static int[] nextIntArray(Scanner scanner) {
        String[] intsAsString = scanner.nextLine().split("\\s+");
        int[] array = new int[intsAsString.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(intsAsString[i]);
        }
        return array;
    }
}


