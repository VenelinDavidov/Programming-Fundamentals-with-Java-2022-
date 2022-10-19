package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> texts = Arrays.stream(scanner.nextLine() //"Ivo Johny Tony Bony Mony"
                        .split(" ")) //["Ivo", "Johny", "Tony", "Bony", "Mony"]
                .collect(Collectors.toList()); //{"Ivo", "Johny", "Tony", "Bony", "Mony"}

        String command = scanner.nextLine();

        while (!command.equals("3:1")) {
            //1. merge {startIndex} {endIndex}
            //2. divide {index} {partitions}
            if (command.contains("merge")) {
                //command = "merge 1 3".split(" ") -> ["merge", "1", "3"]
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);
                //{"Ivo", "Johny", "Tony", "Bony", "Mony"}
                //проверка за start index
                if (startIndex < 0) {
                    startIndex = 0;
                }
                //проверка за end index
                if (endIndex > texts.size() - 1) {
                    endIndex = texts.size() - 1;
                }

                //валидираме индексите -> [0, дълж - 1]
                boolean isValidIndexes = startIndex <= texts.size() - 1 && endIndex >= 0 && startIndex < endIndex;

                if (isValidIndexes) {
                    //{"Ivo", "Johny", "Tony", "Bony", "Mony"}
                    //merge 1 3
                    String resultMerge = "";
                    for (int index = startIndex; index <= endIndex; index++) {
                        String currentText = texts.get(index);
                        resultMerge += currentText;
                    }
                    //resultMerge = "JohnyTonyBony"
                    //remove
                    for (int index = startIndex; index <= endIndex; index++) {
                        texts.remove(startIndex);
                    }
                    //{"Ivo", "Mony"}
                    texts.add(startIndex, resultMerge);
                    //{"Ivo", "JohnyTonyBony", "Mony"}
                }
            } else if (command.contains("divide")) {
                //command = "divide 0 3".split(" ") -> ["divide", "2", "3"]
                int index = Integer.parseInt(command.split(" ")[1]);
                int parts = Integer.parseInt(command.split(" ")[2]); //брой на частите
                //{abcdef, ghi, jkl}
                String elementForDivide = texts.get(index); //"abcdef"
                texts.remove(index);
                //{ghi, jkl}

                //колко елемента ще има всяка една част
                int partSize = elementForDivide.length() / parts; //2 елемента във всяка част

                int beginIndexOfText = 0;
                for (int part = 1; part < parts; part++) {
                    texts.add(index, elementForDivide.substring(beginIndexOfText, beginIndexOfText + partSize));
                    //{ab, cd, ghi, jkl}
                    index++; // 2
                    beginIndexOfText += partSize; // 4
                }
                //добавяме останалите символи към последната част
                texts.add(index, elementForDivide.substring(beginIndexOfText)); //не зададем краен индекс -> взима до последния
            }
            command = scanner.nextLine();
        }

        //!!! печатаме списък с текстове !!!
        System.out.println(String.join(" ", texts));

       /* for (String text : texts) {
            System.out.print(text + " ");
        }*/
    }
}

