package TextProcessing_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = scanner.nextLine().split(" ");

        List<String> repeatString = new ArrayList<>();
        for (int i = 0; i < wordsArr.length; i++) {
            String currentWord = wordsArr[i];
            int length = currentWord.length();

            String repeatWord = repeatString(currentWord, length);

            repeatString.add(repeatWord);
        }
        System.out.println(String.join("", repeatString));
    }

    public static String repeatString(String wort, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result = result + wort;
        }
        return result;
    }
}
