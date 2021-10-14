package task_1;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();

        Fill.person(person);

        System.out.print(
            "Name: " + person.name + "\n" +
            "Age:  " + person.age + "\n" +
            "Sex:  " + person.sex + "\n" +
            "Address:\n" +
            "\t" + person.address.street + " " + person.address.houseNumber + "\n" +
            "\t" + person.address.city + "\n" +
            "\t" + person.address.postalCode
        );

    }
}
