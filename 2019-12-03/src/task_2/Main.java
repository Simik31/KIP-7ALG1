package task_2;

public class Main {

    public static void main(String[] args) {

        Person[] persons = new Person[50];

        for(int i = 0; i < persons.length; i++) {

            persons[i] = PersonGenerator.generate();

        }

        int max_index = 0;
        int max_age = 0;

        for(int i = 0; i < persons.length; i++) {

            if(persons[i].getAge() > max_age) {

                max_age = persons[i].getAge();
                max_index = i;

            }
        }

        System.out.println(persons[max_index]);

    }
}
