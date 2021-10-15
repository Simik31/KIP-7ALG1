package cz.osu.student.r19584.kip7alg1.tut10.task_1;

import java.util.Random;
import java.util.Scanner;

public class Lottery {
    private int[] allNumbers;
    private int[] picked;
    private int[] lucky;

    public Lottery() {
        allNumbers = new int[49];
        picked = new int[6];
        lucky = new int[6];
        for (int i = 0; i < allNumbers.length; i++) {
            allNumbers[i] = i + 1;
        }
    }

    public void guess() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers 1-49");
        for (int i = 0; i < lucky.length; i++) {
            System.out.print("Enter " + (i + 1) + ". number: ");
            int in = sc.nextInt();
            if (in < 1 || in > 49) {
                System.out.println("Enter ONLY numbers 1-49");
                i--;
            } else if (check(in, lucky)) {
                System.out.println("Enter every number ONLY ONCE");
                i--;
            } else
                lucky[i] = in;
        }
    }

    private boolean check(int in, int[] lucky) {
        boolean ret = false;
        for (int i = 0; i < lucky.length; i++) {
            if (in == lucky[i]) {
                ret = true;
                break;
            }
        }
        return ret;
    }

    public void shuffle() {
        Random rnd = new Random();
        for (int i = 0; i < allNumbers.length; i++) {
            int j = rnd.nextInt(allNumbers.length);
            int sec = allNumbers[j];
            int fir = allNumbers[i];
            allNumbers[i] = sec;
            allNumbers[j] = fir;
        }
    }

    public void pick() {
        for (int i = 0; i < picked.length; i++) {
            picked[i] = allNumbers[i];
        }
    }

    public void draw() {
        int match = 0;
        for (int i = 0; i < lucky.length; i++) {
            for (int j = 0; j < picked.length; j++) {
                if (lucky[i] == picked[j])
                    match++;
            }
        }
        System.out.println("There " + ((match > 1) ? "are " : "is ") + match + " number" + ((match == 1) ? "" : "s")
                + " matching!");
        System.out.println("You won $" + winMoney(match));
    }

    private int winMoney(int match) {
        Random rnd = new Random();
        int price = rnd.nextInt(50) + 1;
        price *= match;
        return price;
    }

    public void print() {
        System.out.print("You entered numbers: ");
        printArray(lucky);
        System.out.print("Picked numbers: ");
        printArray(picked);
    }

    private void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (((i + 1) < arr.length) ? ", " : ""));
        }
        System.out.println();
    }
}
