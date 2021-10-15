package cz.osu.student.r19584.kip7alg1.tut10.task_2;

import java.util.Random;

public class PersonGenerator {

    private static String[] firstNames = { "Martin", "David", "Radim", "Petr", "Daniel", "Vojtech" };
    private static String[] lastNames = { "Simara", "Novak", "Randalf", "Pektor", "Fojtik", "Tomes", "Tiele" };

    public static Person generate() {
        Random rnd = new Random();
        int age = rnd.nextInt(120) + 1;

        String firstName = firstNames[rnd.nextInt(firstNames.length)];
        String lastName = lastNames[rnd.nextInt(lastNames.length)];

        Person ret = new Person(firstName, lastName, age);
        return ret;
    }
}
