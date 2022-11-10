package MapsLambdaAndStreamAPI_Exercise;

import java.util.*;

public class P06StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //key: име на студент -> value: списък с оценките
        Map<String, List<Double>> studentsGrade = new LinkedHashMap<>();

        int countStudents = Integer.parseInt(scanner.nextLine());
        for (int student = 1; student <= countStudents; student++) {
            String name = scanner.nextLine(); //име на студента
            double grade = Double.parseDouble(scanner.nextLine()); //оценка на студента
            //1. да не е записан
            if (!studentsGrade.containsKey(name)) {
                studentsGrade.put(name, new ArrayList<>());
            }
            //2. да е записан
            studentsGrade.get(name).add(grade);
        }

        //записи: име на студента (key) -> ср. оценка (value)
        Map<String, Double> averageGradeStudents = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentsGrade.entrySet()) {
            //entry: (key)име на студента -> (value)списък с оценки
            String studentName = entry.getKey(); //име на студент
            List<Double> listGrades = entry.getValue(); //списък с оценки за всеки студент
            double averageGrade = getAverageGrade(listGrades); //средна оценка
            //студент -> списък с оценките -> ср. аритметична оценка
            if (averageGrade >= 4.50) {
                averageGradeStudents.put(studentName, averageGrade);
            }
        }

        //отпечатваме: averageGradeStudents
        //entry: name(key) -> av.grade (value)
        averageGradeStudents.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }

    private static double getAverageGrade(List<Double> listGrades) {
        //{4.60, 3.50, 5.90, 4.70, 2.50}
        //ср. аритметично = сбора от оценките / брой на оценките
        double sumGrades = 0; //сбора от оценките
        for (double grade : listGrades) {
            sumGrades += grade;
        }
        return sumGrades / listGrades.size();
    }
}
