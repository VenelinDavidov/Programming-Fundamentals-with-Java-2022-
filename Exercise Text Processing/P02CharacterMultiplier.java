package TextProcessing_Exercise;

import java.util.Scanner;

public class P02CharacterMultiplier {

    private static long calculateSum(String first, String second)
    {

        char[] firstArr = first.toCharArray();
        char[] secondArr = second.toCharArray();
        long sum = 0;
        int minLength = Math.min(firstArr.length, secondArr.length);
        int maxLength = Math.max(firstArr.length, secondArr.length);

        for (int i = 0; i < minLength; i++)
        {

            sum += firstArr[i] * secondArr[i];
        }


        if (maxLength == firstArr.length)
        {
            for (int i = minLength; i < maxLength; i++)
            {
                sum += firstArr[i];
            }
        }
        else
        {
            for (int i = minLength; i < maxLength; i++)
            {
                sum += secondArr[i];
            }
        }

        return sum;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");

        String first = input[0];
        String second = input[1];

        long sum = calculateSum(first, second);

        System.out.println(sum);
    }
}
