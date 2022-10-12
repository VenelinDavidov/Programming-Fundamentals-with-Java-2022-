package Methods_Exercise;

import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String number = scanner.nextLine();

        while (!number.equals("END")) {
            if (!isPalindrome(number)) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }


            number = scanner.nextLine();
        }
    }

    public static boolean isPalindrome(String number) {

        String reversedString = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            reversedString += number.charAt(i);
        }
        return number.equals(reversedString);
    }
}
