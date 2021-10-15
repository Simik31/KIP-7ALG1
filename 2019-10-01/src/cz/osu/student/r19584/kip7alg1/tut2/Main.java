package cz.osu.student.r19584.kip7alg1.cv2;

public class Main {

        public static void main(String[] args) {

                Animal hamster = new Animal();
                Animal meerkat = new Animal();
                Animal ara = new Animal();

                Toy car = new Toy();
                Toy bear = new Toy();

                hamster.spices = "Hamster";
                hamster.count = 6;
                hamster.food = "granule";
                hamster.age = 2;
                hamster.lisp = 7;

                meerkat.spices = "Meerkat";
                meerkat.count = 10;
                meerkat.food = "Scorpion";
                meerkat.age = 5;
                meerkat.lisp = 15;

                ara.spices = "Ara";
                ara.count = 2;
                ara.food = "Caterpillars";
                ara.age = 4;
                ara.lisp = 9;

                car.name = "Car";
                car.height = 10;
                car.color = "White";
                car.price = 100;

                bear.name = "Teddy bear";
                bear.height = 40;
                bear.color = "Brown";
                bear.price = 150;

                System.out.println("We sell '" + car.name + "' " + car.color + " color, which is " + car.height
                                + " cm and costs " + car.price + " CZK.");
                System.out.println("We sell '" + bear.name + "' " + bear.color + " color, which is " + bear.height
                                + " cm and costs " + bear.price + " CZK.");
                System.out.println("\n\n");

                System.out.println("We have " + hamster.count + " '" + hamster.spices + "' aged " + hamster.age
                                + " whom eats " + hamster.food + " and they lifespan is " + hamster.lisp
                                + " years (They already lived " + ((hamster.age * 100) / hamster.lisp)
                                + "% of their lives)");

                System.out.println("We have " + meerkat.count + " '" + meerkat.spices + "' aged " + meerkat.age
                                + " whom eats " + meerkat.food + " and they lifespan is " + meerkat.lisp
                                + " years (They already lived " + ((meerkat.age * 100) / meerkat.lisp)
                                + "% of their lives)");

                System.out.println("We have " + ara.count + " '" + ara.spices + "' aged " + ara.age + " whom eats "
                                + ara.food + " and they lifespan is " + ara.lisp + " years (They already lived "
                                + ((ara.age * 100) / ara.lisp) + "% of their lives)");
        }
}
