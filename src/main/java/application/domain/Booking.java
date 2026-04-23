package application.domain;

import java.util.Scanner;

public class Booking {

    Scanner sc = new Scanner(System.in);

    private int bookingId;
    private String checkIn;
    private String checkOut;
    private double totalAmount;
    private boolean state;

    // Constructors

    public Booking() {
    }

    public Booking(int bookingId, String checkIn, String checkOut, double totalAmount, boolean state) {
        this.bookingId = bookingId;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.totalAmount = totalAmount;
        this.state = state;
    }

    public Booking(int bookingId) {
        this.bookingId = bookingId;
    }

    // Getters and Setters

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    // Methods

    public Booking createBooking(Booking booking) {

        System.out.println("Ingrese el id de la reserva");
        booking.bookingId = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese la fecha de check-in");
        booking.checkIn = sc.nextLine();

        System.out.println("Ingrese la fecha de check-out");
        booking.checkOut = sc.nextLine();

        System.out.println("Ingrese el valor total");
        booking.totalAmount = sc.nextDouble();
        sc.nextLine();

        System.out.println("Seleccione el estado de la reserva");
        booking.state = sc.nextBoolean();

        return booking;
    }

    public void getBookingById(int id, Booking booking) {

        if (this.bookingId == id) {
            System.out.println("Id: " + booking.bookingId + "\n" +
                    "CheckIn: " + booking.checkIn + "\n" +
                    "CheckOut: " + booking.checkOut + "\n" +
                    "Total: " + booking.totalAmount + "\n" +
                    "Estado: " + booking.state + "\n");
        } else {
            System.out.println("Valide el id de la reserva que está consultando");
        }
    }
}
