package ExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class P2ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("end")) {
            String[] commandArr = inputLine.split(" ");
            //swap 1 3
            String command = commandArr[0];

            switch (command) {
                case "swap":
                    int swapIndexOne = Integer.parseInt(commandArr[1]);
                    int swapIndexTwo = Integer.parseInt(commandArr[2]);

                    int valueAtIndexOne = numbersArr[swapIndexOne];
                    int valueAtIndexTwo = numbersArr[swapIndexTwo];

                    numbersArr[swapIndexOne] = valueAtIndexTwo;
                    numbersArr[swapIndexTwo] = valueAtIndexOne;
                    break;
                case "multiply":
                    int multiplyIndexOne = Integer.parseInt(commandArr[1]);
                    int multiplyIndexTwo = Integer.parseInt(commandArr[2]);

                    int product = numbersArr[multiplyIndexOne] * numbersArr[multiplyIndexTwo];
                    numbersArr[multiplyIndexOne] = product;

                    break;
                case "decrease":
                    for (int i = 0; i < numbersArr.length; i++) {
                        numbersArr[i] = numbersArr[i] - 1;
                    }
                    break;
            }

            inputLine = scanner.nextLine();
        }

        String[] resultArr = new String[numbersArr.length];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = String.valueOf(numbersArr[i]);
        }

        System.out.println(String.join(", ", resultArr));

//        for (int i = 0; i < numbersArr.length; i++) {
//            if (i == numbersArr.length - 1) {
//                System.out.print(numbersArr[i]);
//            } else {
//                System.out.print(numbersArr[i] + ", ");
//            }
//        }
    }
}