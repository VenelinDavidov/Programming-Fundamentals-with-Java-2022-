package Methods_Exercise;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String text = scanner.nextLine();

        //метод, който принтира средния символ
        //нечетна дължина на текста -> 1 среден символ
        //четна дължина на текста -> 2 средни символа

       printMiddleCharacters(text);
    }
    public  static void printMiddleCharacters (String text){
        //нечетна дължина -> 1 среден символ
        //"aString" -> ['a', 'S', 't', 'r', 'i', 'n', 'g']

        if (text.length()% 2 == 1){
            int indexOfMiddleCharacter = text.length() / 2;
            System.out.println(text.charAt(indexOfMiddleCharacter));
        }
        //четна дължина -> 2 средни символа
        //"someText" -> ['s', 'o', 'm', 'e', 'T', 'e', 'x', 't']-> eT
        else {
            int indexFirstMiddleCharacter = text.length()/2 - 1;
            int indexSecondMiddleCharacter = text.length() / 2;

            System.out.println("" + text.charAt(indexFirstMiddleCharacter) + text.charAt(indexSecondMiddleCharacter));
        }
    }
}
