package cz.osu.student.r19584.kip7alg1.tut5.task_1;

public class Item {
    public String name;
    private int price;
    public boolean paid;
    public boolean refund;

    public void setPrice(int price) {
        if (price > 0)
            this.price = price;
        else
            this.price = -price;
    }

    public int getPrice() {
        return this.price;
    }

    public double getVAT(double VAT) {
        return this.price / 100.0 * VAT;
    }

}
