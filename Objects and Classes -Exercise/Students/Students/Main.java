package ObjectsAndClasses_Exercise.Students.Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());

        List<ObjectsAndClasses_Exercise.Students.Students.Student> studentList = new ArrayList<>();
        for (int studentCount = 1; studentCount <= countStudents; studentCount++) {
            String data = scanner.nextLine();

            String[] dataParts = data.split(" ");
            String firstName = dataParts[0];
            String lastName = dataParts[1];
            Double grade =Double.parseDouble(dataParts[2]);

            ObjectsAndClasses_Exercise.Students.Students.Student student = new ObjectsAndClasses_Exercise.Students.Students.Student(firstName,lastName,grade);
            studentList.add(student);
        }

        studentList.sort(Comparator.comparing(ObjectsAndClasses_Exercise.Students.Students.Student::getGrade).reversed());

        for (ObjectsAndClasses_Exercise.Students.Students.Student student :studentList) {
            System.out.println(student);
        }
    }
}
