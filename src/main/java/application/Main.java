package application;

import application.domain.Person;
import application.domain.BedRoom;
import application.domain.Employee;
import application.domain.Service;
import application.domain.Guest;
import application.domain.Booking;


public class Main {

    public static void main(String[] args) {

        Person person = new Person("jd@med.com");

        /*
        person.setId(1);
        person.setName("John");
        person.setLastName("Doe");
        //person.setEmail("jd@mail.com");
        person.setPassword("123456");
        person.setState(true);

        System.out.println(person.getId());
        System.out.println(person.getName());
        System.out.println(person.getEmail());
        */

        BedRoom bedRoom = new BedRoom();
        bedRoom.createBedRoom(bedRoom);
        bedRoom.getBedRoomById(1, bedRoom);


        Service service = new Service();
        service.createService(service);
        service.getServiceById(1, service);


        Guest guest = new Guest();
        guest.createGuest(guest);
        guest.getGuestById(1, guest);


        Employee employee = new Employee();
        employee.createEmployee(employee);
        employee.getEmployeeById(1, employee);


        Booking booking = new Booking();
        booking.createBooking(booking);
        booking.getBookingById(1, booking);
    }
}

