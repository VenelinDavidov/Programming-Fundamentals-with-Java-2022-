package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerCard = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondPlayerCard = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (firstPlayerCard.size() != 0 && secondPlayerCard.size() != 0) {
            int firsPlayerCards = firstPlayerCard.get(0);
            int secondPlayerCards = secondPlayerCard.get(0);

            firstPlayerCard.remove(0);
            secondPlayerCard.remove(0);

            if (firsPlayerCards > secondPlayerCards) {
                firstPlayerCard.add(firsPlayerCards);
                firstPlayerCard.add(secondPlayerCards);
            } else if (secondPlayerCards > firsPlayerCards) {
                secondPlayerCard.add(secondPlayerCards);
                secondPlayerCard.add(firsPlayerCards);

            }
        }

        if (firstPlayerCard.size() == 0) {
            System.out.printf(" Second player wins! Sum: %d", getCardSum(secondPlayerCard));
        } else if (secondPlayerCard.size() == 0) {
            System.out.printf(" First player wins! Sum: %d", getCardSum(firstPlayerCard));
        }

    }

    private static int getCardSum(List<Integer> ListCards) {
        int sum = 0;
        for (int card : ListCards) {
            sum += card;
        }
        return sum;
    }
}
