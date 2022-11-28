package Final_Exam_Preparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String regexValid = "@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+";
        Pattern pattern = Pattern.compile(regexValid);

        Matcher matcher = null;

        for (int i = 0; i < n; i++) {
            String barcode = scanner.nextLine();
            matcher = pattern.matcher(barcode);

            if (matcher.find()) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < barcode.length(); j++) {
                    char symbol = barcode.charAt(j);
                    if (Character.isDigit(symbol)) {
                        sb.append(symbol);
                    }
                }

                if (sb.length() == 0) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.printf("Product group: %s%n", sb.toString());
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
