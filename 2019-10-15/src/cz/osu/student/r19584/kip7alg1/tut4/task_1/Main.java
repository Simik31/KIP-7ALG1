package cz.osu.student.r19584.kip7alg1.tut4.task_1;

public class Main {

    public static void main(String[] args) {

        Employee tomes = new Employee();
        tomes.name = "Vojtěch Tomeš";
        tomes.role = Role.DEVELOPER;
        tomes.male = true;
        tomes.workedYears = 5;
        tomes.address = new Address();
        tomes.address.street = "Televizní 13";
        tomes.address.city = "Ostrava";
        tomes.address.zipCode = "725 28";

        Employee penta = new Employee();
        penta.name = "Penta";
        penta.role = Role.ANALYST;
        penta.male = true;
        penta.workedYears = 4;
        penta.address = new Address();
        penta.address.street = "Zimlerowa 3";
        penta.address.city = "Ostrava";
        penta.address.zipCode = "701 00";

        Employee fucekova = new Employee();
        fucekova.name = "Blanka Fuceková";
        fucekova.role = Role.TESTER;
        fucekova.male = false;
        fucekova.workedYears = 9;
        fucekova.address = new Address();
        fucekova.address.street = "Ostravská 11";
        fucekova.address.city = "Ostrava";
        fucekova.address.zipCode = "721 00";

        System.out.println("\n-----SEX----");

        System.out.println(tomes.name + " is " + ((tomes.male) ? "male." : "female."));
        System.out.println(penta.name + " is " + ((penta.male) ? "male." : "female."));
        System.out.println(fucekova.name + " is " + ((fucekova.male) ? "male." : "female."));

        System.out.println("\n-----JUNIOR/SENIOR-----");

        System.out.println(tomes.name + ((tomes.workedYears <= 5) ? " is junior" : " is senior"));
        System.out.println(penta.name + ((penta.workedYears <= 5) ? " is junior" : " is senior"));
        System.out.println(fucekova.name + ((fucekova.workedYears <= 5) ? " is junior" : " is senior"));

        System.out.println("\n-----PROGRAMMER-----");

        System.out.println(
                tomes.name + ((tomes.role == Role.DEVELOPER || tomes.role == Role.ANALYST) ? " is coding in work"
                        : " is not coding in work"));
        System.out.println(
                penta.name + ((penta.role == Role.DEVELOPER || penta.role == Role.ANALYST) ? " is coding in work"
                        : " is not coding in work"));
        System.out.println(fucekova.name
                + ((fucekova.role == Role.DEVELOPER || fucekova.role == Role.ANALYST) ? " is coding in work"
                        : " is not coding in work"));

        System.out.println("\n-----LEAD TESTER------");

        System.out.println(tomes.name
                + ((tomes.role == Role.TESTER && tomes.workedYears > 5 && tomes.male) ? " is male lead tester"
                        : ((tomes.role == Role.TESTER && tomes.workedYears > 5 && !tomes.male)
                                ? " is female lead tester"
                                : " is not lead tester")));
        System.out.println(penta.name
                + ((penta.role == Role.TESTER && penta.workedYears > 5 && penta.male) ? " is male lead tester"
                        : ((penta.role == Role.TESTER && penta.workedYears > 5 && !penta.male)
                                ? " is female lead tester"
                                : " is not lead tester")));

        System.out.println(fucekova.name
                + ((fucekova.role == Role.TESTER && fucekova.workedYears > 5 && fucekova.male) ? " is male lead tester"
                        : ((fucekova.role == Role.TESTER && fucekova.workedYears > 5 && !fucekova.male)
                                ? " is female lead tester"
                                : " is not lead tester")));
    }
}
