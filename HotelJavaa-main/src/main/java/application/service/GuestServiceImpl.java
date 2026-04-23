package application.service;

import application.domain.Guest;
import application.repository.GuestRepository;
import application.service.outputs.GuestService;

import java.util.Optional;
import java.util.Scanner;

public class GuestServiceImpl implements GuestService {

    Scanner sc = new Scanner(System.in);

    private final GuestRepository guestRepository;

    public GuestServiceImpl(GuestRepository guestRepository){

        this.guestRepository= guestRepository;

    }




    @Override
    public Guest createGuest(Guest guest) {

        System.out.println("Ingrese el id del Huesped");
        int id = sc.nextInt();
        sc.nextLine();
        guest.setId(id);
        System.out.println("Ingrese el nombre del Huesped");
        String name = sc.nextLine();
        guest.setName(name);
        System.out.println("INgrese el apellido");
        String lastName = sc.nextLine();
        guest.setLastName(lastName);
        System.out.println("ingrese el email");
        String email = sc.nextLine();
        guest.setEmail(email);
        System.out.println("Ingrese el password ");
        String password = sc.nextLine();
        guest.setPassword(password);
        System.out.println("Estado Huesped ");        boolean state = sc.nextBoolean();
        guest.setState(state);
        System.out.println("Origen");
        String origin = sc.nextLine();
        guest.setOrigin(origin);
        System.out.println("Tipo de Huesped");
        String guestType = sc.nextLine();
        guest.setGuestType(guestType);

        return guest;
    }

    @Override
    public Guest updateGuest(Guest guest) {
        return null;
    }

    @Override
    public Optional<Guest> getGuestById(int id) {
        return Optional.empty();
    }
}
