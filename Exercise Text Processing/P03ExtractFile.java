package TextProcessing_Exercise;

import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine();
        String[] pathParts = path.split("\\\\");
        String fullFilename = pathParts[pathParts.length - 1];

        String fileName = fullFilename.split("\\.")[0];
        String extension = fullFilename.split("\\.")[1];

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + extension);
    }
}
