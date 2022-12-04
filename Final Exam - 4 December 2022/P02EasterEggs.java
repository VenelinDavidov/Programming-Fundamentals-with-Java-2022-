package FinalExam_4_December_2022;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02EasterEggs {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "([@#]+)(?<collour>[a-z]{3,})([@#]+)([\\W]*?)([\\/]+)(?<number>[0-9]+)([\\/]+)";

        Pattern patternt = Pattern.compile(regex);

        Matcher matcher = patternt.matcher(input);

        while (matcher.find()){
            int quantityNp = Integer.parseInt(matcher.group("number"));
            String colorsNext = matcher.group("collour");

            System.out.printf("You found %d %s eggs!%n", quantityNp, colorsNext);
        }
    }
}


