package task_2;

public class Main {

    public static void main(String[] args) {

        House house = new House();

        house.room1 = new Room();
        house.room2 = new Room();
        house.room3 = new Room();

        house.room1.name = "Kuchyň";
        house.room1.setLength(500);
        house.room1.setWidth(300);

        house.room2.name = "Obývák";
        house.room2.setLength(4.0);
        house.room2.setWidth(-6.0);

        house.room3.name = "Koupelna";
        house.room3.setLength(2.0);
        house.room3.setWidth(-300);

        System.out.print(
            "Room 1:\n\tName: " + house.room1.name +
                "\n\tSize: " + (house.room1.size() / 10000) + " m2 (" + house.room1.getLength() + "x" + house.room1.getWidth() + " cm)\n" +
            "Room 2:\n\tName: " + house.room2.name +
                "\n\tSize: " + (house.room2.size() / 10000) + " m2 (" + house.room2.getLength() + "x" + house.room2.getWidth() + " cm)\n" +
            "Room 3:\n\tName: " + house.room3.name +
                "\n\tSize: " + (house.room3.size() / 10000) + " m2 (" + house.room3.getLength() + "x" + house.room3.getWidth() + " cm)\n" +
            "\nTotal size of the house is " + house.size() + " cm2 (" + (house.size() / 10000) + " m2)"
        );
    }
}