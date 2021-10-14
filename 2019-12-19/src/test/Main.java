package test;

public class Main {

    public static void main(String[] args) {

        BilliardBalls billiard = new BilliardBalls();

        billiard.generateAllBalls();

        billiard.shakeAllBalls();

        billiard.printAllBalls();

        billiard.printBalls(billiard.getBallsWithColor("Red"));

        billiard.printBalls(billiard.getBallsWithType("Solid"));

        billiard.printBalls(billiard.getRandomBalls(3));

        System.out.println("Sum of all balls is: " + billiard.getNumberSumOfBalls());

        System.out.println("Sum of all striped balls is: " + billiard.getNumberSumOfBalls("Stripes"));

    }
}
