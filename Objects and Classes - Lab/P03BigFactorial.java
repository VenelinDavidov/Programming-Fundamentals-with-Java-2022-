package ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class P03BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BigInteger resultBigInt = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= n; i++) {
            resultBigInt = resultBigInt.multiply(BigInteger.valueOf(i));
        }
        System.out.println(resultBigInt);
    }
}
