package MapsLambdaAndStreamAPI_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P07LegendaryFarming {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        //Shards -> количество
        //Fragments -> количество
        //Motes -> количество

        //запис: материал -> количество
        Map<String, Integer> items = new LinkedHashMap<>();
        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);

        //запис: боклук -> количество
        Map<String, Integer> junkItems = new LinkedHashMap<>();

        boolean isWin = false;
        while (!isWin) {
            String input = scanner.nextLine();
            String[] inputData = input.split(" ");
            //["кол1", "мат1", "кол2", "мат2", "кол3", "мат3", ....]
            for (int index = 0; index <= inputData.length - 1; index += 2) {
                int quantity = Integer.parseInt(inputData[index]);
                String material = inputData[index + 1].toLowerCase(); //всички букви да са малки

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    //валиден материал
                    int currentQuantity = items.get(material);
                    items.put(material, currentQuantity + quantity);
                } else {
                    //материал е боклук
                    if (!junkItems.containsKey(material)) {
                        junkItems.put(material, quantity);
                    } else {
                        int current = junkItems.get(material);
                        junkItems.put(material, current + quantity);
                    }
                }

                //проверка дали не сме спечелили след получаване на всеки един материал
                if (items.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    items.put("shards", items.get("shards") - 250);
                    isWin = true;
                    break;
                } else if (items.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    items.put("fragments", items.get("fragments") - 250);
                    isWin = true;
                    break;
                } else if (items.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    items.put("motes", items.get("motes") - 250);
                    isWin = true;
                    break;
                }
            }

            if (isWin) {
                break;
            }
        }

        //всички специални материали
        //запис: материал -> количество
        items.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        //всички боклуци материали
        //запис: материал -> количество
        junkItems.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}


