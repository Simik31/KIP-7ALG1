package test;

public class ShoppingCentre {

    private String name;
    private String city;
    private Shop sh1;
    private Shop sh2;
    private Shop sh3;
    private Shop sh4;

    public ShoppingCentre(String name, String city, Shop sh1, Shop sh2, Shop sh3, Shop sh4) {
        this.name = name;
        this.city = city;
        this.sh1 = sh1;
        this.sh2 = sh2;
        this.sh3 = sh3;
        this.sh4 = sh4;
    }

    public double totalProfit() {
        return sh1.getProfit() + sh2.getProfit() + sh3.getProfit() + sh4.getProfit();
    }

    public void info() {
        System.out.println(toString() + "\nTotal profit: " + totalProfit() + " mil");
    }

    public String toString() {
        return "ShoppingCentre{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", sh1=" + sh1 +
                ", sh2=" + sh2 +
                ", sh3=" + sh3 +
                ", sh4=" + sh4 +
                '}';
    }
}
