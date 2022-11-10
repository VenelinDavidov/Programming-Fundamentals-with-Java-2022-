package MapsLambdaAndStreamAPI_Lab;

import java.util.*;

public class P01CountRealNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();

        TreeMap<Double, Integer> countMap = new TreeMap<>();
        for (double num : numbersArr) {
            if (!countMap.containsKey(num)) {
              countMap.put(num,1);
            } else {
                int value = countMap.get(num);
                countMap.put(num,value +1);
            }
        }
        for (Map.Entry<Double, Integer> entry : countMap.entrySet()) {
            System.out.printf("%.0f -> %d%n",entry.getKey(),entry.getValue());
        }

    }
}
