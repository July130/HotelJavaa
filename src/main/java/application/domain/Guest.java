package application.domain;

import java.util.Scanner;

public class Guest {

    Scanner sc = new Scanner(System.in);

    private int guestId;
    private String name;
    private String lastName;
    private String documentNumber;
    private String email;
    private boolean state;

    // Constructors

    public Guest() {
    }

    public Guest(int guestId, String name, String lastName, String documentNumber, String email, boolean state) {
        this.guestId = guestId;
        this.name = name;
        this.lastName = lastName;
        this.documentNumber = documentNumber;
        this.email = email;
        this.state = state;
    }

    public Guest(String name) {
        this.name = name;
    }

    // Getters and Setters

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    // Methods

    public Guest createGuest(Guest guest) {

        System.out.println("Ingrese el id del huésped");
        guest.guestId = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el nombre del huésped");
        guest.name = sc.nextLine();

        System.out.println("Ingrese el apellido del huésped");
        guest.lastName = sc.nextLine();

        System.out.println("Ingrese el número de documento");
        guest.documentNumber = sc.nextLine();

        System.out.println("Ingrese el correo electrónico");
        guest.email = sc.nextLine();

        System.out.println("Seleccione el estado del huésped");
        guest.state = sc.nextBoolean();

        return guest;
    }

    public void getGuestById(int id, Guest guest) {

        if (this.guestId == id) {
            System.out.println("Id: " + guest.guestId + "\n" +
                    "Nombre: " + guest.name + "\n" +
                    "Apellido: " + guest.lastName + "\n" +
                    "Documento: " + guest.documentNumber + "\n" +
                    "Email: " + guest.email + "\n" +
                    "Estado: " + guest.state + "\n");
        } else {
            System.out.println("Valide el id del huésped que está consultando");
        }
    }
}
