package MapsLambdaAndStreamAPI_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P04WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = Arrays.stream(scanner.nextLine().split(" "))
                .filter(w -> w.length() % 2 == 0)
                .toArray(String[]::new);


        System.out.println(String.join(System.lineSeparator(), wordsArr));


    }

    static boolean evenWord(String s) {
        if (s.length() % 2 == 0) {
            return true;
        }
        return false;
    }
}
