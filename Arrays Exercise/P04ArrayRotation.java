package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. входни данни: масив от числа и брой ротациите
        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))//"51 47 32 61 21".split(" ") -> ["51", "47", "32", "61", "21"]
                .mapToInt(Integer::parseInt)                      //[51, 47, 32, 61, 21]
                .toArray();
        int rotations = Integer.parseInt(scanner.nextLine()); //брой ротациите

        for (int rotation = 1; rotation <= rotations; rotation++) {
            //1. ВЗИМАМЕ ПЪРВИЯ ЕЛЕМЕНТ
            int firstElement = numbers[0]; //първия елемент от масива
            //2. преместваме всички елементи с 1 -> ляво
            //всички индекси от първия до пред последния (не вкл.)
            for (int index = 0; index < numbers.length - 1; index++) {
                numbers[index] = numbers[index + 1];
            }
            //3. слагаме на последна позиция да е първия взет елемент
            numbers[numbers.length - 1] = firstElement;
        }

        //отпечатваме масива
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
