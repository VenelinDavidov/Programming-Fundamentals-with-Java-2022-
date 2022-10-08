package MethodsLab;

import java.util.Scanner;

public class P02Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	2.00 – 2.99 - "Fail"
        //•	3.00 – 3.49 - "Poor"
        //•	3.50 – 4.49 - "Good"
        //•	4.50 – 5.49 - "Very good"
        //•	5.50 – 6.00 - "Excellent"

        double gradeInput = Double.parseDouble(scanner.nextLine());

        printGradeInWord(gradeInput);
    }

    public static void printGradeInWord(double grade) {
        if (grade >= 2 && grade <= 2.99) {
            System.out.println("Fail");
        } else if (grade <= 3.49) {
            System.out.println("Poor");
        } else if (grade <= 4.49) {
            System.out.println(" Good");
        } else if (grade <= 5.49) {
            System.out.println("Very good");
        } else {
            System.out.println("Excellent");
        }
    }
}
