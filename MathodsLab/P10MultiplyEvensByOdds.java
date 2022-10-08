package MethodsLab;

import java.util.Arrays;
import java.util.Scanner;

public class P10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(multipleOfEvenAndOddSum(num));
    }

    public static int multipleOfEvenAndOddSum(int num) {
        int evenSum = evenSum(num);
        int oddSum = oddSum(num);

        return evenSum * oddSum;
    }

    public static int evenSum(int num) {

        String intToString = Integer.toString(num);

        int[] arr = Arrays
                .stream(intToString.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }

        return sum;
    }

    public static int oddSum(int num) {
        String intToString = Integer.toString(num);

        int[] arr = Arrays
                .stream(intToString.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }

        return sum;
    }
}

