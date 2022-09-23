package DataTypesAndVariables;

import java.util.Scanner;

public class P05ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String secondName = scanner.nextLine();
        String deli = scanner.nextLine();


        System.out.printf("%s%s%s",name,deli,secondName );
    }
}
