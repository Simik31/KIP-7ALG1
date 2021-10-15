package cz.osu.student.r19584.kip7alg1.tut7.task_1;

public class Hotel {
    private String name;
    private Room room1;
    private Room room2;
    private Room room3;
    private Room room4;

    public Hotel(String name, Room room1, Room room2, Room room3, Room room4) {
        this.name = name;
        this.room1 = room1;
        this.room2 = room2;
        this.room3 = room3;
        this.room4 = room4;
    }

    public String getName() {
        return name;
    }

    public Integer getCapacity() {
        return room1.getCapacity() + room2.getCapacity() + room3.getCapacity() + room4.getCapacity();
    }

    public Room getRoom1() {
        return room1;
    }

    public Room getRoom2() {
        return room2;
    }

    public Room getRoom3() {
        return room3;
    }

    public Room getRoom4() {
        return room4;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoom1(Room room1) {
        this.room1 = room1;
    }

    public void setRoom2(Room room2) {
        this.room2 = room2;
    }

    public void setRoom3(Room room3) {
        this.room3 = room3;
    }

    public void setRoom4(Room room4) {
        this.room4 = room4;
    }

    @Override
    public String toString() {
        return "Hotel{" + "name='" + name + '\'' + ", capacity=" + getCapacity() + ", room1=" + room1 + ", room2="
                + room2 + ", room3=" + room3 + ", room4=" + room4 + '}';
    }
}
