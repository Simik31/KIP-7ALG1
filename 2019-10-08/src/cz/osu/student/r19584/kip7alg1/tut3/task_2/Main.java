package cz.osu.student.r19584.kip7alg1.tut3.task_2;

public class Main {

    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem();

        solarSystem.name = "Solar system";

        solarSystem.earth.name = "Earth";
        solarSystem.earth.type = Type.PLANET;
        solarSystem.earth.survivable = "Yes";
        solarSystem.earth.satellites.num = 1;
        solarSystem.earth.satellites.names = "Moon";

        solarSystem.pluto.name = "Pluto";
        solarSystem.pluto.type = Type.DWARF_PLANET;
        solarSystem.pluto.survivable = "No";
        solarSystem.pluto.satellites.num = 5;
        solarSystem.pluto.satellites.names = "Charon, Nix, Hydra, Kerberos, Styx";

        solarSystem.asteroids.name = "Main asteroid belt";
        solarSystem.asteroids.type = Type.ASTEROID_BELT;
        solarSystem.asteroids.survivable = "No";

        System.out.println("System name: " + solarSystem.name);
        System.out.println();

        System.out.print(solarSystem.earth.name + "\n" + "\tType: " + solarSystem.earth.type + "\n\tSurvivable: "
                + solarSystem.earth.survivable + "\n\tNumber of satellites: " + solarSystem.earth.satellites.num
                + "\n");
        if (solarSystem.earth.satellites.num > 0)
            System.out.println("\t\tSatellites: " + solarSystem.earth.satellites.names);
        System.out.println();

        System.out.print(solarSystem.pluto.name + "\n" + "\tType: " + solarSystem.pluto.type + "\n\tSurvivable: "
                + solarSystem.pluto.survivable + "\n\tNumber of satellites: " + solarSystem.pluto.satellites.num
                + "\n");
        if (solarSystem.pluto.satellites.num > 0)
            System.out.println("\t\tSatellites: " + solarSystem.pluto.satellites.names);
        System.out.println();

        System.out.print(solarSystem.asteroids.name + "\n" + "\tType: " + solarSystem.asteroids.type
                + "\n\tSurvivable: " + solarSystem.asteroids.survivable + "\n\tNumber of satellites: "
                + solarSystem.asteroids.satellites.num + "\n");
        if (solarSystem.asteroids.satellites.num > 0)
            System.out.println("\t\tSatellites: " + solarSystem.asteroids.satellites.names);
        System.out.println();
    }
}
