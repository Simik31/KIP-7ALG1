package cz.osu.student.r19584.kip7alg1.tut10.task_2;

public class Person {
    private String firstName;
    private String lastName;
    private Integer age;

    public Person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "FirstName: " + firstName + "\nLastName: " + lastName + "\nage: " + age;
    }
}
