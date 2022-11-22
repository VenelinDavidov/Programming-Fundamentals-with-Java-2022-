package RegularExpressions_Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P05NetherRealms {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        Map<String, Double> demons = new LinkedHashMap<>();
        Map<String, Double> demonsDamage = new HashMap<>();
        String[] eachDemon = input.split("[,\\s]+");

        if (input.isEmpty()) return;

        for (String demonName : eachDemon) {
            demons.putIfAbsent(demonName, 0d);
            demonsDamage.putIfAbsent(demonName, 0d);

            double health = addDemonHealth(demonName);
            double dmg = addDamage(demonName);

            demons.put(demonName, health);
            demonsDamage.put(demonName, dmg);
        }

        demons
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(value -> {
                    double dmg = demonsDamage.get(value.getKey());
                    System.out.printf("%s - %.0f health, %.2f damage%n",
                            value.getKey(), value.getValue(), dmg);
                });

    }

    private static double addDamage(String demon) {
        double sum = 0d;
        Pattern findDmg = Pattern.compile("(\\+{1}|\\-{1}(?=\\d))?\\d+\\.?\\d*");
        String[] arithmetic = demon.split("[^/*]+");

//                [-+.0-9]+
        Matcher digits = findDmg.matcher(demon);
        while (digits.find()) {
            double digit = Double.parseDouble(digits.group());
            sum += digit;
        }

        for (String arithmeticSignCluster : arithmetic) {
            char[] arithmeticSigns = arithmeticSignCluster.toCharArray();
            for (char sign : arithmeticSigns) {
                if (sign == '*') {
                    sum *= 2;
                } else if (sign == '/') {
                    sum /= 2;
                }
            }
        }

        return sum;
    }

    private static double addDemonHealth(String demon) {
        double sum = 0d;
        Pattern pattern = Pattern.compile("[^0-9+\\-*/.]");
        Matcher matcher = pattern.matcher(demon);


        while (matcher.find()) {
            char match = matcher.group().charAt(0);
            sum += match;
        }

        return sum;
    }
}


