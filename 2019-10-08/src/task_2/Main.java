package task_2;

public class Main {

    public static void main(String[] args) {

        SolarSystem solarSystem = new SolarSystem();

        solarSystem.name = "Sluneční soustava";

        solarSystem.earth.name = "Země";
        solarSystem.earth.type = Type.PLANETA;
        solarSystem.earth.survivable = "Dá";
        solarSystem.earth.satelites.num = 1;
        solarSystem.earth.satelites.names = "Měsíc";

        solarSystem.pluto.name = "Pluto";
        solarSystem.pluto.type = Type.TRPASLICI_PLANETA;
        solarSystem.pluto.survivable = "Nedá";
        solarSystem.pluto.satelites.num = 5;
        solarSystem.pluto.satelites.names = "Charon, Nix, Hydra, Kerberos, Styx";

        solarSystem.asteroids.name = "Hlavní pás";
        solarSystem.asteroids.type = Type.PAS_ASTEROIDU;
        solarSystem.asteroids.survivable = "Nedá";


        // systém
        System.out.println("Název systému: " +solarSystem.name);
        System.out.println();

        // země
        System.out.print(
            solarSystem.earth.name + "\n" +
            "\tTyp: " +solarSystem.earth.type + "\n" +
            "\t"+solarSystem.earth.survivable + " se zde přežít.\n" +
            "\tPočet satelitů: " +solarSystem.earth.satelites.num + "\n");
        if(solarSystem.earth.satelites.num > 0)
            System.out.println("\t\tNázvy satelitů: " + solarSystem.earth.satelites.names);
        System.out.println();

        // pluto
        System.out.print(
            solarSystem.pluto.name + "\n" +
            "\tTyp: " +solarSystem.pluto.type + "\n" +
            "\t"+solarSystem.pluto.survivable + " se zde přežít.\n" +
            "\tPočet satelitů: " +solarSystem.pluto.satelites.num + "\n");
        if(solarSystem.pluto.satelites.num > 0)
            System.out.println("\t\tNázvy satelitů: " + solarSystem.pluto.satelites.names);
        System.out.println();

        //Pás asteroidů
        System.out.print(
            solarSystem.asteroids.name + "\n" +
            "\tTyp: " +solarSystem.asteroids.type + "\n" +
            "\t"+solarSystem.asteroids.survivable + " se zde přežít.\n" +
            "\tPočet satelitů: " + solarSystem.asteroids.satelites.num + "\n");
            if(solarSystem.asteroids.satelites.num > 0)
                System.out.println("\t\tNázvy satelitů: " + solarSystem.asteroids.satelites.names);

    }
}
