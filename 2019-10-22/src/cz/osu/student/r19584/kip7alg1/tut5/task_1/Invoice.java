package cz.osu.student.r19584.kip7alg1.tut5.task_1;

public class Invoice {
    public int id;
    public String date;
    public Item item1;
    public Item item2;

    public int totalPrice() {
        return item1.getPrice() + item2.getPrice();
    }

    public double totalPrice(double DPH) {
        double total = totalPrice();
        return total + (total / 100.0 * DPH);
    }

    public PaidItems paid() {
        PaidItems ret;
        if (item1.paid && item2.paid)
            ret = PaidItems.ALL;
        if (item1.paid || item2.paid)
            ret = PaidItems.SOME;
        else
            ret = PaidItems.NONE;
        return ret;
    }
}
