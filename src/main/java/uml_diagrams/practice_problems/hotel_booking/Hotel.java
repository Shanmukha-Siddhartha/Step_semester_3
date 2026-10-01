package practice_problems.hotel_booking;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Room> rooms;
    private List<Reservation> reservations;

    public Hotel() {
        rooms = new ArrayList<>();
        reservations = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public boolean isAvailable(
            Room room,
            int startDay,
            int endDay) {

        for (Reservation reservation : reservations) {

            if (reservation.getRoom() == room
                    && reservation.overlaps(
                    startDay,
                    endDay)) {

                return false;
            }
        }

        return true;
    }

    public Reservation bookRoom(
            Customer customer,
            String roomNumber,
            int startDay,
            int endDay) {

        for (Room room : rooms) {

            if (room.getRoomNumber()
                    .equals(roomNumber)) {

                if (!isAvailable(
                        room,
                        startDay,
                        endDay)) {

                    System.out.println(
                            "Room " + roomNumber
                                    + " is not available."
                    );

                    return null;
                }

                Reservation reservation =
                        new Reservation(
                                customer,
                                room,
                                startDay,
                                endDay
                        );

                reservations.add(reservation);

                System.out.printf(
                        "%s booked room %s. Total: $%.2f%n",
                        customer.getName(),
                        roomNumber,
                        reservation.getTotalPrice()
                );

                return reservation;
            }
        }

        System.out.println(
                "Room not found."
        );

        return null;
    }
}