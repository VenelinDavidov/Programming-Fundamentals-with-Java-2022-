package ExamMid;

import java.util.Scanner;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03PhoneShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> phoneList =
                Arrays.stream(scanner.nextLine()
                        .split(", "))
                        .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] commandOfArr = input.split(" - ");
            String commands = commandOfArr[0];

            String phone = commandOfArr[1];

            if (commands.equals("Add")) {
                if (!phoneList.contains(phone)) {
                    phoneList.add(phone);
                }
            } else if (commands.equals("Remove")) {
                if (phoneList.contains(phone)) {
                    phoneList.remove(phone);
                }
            } else if (commands.equals("Bonus phone")) {
                String[] phones = commandOfArr[1].split(":");
                String oldPhone = phones[0];
                String newPhone = phones[1];

                if (phoneList.contains(oldPhone)) {
                    phoneList.add(phoneList.indexOf(oldPhone) + 1, newPhone);
                }

            } else if (commands.equals("Last")) {

                if (phoneList.contains(phone)) {
                    phoneList.remove(phone);
                    phoneList.add(phone);
                }
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < phoneList.size(); i++) {
            if (i == phoneList.size() - 1) {
                System.out.print(phoneList.get(i));
            } else {
                System.out.print(phoneList.get(i) + ", ");
            }
        }
    }
}