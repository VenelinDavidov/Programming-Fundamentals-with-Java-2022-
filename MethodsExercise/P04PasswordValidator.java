package Methods_Exercise;

import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        //1. дължина -> Password must be between 6 and 10 characters
        boolean isPasswordLengthValid = isValidLength(password);
        //true -> валидна дължина
        //false -> невалидна дължина
        if (!isPasswordLengthValid) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        //2. съдържание
        boolean isPasswordContentValid = isValidContent(password);
        if (!isPasswordContentValid) {
            System.out.println("Password must consist only of letters and digits");
        }

        //3. брой цифри
        boolean isPasswordCountDigitsValid = isValidCountDigits(password);
        //true -> бр. цифри >= 2
        //false -> бр. цифри < 2
        if (!isPasswordCountDigitsValid) {
            System.out.println("Password must have at least 2 digits");
        }

        if (isPasswordLengthValid && isPasswordContentValid && isPasswordCountDigitsValid) {
            System.out.println("Password is valid");
        }

    }

    //метод за валидиране на дължината
    //true -> ако дължината е валидна
    //false -> ако дължината не е валидна
    private static boolean isValidLength (String password) {
        //валидна дължина: 6 - 10 вкл
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        }
        //невалидна дължина: Password must be between 6 and 10 characters
        else {
            return false;
        }
        //return password.length() >= 6 && password.length() <= 10;
    }

    //метод за валидиране на съдържанието
    //true -> ако съдържанието е валидно
    //false -> ако съдържанието не е валидно
    private static boolean isValidContent (String password) {
        //валидно съдържание: букви или цифри
        //невалидно съдържание: нещо различно от буква или цифра
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        //обходила всички символи
        return true;
    }

    //метод, който валидира брой на цифрите
    //true -> бр. цифрите >= 2
    //false -> бр. цифрите < 2
    private static boolean isValidCountDigits (String password) {
        int countDigits = 0; //брой на цифрите
        //Pesho123
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                countDigits++;
            }
        }
        //брой цифрите
        /*if (countDigits >= 2) {
            return true;
        } else {
            return false;
        }*/

        return countDigits >= 2;

    }
}

