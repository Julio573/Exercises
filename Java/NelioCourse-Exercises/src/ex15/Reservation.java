package ex15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {

    private int roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public Reservation() {
    }

    public Reservation(int roomNumber, LocalDate checkIn, LocalDate checkOut) {
        if (checkIn.isBefore(LocalDate.now()) || checkOut.isBefore(LocalDate.now())) {
            throw new PastDateException(
                    "Please enter valid dates"
            );
        } else if (checkOut.isBefore(checkIn)) {
            throw new InvalidCheckOutDateException(
                    "Error in reservation: Check-out date must be after check-in date"
            );
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public Long duration() {
        return ChronoUnit.DAYS.between(getCheckIn(), getCheckOut());
    }

    public void updateDates(LocalDate updatedCheckIn, LocalDate updatedCheckOut) {
        if (updatedCheckIn.isBefore(LocalDate.now()) || updatedCheckOut.isBefore(LocalDate.now())) {
            throw new PastDateException(
                    "Please enter valid dates"
            );
        } else if (!checkOut.isAfter(updatedCheckIn)) {
            throw new InvalidCheckOutDateException(
                    "Error in reservation: Check-out date must be after check-in date"
            );
        }

        this.checkIn = updatedCheckIn;
        this.checkOut = updatedCheckOut;
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return "Reservation: Room " +
                getRoomNumber() +
                ", check-in: " +
                checkIn.format(fmt) +
                ", check-out: " +
                checkOut.format(fmt) +
                ", " +
                duration() +
                " nights";
    }
}
