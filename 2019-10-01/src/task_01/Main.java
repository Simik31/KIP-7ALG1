package task_01;

public class Main {

    public static void main(String[] args) {

        Animal krecek = new Animal();
        Animal suri   = new Animal();
        Animal ara    = new Animal();

        Toy car = new Toy();
        Toy bear = new Toy();

        krecek.spices = "Křeček";
        krecek.count = 6;
        krecek.food = "granule";
        krecek.age = 2;
        krecek.lisp = 7;

        suri.spices = "Suri";
        suri.count = 10;
        suri.food = "Škorpion";
        suri.age = 5;
        suri.lisp = 15;

        ara.spices = "Ara";
        ara.count = 2;
        ara.food = "Housenky";
        ara.age = 4;
        ara.lisp = 9;

        car.name = "Autíčko";
        car.height = 10;
        car.color = "bílé";
        car.price = 100;

        bear.name = "Plyšový méďa";
        bear.height = 40;
        bear.color = "hnědé";
        bear.price = 150;

        System.out.println("Prodáváme '" + car.name + "' " + car.color + " barvy, které/á má " + car.height + "cm a stojí " + car.price + "kč.");
        System.out.println("Prodáváme '" + bear.name + "' " + bear.color + " barvy, které/á má " + bear.height + "cm a stojí " + bear.price + "kč.");

    System.out.println("\n\n");

        System.out.println(
                "Máme " +
                krecek.count +
                " zvířátek druhu '" +
                krecek.spices +
                "' ve věku " +
                krecek.age +
                " let které žere " +
                krecek.food +
                " a dožívají se " +
                krecek.lisp +
                " let (už má za sebou " +
                ((krecek.age * 100) / krecek.lisp) +
                "% života)"
        );

        System.out.println(
                "Máme " +
                suri.count +
                "zvířátek druhu '" +
                suri.spices +
                "' ve věku " +
                suri.age +
                " let které žere " +
                suri.food +
                " a dožívají se " +
                suri.lisp +
                " let (už má za sebou " +
                ((suri.age * 100) / suri.lisp) +
                "% života)"
        );

        System.out.println(
                "Máme " +
                ara.count +
                " zvířátek druhu '" +
                ara.spices +
                "' ve věku " +
                ara.age +
                " let které žere " +
                ara.food +
                " a dožívají se " +
                ara.lisp +
                " let (už má za sebou " +
                ((ara.age * 100) / ara.lisp) +
                "% života)"
        );
    }
}
