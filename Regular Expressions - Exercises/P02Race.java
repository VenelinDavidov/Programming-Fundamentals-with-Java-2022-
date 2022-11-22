package RegularExpressions_Exercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String namesParticipants = scanner.nextLine(); //"George, Peter, Bill, Tom"
        List<String> names = Arrays.stream(namesParticipants.split(", ")).collect(Collectors.toList());
        //"George, Peter, Bill, Tom".split(", ")
        //масив: ["George", "Peter", "Bill", "Tom"].toList()
        //лист: {"George", "Peter", "Bill", "Tom"}

        //състезател -> дистанция
        Map<String, Integer> racerDistances = new LinkedHashMap<>();
        names.forEach(name -> racerDistances.put(name, 0));

        //REGEX
        String regexLetters = "[A-Za-z]+";
        Pattern patternLetters = Pattern.compile(regexLetters); //шаблон за бувките

        String regexDigits = "[0-9]";
        Pattern patterDigits = Pattern.compile(regexDigits); //шаблон за цифрите

        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
            //input = "G4e@55or%6g6!68e!!@"
            //1. име на състезателя -> всички букви
            StringBuilder racerName = new StringBuilder();
            Matcher matcherLetters = patternLetters.matcher(input);
            //matcher = "G", "e", "or", "g", "e"
            while (matcherLetters.find()) {
                racerName.append(matcherLetters.group());
            }

            //2. дистанция -> сума от цифрите
            int distance = 0;
            Matcher matcherDigits = patterDigits.matcher(input);
            //matcher = "4", "5", "5", "6", "6", "6", "8"
            while (matcherDigits.find()) {
                distance += Integer.parseInt(matcherDigits.group());
            }

            if (names.contains(racerName.toString())) {
                //имаме играча в първоначалния списък
                int currentDistance = racerDistances.get(racerName.toString()); //текущата дистанция избягана от играча
                racerDistances.put(racerName.toString(), currentDistance + distance);
            }

            input = scanner.nextLine();
        }


        //сортираме по дистанция в descending order
        //comparingByValue -> ascending order
        List<String> top3Names = racerDistances.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) // сортирали сме по value (дистанция) в намаляващ ред
                .limit(3) //оставяме само първите 3 записа
                .map(entry -> entry.getKey()) //на всеки от трите записа взимаме ключа (име на играча)
                .collect(Collectors.toList()); // {"George", "Peter", "Tom"}

        System.out.println("1st place: " + top3Names.get(0));
        System.out.println("2nd place: " + top3Names.get(1));
        System.out.println("3rd place: " + top3Names.get(2));


        //без сортировка
        //racerDistances: име -> дистанция
       /* int count = 1; //реда на текущия играч
        for (Map.Entry<String, Integer> pair : racerDistances.entrySet()) {
            //pair: име -> дистанция
            if (count == 1) {
                //първия играч
                System.out.println("1st place: " + pair.getKey());
                count++;
            } else if (count == 2) {
                //втория играч
                System.out.println("2nd place: " + pair.getKey());
                count++;
            } else if (count == 3) {
                //третия играч
                System.out.println("3rd place: " + pair.getKey());
                break;
            }
        }*/
    }
}
