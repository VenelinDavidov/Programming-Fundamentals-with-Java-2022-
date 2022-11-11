package TextProcessing_Lab;

import java.util.Scanner;

public class P03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String toRemuve = scanner.nextLine();
        String text = scanner.nextLine();


        int index = text.indexOf(toRemuve);
        while (index != -1) {

            text = text.replace(toRemuve, "");
            index = text.indexOf(toRemuve);
        }
        System.out.println(text);
    }
}
