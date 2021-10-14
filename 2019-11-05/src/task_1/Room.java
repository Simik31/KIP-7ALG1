package task_1;

import java.util.Random;

public class Room {

    private Integer roomNumber;
    private RoomType type;
    private Integer capacity;

    public Room(Integer roomNumber) {
        this.roomNumber = roomNumber;
        Random rnd = new Random();
        switch(rnd.nextInt(4) + 1) {
            case 1:
                this.type = RoomType.SINGLE;
                this.capacity = 1;
                break;
            case 2:
                this.type = RoomType.DOUBLE;
                this.capacity = 2;
                break;
            case 3:
                this.type = RoomType.TRIPLE;
                this.capacity = 3;
                break;
            case 4:
                this.type = RoomType.QUAD;
                this.capacity = 4;
        }
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public RoomType getType() {
        return type;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", type=" + type +
                ", capacity=" + capacity +
                '}';
    }
}
