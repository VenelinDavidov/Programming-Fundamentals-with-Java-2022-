package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine() //"1 2 3 3"
                        .split(" "))  //["1", "2", "3", "3"]
                .mapToInt(el -> Integer.parseInt(el))  //[1, 2, 3, 3]
                .toArray();

        boolean isFound = false;
        //true -> имаме такъв елемент
        //false -> нямаме такъв елемент
        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentElement = numbers[index];
            int leftSum = 0; //сумата на елементите в ляво
            int rightSum = 0; //сумата на елементите в дясно

            //лява сума -> всички елемнти от индекс 0 до моя (не е вкл)
            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum += numbers[leftIndex];
            }

            //дясна сума -> всички елементи моя индекс + 1 до последния
            for (int rightIndex = index + 1; rightIndex <= numbers.length - 1; rightIndex++) {
                rightSum += numbers[rightIndex];
            }
            //проверка дали сумите са равни
            if (leftSum == rightSum) {
                System.out.println(index);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("no");
        }

    }
}
