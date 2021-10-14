package task_2;

public class Room {

    public String name;
    private int width;
    private int length;

    //set v cm
    public void setLength(int length) {
        if(length > 0) this.length = length;
        else this.length = -length;
    }

    public void setWidth(int width) {
        if(width > 0) this.width = width;
        else this.width = -width;
    }

    //set v m
    public void setLength(double length) {
        if(length > 0.0) this.length = (int)(length * 100); // 1m = 100cm -> *100
        else this.length = (int)(-length * 100);
    }

    public void setWidth(double width) {
        if(width > 0.0) this.width = (int)(width * 100);
        else this.width = (int)(-width * 100);
    }

    //get
    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    //size
    public int size() {
        return this.length * this.width;
    }

}