package cz.osu.student.r19584.kip7alg1.tut8;

public class Shop {
    private String name;
    private double profit;

    public Shop(String name, double profit) {
        this.name = name;
        this.profit = profit;
    }

    public double getProfit() {
        return profit;
    }

    public String toString() {
        return "Shop{" + "name='" + name + '\'' + ", profit=" + profit + " mil." + '}';
    }
}
