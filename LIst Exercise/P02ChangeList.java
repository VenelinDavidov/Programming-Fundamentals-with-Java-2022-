package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //списък  числа- входни данни;
        // получаване на команди;

        List<Integer> numberList = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.contains("Delete")) {
                int numberForeRemove = Integer.parseInt(command.split(" ")[1]);
                numberList.removeAll(Arrays.asList(numberForeRemove));
            } else if (command.contains("Insert")) {
                int element = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                numberList.add(index, element);
            }
            command = scanner.nextLine();
        }
        for (int number : numberList) {
            System.out.print(number + " ");
        }
    }
}
