package MapsLambdaAndStreamAPI_Lab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, ArrayList<String>> wordMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {

            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!wordMap.containsKey(word)) {
                wordMap.put(word, new ArrayList<>());
            }
            wordMap.get(word).add(synonym);
        }
        for (Map.Entry<String, ArrayList<String>> entry : wordMap.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }

    }
}
