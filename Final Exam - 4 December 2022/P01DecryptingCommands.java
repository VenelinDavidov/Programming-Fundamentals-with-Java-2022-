package FinalExam_4_December_2022;

import java.util.Scanner;

public class P01DecryptingCommands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String oldInput = scanner.nextLine();
        String lineCommandInput = scanner.nextLine();

        while (!lineCommandInput.equals("Finish")) {
            String[] commandArr = lineCommandInput.split(" ");
            String newInstruction = commandArr[0];

            switch (newInstruction) {

                case "Replace":

                    String oldsChar = commandArr[1];
                    String newsChar = commandArr[2];
                    if (oldInput.equals(oldsChar)) {
                        oldInput = oldInput.replace(oldsChar, newsChar);
                        System.out.println(oldInput);
                    }
                    break;

                case "Cut":

                    int startIndexZip = Integer.parseInt(commandArr[1]);
                    int endIndexZip = Integer.parseInt(commandArr[2]);
                    if (startIndexZip >= 0 && startIndexZip <= oldInput.length() &&
                            endIndexZip >= 0 && endIndexZip <= oldInput.length()) {
                        String substring = oldInput.substring(startIndexZip, endIndexZip + 1);
                        oldInput = oldInput.replace(substring, "");
                        System.out.println(oldInput);
                    } else {
                        System.out.println("Invalid indices!");
                    }

                    break;
                case "Make":

                    String upperLowerLetter = commandArr[1];
                    if (upperLowerLetter.equals("Upper")) {
                        oldInput = oldInput.toUpperCase();
                        System.out.println(oldInput);
                    } else if (upperLowerLetter.equals("Lower")) {
                        oldInput = oldInput.toLowerCase();
                        System.out.println(oldInput);
                    }
                    break;

                case "Check":

                    if (oldInput.equals(commandArr[1])) {
                        System.out.println("Message contains " + commandArr[1]);
                    } else {
                        System.out.println("Message doesn't contain " + commandArr[1]);
                    }
                    break;

                case "Sum":

                    int startNum = Integer.parseInt(commandArr[1]);
                    int endNum = Integer.parseInt(commandArr[2]);
                    if (startNum >= 0 && endNum >= 0 && startNum <= oldInput.length()
                            && endNum <= oldInput.length()) {
                        String text = oldInput.substring(startNum, endNum + 1);
                        int sum = 0;
                        for (int i = 0; i < text.length(); i++) {
                            int currentValue = text.charAt(i);
                            sum += currentValue;
                        }
                        System.out.println(sum);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
            }

            lineCommandInput = scanner.nextLine();
        }
    }
}


