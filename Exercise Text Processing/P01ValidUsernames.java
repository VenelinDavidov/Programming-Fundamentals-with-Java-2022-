package TextProcessing_Exercise;

import java.util.Scanner;

public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] userName = input.split(", ");


        for (String username : userName) {
            if (isValidUserName(username)) {
                System.out.println(username);
            }
        }
    }

    public static boolean isValidUserName(String username) {
        if (username.length() < 3 || username.length() > 16) {
            return false;
        }



        for (char symbol : username.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;
            }
        }


        return true;
    }
}
