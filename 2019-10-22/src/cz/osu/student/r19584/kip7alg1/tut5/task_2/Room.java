package cz.osu.student.r19584.kip7alg1.tut5.task_2;

public class Room {
    public String name;
    private int width;
    private int length;

    // set in cm
    public void setLength(int length_cm) {
        if (length_cm > 0)
            this.length = length_cm;
        else
            this.length = -length_cm;
    }

    public void setWidth(int width_cm) {
        if (width_cm > 0)
            this.width = width_cm;
        else
            this.width = -width_cm;
    }

    public void setLength(double length_m) {
        if (length_m > 0.0)
            this.length = (int) (length_m * 100);
        else
            this.length = (int) (-length_m * 100);
    }

    public void setWidth(double width_m) {
        if (width_m > 0.0)
            this.width = (int) (width_m * 100);
        else
            this.width = (int) (-width_m * 100);
    }

    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    public int size() {
        return this.length * this.width;
    }

}
