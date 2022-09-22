package ExerciseBasicSyntax;

import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int starNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int number = starNum; number <= endNum; number++) {
            System.out.print(number + " ");
            sum += number;
        }
        System.out.println();
        System.out.println("Sum: "+ sum);
    }
}
