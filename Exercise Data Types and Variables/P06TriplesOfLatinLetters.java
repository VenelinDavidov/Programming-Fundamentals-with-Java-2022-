package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class P06TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        for (int latter1 = 'a'; latter1 < 'a' + n; latter1++) {
            for (int latter2 = 'a'; latter2 < 'a' + n; latter2++) {
                for (int latter3 = 'a'; latter3 < 'a' + n; latter3++) {
                    System.out.printf("%c%c%c%n",latter1, latter2, latter3);
                }
            }
        }
    }
}
