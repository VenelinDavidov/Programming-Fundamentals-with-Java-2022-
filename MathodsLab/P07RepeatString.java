package MethodsLab;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String inputText = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        String resultText = repeatString(n, inputText);
        System.out.println(resultText);
    }

    public static String repeatString(int n, String text) {
        String result = " ";
        for (int i = 0; i < n; i++) {
            result = result + text;
        }
        return result;
    }
}
