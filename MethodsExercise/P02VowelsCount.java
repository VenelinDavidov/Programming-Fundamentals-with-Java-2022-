package Methods_Exercise;

import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // входни данни
        String textInput = scanner.nextLine();

        printVowelsCount(textInput.toLowerCase()); // масив от малки букви

        //метод който принтира гласни букви.
    }

    public static void printVowelsCount(String text) {
        // text изцяло с малки букви;
        // текст Desislava ---> ['D','e',s','i'----];
        int count = 0;  // брои гласни букви

        // метод за решаване с for цикъл!!!!!!!
        //for ( int index = 0; index<= text.length () - 1; index ++) {
        // char symbol = text.charAt(index);
        //if (symbol == 'a' || symbol == 'o' || symbol == 'e' || symbol == 'i' || symbol == 'u') {
        //   count++;

        // foreach
        for (char symbol : text.toCharArray()) {
            if (symbol == 'a' || symbol == 'o' || symbol == 'e' || symbol == 'i' || symbol == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
