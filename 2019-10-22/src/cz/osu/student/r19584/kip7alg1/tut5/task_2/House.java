package cz.osu.student.r19584.kip7alg1.tut5.task_2;

public class House {
    public Room room1;
    public Room room2;
    public Room room3;

    public int size() {
        return room1.size() + room2.size() + room3.size();
    }
}
