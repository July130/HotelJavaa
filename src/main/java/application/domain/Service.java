package application.domain;

import java.util.Scanner;

public class Service {

    Scanner sc = new Scanner(System.in);

    private int serviceId;
    private String name;
    private String description;
    private double price;
    private boolean state;

    // Constructors

    public Service() {
    }

    public Service(int serviceId, String name, String description, double price, boolean state) {
        this.serviceId = serviceId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.state = state;
    }

    public Service(String name) {
        this.name = name;
    }

    // Getters and Setters

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    // Methods

    public Service createService(Service service) {

        System.out.println("Ingrese el id del servicio");
        service.serviceId = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el nombre del servicio");
        service.name = sc.nextLine();

        System.out.println("Ingrese la descripción del servicio");
        service.description = sc.nextLine();

        System.out.println("Ingrese el precio del servicio");
        service.price = sc.nextDouble();
        sc.nextLine();

        System.out.println("Seleccione el estado del servicio");
        service.state = sc.nextBoolean();

        return service;
    }

    public void getServiceById(int id, Service service) {

        if (this.serviceId == id) {
            System.out.println("Id: " + service.serviceId + "\n" +
                    "Nombre: " + service.name + "\n" +
                    "Descripción: " + service.description + "\n" +
                    "Precio: " + service.price + "\n" +
                    "Estado: " + service.state + "\n");
        } else {
            System.out.println("Valide el id del servicio que está consultando");
        }
    }
}
