package ObjectsAndClasses_Exercise.opinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine()); //бр. на редовете с лична информация
        for (int row = 1; row <= n ; row++) {
            String data = scanner.nextLine(); //"Desi 24"
            //"Desi 24".split(" ") -> ["Desi", "24"]
            String name = data.split(" ")[0];
            int age = Integer.parseInt(data.split(" ")[1]);

            if (age > 30) {
                //създавам запис за човека -> съхранявам запис
                Person person = new Person(name, age);
                personList.add(person);
            }
        }

        for (Person person : personList) {
            //name - възраст
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}


