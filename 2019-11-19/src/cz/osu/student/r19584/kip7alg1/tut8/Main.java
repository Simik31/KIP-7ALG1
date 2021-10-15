package cz.osu.student.r19584.kip7alg1.tut8;

public class Main {

    public static void main(String[] args) {
        Shop sh1 = new Shop("Kaufland", 15.2);
        Shop sh2 = new Shop("Pepco", 2.3);
        Shop sh3 = new Shop("Kik", 8.5);
        Shop sh4 = new Shop("Orion", 1.4);

        ShoppingCentre centre = new ShoppingCentre("Nová Karolína", "Ostrava", sh1, sh2, sh3, sh4);

        centre.info();
    }
}
