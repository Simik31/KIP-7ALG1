package test;

public class Ball {

    private String color;
    private int number;
    private String type;

    public Ball(String color, int number, String type) {
        this.color = color;
        this.number = number;
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public String getInfo() {
        return "Ball color: " + color + "\nBall number: " + number + "\nBall type: " + type + "\n\n";
    }
}
