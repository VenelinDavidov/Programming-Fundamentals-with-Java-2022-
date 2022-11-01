package ObjectsAndClasses_Exercise.opinionPoll;

public class Person {
    //полета -> характеристики -> име, възраст
    private String name;
    private int age;

    //конструктор -> създаваме обекти от класа
    public Person(String name, int age) {
        //нов обект
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        //нов обект
        this.name = name;
        this.age = 10;
    }

    public Person (int age) {
        //нов обект
        this.age = age;
    }

    //getter -> метод, чрез който достъпваме стойност на поле
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
