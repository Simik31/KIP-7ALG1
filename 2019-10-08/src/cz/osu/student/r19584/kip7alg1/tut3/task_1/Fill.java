package cz.osu.student.r19584.kip7alg1.tut3.task_1;

import java.util.Scanner;

public class Fill {

    public static void person(Person person) {
        // Name
        System.out.print("Your name: ");
        Scanner name = new Scanner(System.in);
        person.name = name.nextLine();

        // Age
        System.out.print("Your age: ");
        Scanner age = new Scanner(System.in);
        person.age = age.nextInt();

        // Sex
        System.out.print("Your sex: ");
        Scanner SC_sex = new Scanner(System.in);
        String sex = SC_sex.next();
        if (sex.equals("MALE") || sex.equals("M") || sex.equals("Male")) {
            person.sex = Sex.MALE;
        } else if (sex.equals("FEMALE") || sex.equals("F") || sex.equals("Female")) {
            person.sex = Sex.FEMALE;
        } else {
            person.sex = Sex.UNKNOWN;
        }

        // Address
        System.out.print("Your street name: ");
        Scanner street = new Scanner(System.in);
        person.address.street = street.nextLine();

        System.out.print("Your house number: ");
        Scanner house = new Scanner(System.in);
        person.address.houseNumber = house.nextInt();

        System.out.print("Your city: ");
        Scanner city = new Scanner(System.in);
        person.address.city = city.nextLine();

        System.out.print("Your postal code: ");
        Scanner postalCode = new Scanner(System.in);
        person.address.postalCode = postalCode.nextLine();

    }

}
