package cz.osu.student.r19584.kip7alg1.tut7.task_1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Room room1 = new Room(1);
        Room room2 = new Room(2);
        Room room3 = new Room(3);
        Room room4 = new Room(4);

        Reservation reservation1 = new Reservation(LocalDate.of(2019, 11, 5), 3, "Pektor", room1);
        Reservation reservation2 = new Reservation(LocalDate.of(2019, 11, 6), 4, "Bradáč", room2);

        reservation1.setPaid(true);

        Hotel hotel = new Hotel("Hotel la Stupid", room1, room2, room3, room4);

        System.out.println(hotel);
        System.out.println(reservation1);
        System.out.println(reservation2);
    }
}
