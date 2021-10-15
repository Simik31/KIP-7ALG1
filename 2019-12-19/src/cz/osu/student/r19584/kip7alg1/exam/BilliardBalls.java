package cz.osu.student.r19584.kip7alg1.exam;

import java.util.Random;

public class BilliardBalls {
    private static String[] colors = { "White", "Yellow", "Blue", "Red", "Purple", "Orange", "Green", "Brown", "Black",
            "Yellow", "Blue", "Red", "Purple", "Orange", "Green", "Brown" };
    private static String[] types = { "Solid", "Stripes" };

    private Ball[] allBalls = new Ball[16];

    public void generateAllBalls() {
        for (int i = 0; i < allBalls.length; i++)
            allBalls[i] = new Ball(colors[(i < 9) ? i : (i - 8)], i, types[(i < 9) ? 0 : 1]);
    }

    public void shakeAllBalls() {
        Random rnd = new Random();
        for (int i = 0; i < allBalls.length; i++) {
            int ran = rnd.nextInt(allBalls.length);
            Ball tmp = allBalls[i];
            allBalls[i] = allBalls[ran];
            allBalls[ran] = tmp;
        }
    }

    public void printAllBalls() {
        for (int i = 0; i < allBalls.length; i++) {
            System.out.println(allBalls[i].getInfo());
        }
    }

    public Ball[] getBallsWithColor(String requiredColor) {
        Ball[] tmp = new Ball[2];
        int index = 0;
        for (int i = 0; i < allBalls.length; i++) {
            if (requiredColor.equals(allBalls[i].getColor()))
                tmp[index++] = allBalls[i];
        }
        return tmp;
    }

    public Ball[] getBallsWithType(String requiredType) {
        Ball[] tmp = new Ball[9];
        int index = 0;
        for (int i = 0; i < allBalls.length; i++) {
            if (requiredType.equals(allBalls[i].getType()))
                tmp[index++] = allBalls[i];
        }
        return tmp;
    }

    public Ball[] getRandomBalls(int count) {
        Random rnd = new Random();
        Ball[] tmp = new Ball[count];
        for (int i = 0; i < count; i++) {
            tmp[i] = allBalls[rnd.nextInt(allBalls.length)];
        }
        return tmp;
    }

    public int getNumberSumOfBalls() {
        int total = 0;
        for (int i = 0; i < allBalls.length; i++) {
            total += allBalls[i].getNumber();
        }
        return total;
    }

    public int getNumberSumOfBalls(String requiredType) {
        int total = 0;
        for (int i = 0; i < allBalls.length; i++) {
            if (requiredType.equals(allBalls[i].getType()))
                total += allBalls[i].getNumber();
        }
        return total;
    }

    public void printBalls(Ball[] ballsToPrint) {
        for (int i = 0; i < ballsToPrint.length; i++) {
            System.out.println(ballsToPrint[i].getInfo());
        }
    }
}
