package Lists_Lab;

import java.awt.*;
import java.security.PublicKey;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numberList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < numberList.size() - 1; i++) {
            double currentNum = numberList.get(i);
            double nextNum = numberList.get(i + 1);
            if (currentNum == nextNum) {
                numberList.set(i, currentNum + nextNum);
                numberList.remove(i + 1);
                i = -1;
            }
        }
        System.out.println(joinElements(numberList, " "));
    }

    public static String joinElements(List<Double> list, String delimiter) {
        DecimalFormat df = new DecimalFormat("0.#");
        String resul = " ";
        for (double item : list) {
            String numDf = df.format(item) + delimiter;
            resul += numDf;
        }
        return resul;
    }
}
