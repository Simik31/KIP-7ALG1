package task_1;

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
        tomes.address.zipCode = "725 26";

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

        System.out.println("\n-----POHLAVÍ----");

        System.out.println(tomes.name    + " je " + ((tomes.male)?"muž.":"žena."   ));
        System.out.println(penta.name    + " je " + ((penta.male)?"muž.":"žena."   ));
        System.out.println(fucekova.name + " je " + ((fucekova.male)?"muž.":"žena."));

        System.out.println("\n-----JUNIOR/SENIOR-----");

        System.out.println(tomes.name    + ((tomes.workedYears <= 5)?" je junior":" je senior"   ));
        System.out.println(penta.name    + ((penta.workedYears <= 5)?" je junior":" je senior"   ));
        System.out.println(fucekova.name + ((fucekova.workedYears <= 5)?" je junior":" je senior"));

        System.out.println("\n-----PROGRAMÁTOR-----");

        System.out.println(tomes.name    + ((tomes.role == Role.DEVELOPER    || tomes.role == Role.ANALYST)?" ve své práci programuje":" ve své práci neprogramuje"   ));
        System.out.println(penta.name    + ((penta.role == Role.DEVELOPER    || penta.role == Role.ANALYST)?" ve své práci programuje":" ve své práci neprogramuje"   ));
        System.out.println(fucekova.name + ((fucekova.role == Role.DEVELOPER || fucekova.role == Role.ANALYST)?" ve své práci programuje":" ve své práci neprogramuje"));

        System.out.println("\n-----VEDOUCÍ TESTŮ------");

        System.out.println(tomes.name    + ((tomes.role == Role.TESTER && tomes.workedYears > 5 && tomes.male)?" je mužským vedoucím testování":         ((tomes.role == Role.TESTER && tomes.workedYears > 5 && !tomes.male)?" je ženským vedoucím testování":" není vedoucím testů"         )));
        System.out.println(penta.name    + ((penta.role == Role.TESTER && penta.workedYears > 5 && penta.male)?" je mužským vedoucím testování":         ((penta.role == Role.TESTER && penta.workedYears > 5 && !penta.male)?" je ženským vedoucím testování":" není vedoucím testů"         )));
        System.out.println(fucekova.name + ((fucekova.role == Role.TESTER && fucekova.workedYears > 5 && fucekova.male)?" je mužským vedoucím testování":((fucekova.role == Role.TESTER && fucekova.workedYears > 5 && !fucekova.male)?" je ženským vedoucím testování":" není vedoucím testů")));

    }
}
