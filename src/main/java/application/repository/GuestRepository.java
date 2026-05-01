package application.repository;

import application.domain.BedRoom;
import application.domain.Guest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GuestRepository {


    List<Guest> guests = new ArrayList<>(
            Arrays.asList(
                   new Guest(1, "Maria", "Gomez","mg@mail.com", "123456" , true , "Medellín" , "Nuevo"),
                   new Guest(2, "Juan", "Perez", "juan@mail.com","12345678", true , "Bogotá", "Frecuente")
            )
    );


    public Guest saveGuest(Guest guest){

        guests.add(guest);

        return guest;

    }

    public List<Guest> getAllGuests(){

        for(Guest guest : guests){
            System.out.println(guest);
        }

        return guests;

    }

}
