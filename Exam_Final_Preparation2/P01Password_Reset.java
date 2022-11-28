package Final_Exam_Preparation_2;

import java.util.Scanner;

public class P01Password_Reset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine(); //парола за модификация
        String command = scanner.nextLine(); //команда или "Done"

        while (!command.equals("Done")) {
            //команда
            if (command.equals("TakeOdd")) {
                //1. command = "TakeOdd"
                //1. взимаме символите на нечетни индекси (1, 3, 5, 7, 9, ...)
                password = getCharsOnOddPositions(password); //новообразувана парола
                //2. отпечатвам новата парола
                System.out.println(password);
            } else if (command.contains("Cut")) {
                //2. command = "Cut 2 5".split("\\s+") -> ["Cut", "2", "5"]
                int index = Integer.parseInt(command.split("\\s+")[1]); // 2
                int length = Integer.parseInt(command.split("\\s+")[2]); // 5
                //password = "TestZombie12345"
                //1. взимам от паролата текстът, който започва от index и е с дължина length
                String substringToRemove = password.substring(index, index + length); //текстът, който трябва да премахна -> "stZom"
                //2. премахна първото срещане на този текст от паролата
                password = password.replaceFirst(substringToRemove, "");
                System.out.println(password);
            } else if (command.contains("Substitute")) {
                //3. command = "Substitute est var".split("\\s+") -> ["Substitute", "est", "var"]
                //password = "TestZombie12345"
                String substring = command.split("\\s+")[1]; //текстът, който трябва да заменя -> "est"
                String substitute = command.split("\\s+")[2]; //текстът заместител -> "var"

                if (password.contains(substring)) {
                    //заменя всички substring със substitute
                    password = password.replaceAll(substring, substitute); //"TvarZombie12345"
                    System.out.println(password);
                } else {
                    //в паролата да нямам текст за замяна
                    System.out.println("Nothing to replace!");
                }

            }
            command = scanner.nextLine();
        }

        System.out.println("Your password is: " + password);
    }

    private static String getCharsOnOddPositions(String password) {
        //password = "Desi1234"
        //всички символи на нечетни индекси (1, 3, 5, 7, 9...) -> 'е', 'i', '2', '4' -> "ei24"
        StringBuilder newPassword = new StringBuilder(); //конструирам новата парола

        //вариант 1
        for (int position = 0; position <= password.length() - 1; position++) {
            //индекси / позиции от 0 до последната
            if (position % 2 != 0) {
                //позицията е нечетна
                char currentSymbol = password.charAt(position);
                newPassword.append(currentSymbol);
            }
        }
        //вариант 2:
        /*for (int position = 1; position <= password.length() - 1; position += 2) {
                //позицията е нечетна
                char currentSymbol = password.charAt(position);
                newPassword.append(currentSymbol);
        }*/
        return newPassword.toString();
    }
}