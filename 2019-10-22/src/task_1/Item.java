package task_1;

public class Item {

    public String name;
    private int price;
    public boolean paid;
    public boolean refund;

    public void setPrice(int price) {
        if(price > 0) this.price = price;
        else this.price = -price;
    }

    public int getPrice() {
        return this.price;
    }

    public double getDPH(double DPH) {
        return this.price / 100.0 * DPH;
    }

}
