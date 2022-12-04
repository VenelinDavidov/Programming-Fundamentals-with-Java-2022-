package FinalExam_4_December_2022;

import java.util.*;

public class P03HeroRecruitment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, List<String>> spellBookByHeroes = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String heroName = input.split("\\s+")[1];
            if (input.contains("Enroll")) {

                if (!spellBookByHeroes.containsKey(heroName)) {
                    spellBookByHeroes.put(heroName, new ArrayList<>());

                } else {
                    System.out.printf("%s is already enrolled.%n", heroName);
                }
            } else if (input.contains("Learn")) {
                String spellName = input.split("\\s+")[2];
                if (!spellBookByHeroes.containsKey(heroName)) {
                    System.out.printf("%s doesn't exist.%n", heroName);
                } else {
                    if (spellBookByHeroes.get(heroName).isEmpty()) {
                        spellBookByHeroes.get(heroName).add(spellName);
                    } else {
                        boolean isUnique = true;
                        for (String s : spellBookByHeroes.get(heroName)) {
                            if (s.equals(spellName)) {
                                System.out.printf("%s has already learnt %s%n", heroName, spellName);
                                isUnique = false;
                                break;
                            }
                        }
                        if (isUnique) {
                            spellBookByHeroes.get(heroName).add(spellName);
                        }
                    }


                }
            } else if (input.contains("Unlearn")) {

                String spellName = input.split("\\s+")[2];
                if (!spellBookByHeroes.containsKey(heroName)) {
                    System.out.printf("%s doesn't exist.%n", heroName);
                } else {
                    boolean isExist = false;
                    for (String s : spellBookByHeroes.get(heroName)) {
                        if (s.equals(spellName)) {
                            spellBookByHeroes.get(heroName).remove(spellName);
                            isExist = true;
                            break;
                        }

                    }
                    if (!isExist) {
                        System.out.printf("%s doesn't know %s%n", heroName, spellName);
                    }
                }
            }
            input = scanner.nextLine();
        }
        if (!spellBookByHeroes.isEmpty()) {
            System.out.println("Heroes:");
            for (Map.Entry<String, List<String>> entry : spellBookByHeroes.entrySet()) {
                System.out.print("== " + entry.getKey() + ": ");
                for (String s : entry.getValue()) {
                    System.out.print(String.join(", ", s));
                }
                System.out.println();
            }
        }
    }
}