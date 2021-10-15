package cz.osu.student.r19584.kip7alg1.tut10.task_1;

public class Main {

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        lottery.guess();
        lottery.shuffle();
        lottery.pick();
        lottery.draw();
        lottery.print();
    }
}
