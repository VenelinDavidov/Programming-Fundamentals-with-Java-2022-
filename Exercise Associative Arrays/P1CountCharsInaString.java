package MapsLambdaAndStreamAPI_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P1CountCharsInaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().replaceAll("\\s+","");

        Map<Character, Integer> symbolCounts = new LinkedHashMap<>();

        for (char symbol : text.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }
            if (!symbolCounts.containsKey(symbol)) {
                symbolCounts.put(symbol, 1);
            } else {
                int currentCount = symbolCounts.get(symbol);
                symbolCounts.put(symbol, currentCount + 1);
            }
        }
        symbolCounts.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
