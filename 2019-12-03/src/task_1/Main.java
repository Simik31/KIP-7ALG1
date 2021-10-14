package task_1;

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
