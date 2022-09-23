package DataTypesAndVariables;

import java.util.Scanner;

public class P07ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firsSymbol =scanner.nextLine().charAt(0);
        char secondSymbol =scanner.nextLine().charAt(0);
        char thirdSymbol =scanner.nextLine().charAt(0);

        System.out.printf("%c %c %c",thirdSymbol, secondSymbol,firsSymbol);
    }
}
