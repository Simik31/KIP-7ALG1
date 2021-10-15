package cz.osu.student.r19584.kip7alg1.tut4.task_2;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rnd = new Random();
        int punishment_type = rnd.nextInt(5) + 1;
        int punishment_years = rnd.nextInt(50) + 1;

        Punishment pun1 = new Punishment();
        pun1.type = "Retribution";
        Punishment pun2 = new Punishment();
        pun2.type = "Deterrence";
        Punishment pun3 = new Punishment();
        pun3.type = "Rehabilitation";
        Punishment pun4 = new Punishment();
        pun4.type = "Societal protection";
        Punishment pun5 = new Punishment();
        pun5.type = "Confinement";

        Prisoner prisoner1 = new Prisoner();

        prisoner1.name = "Pektor";
        prisoner1.number = 210;

        switch (punishment_type) {
            case 1:
                prisoner1.punishment = pun1;
                break;
            case 2:
                prisoner1.punishment = pun2;
                break;
            case 3:
                prisoner1.punishment = pun3;
                break;
            case 4:
                prisoner1.punishment = pun4;
                break;
            case 5:
                prisoner1.punishment = pun5;
                break;
        }

        prisoner1.punishment.years = punishment_years;

        System.out.printf("Prisoner number: " + prisoner1.number + "\nName: " + prisoner1.name + "\nPunishment: "
                + prisoner1.punishment.type + " for " + prisoner1.punishment.years + " years");
    }
}
