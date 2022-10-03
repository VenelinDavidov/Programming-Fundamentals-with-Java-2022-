package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P09ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        //повтарящо действие -> въвеждане на команди
        //стоп: входни данни == "end"
        //продължаваме: входни данни != "end"
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            //валидна команда за изпълнение
            //command = "swap 2 3"
            //command = "multiply 4 6"
            //command = "decrease"
            if (command.contains("swap")) {
                //"swap {index1} {index2}" -> "swap 2 3".split(" ") -> ["swap", "2", "3"]
                int index1 = Integer.parseInt(command.split(" ")[1]); //индексът на първия елемент за размяна
                int index2 = Integer.parseInt(command.split(" ")[2]); //индексът на втория елемент за размяна
                //1. взимаме елемента на първия индекс
                int element1 = numbers[index1];
                //2. взимаме елемента на втория индекс
                int element2 = numbers[index2];
                //3. размяна
                numbers[index1] = element2;
                numbers[index2] = element1;
            } else if (command.contains("multiply")) {
                //"multiply {index1} {index2}"
                int index1 = Integer.parseInt(command.split(" ")[1]); //индексът на първия елемент за умножение
                int index2 = Integer.parseInt(command.split(" ")[2]); //индексът на втория елемент за умножение
                //1. взимаме елемента на първия индекс
                int element1 = numbers[index1];
                //2. взимаме елемента на втория индекс
                int element2 = numbers[index2];

                int product = element1 * element2;
                numbers[index1] = product;
            } else if (command.equals("decrease")) {
                //decrease
                //обходим всички елементи -> - 1
                //позиции / индекси -> 0 до последния (дължината на масива - 1)
                for (int index = 0; index <= numbers.length - 1; index++) {
                    //текущия елемент -> numbers[index]
                    //numbers[index]--;
                    //numbers[index] -= 1;
                    numbers[index] = numbers[index] - 1;
                }
            }
            command = scanner.nextLine();
        }

        //отпечатваме: ", "

        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            if (index != numbers.length - 1) {
                //не сме на последното число
                System.out.print(currentNumber + ", ");
            } else { //index == numbers.length - 1
                //последното число
                System.out.print(currentNumber);
            }
        }
    }
}
