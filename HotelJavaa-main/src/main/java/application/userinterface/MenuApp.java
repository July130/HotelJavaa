package application.userinterface;

import application.util.FormValidationUtil;
import application.view.BedRoomView;
import application.view.EmployeeView;
import application.view.GuestView;

import java.util.Scanner;

public class MenuApp {

    Scanner sc = new Scanner(System.in);

    private final GuestView guestView;
    private final BedRoomView bedRoomView;
    private final EmployeeView employeeView;

    public MenuApp(GuestView guestView, BedRoomView bedRoomView, EmployeeView employeeView) {
        this.guestView = guestView;
        this.bedRoomView = bedRoomView;
        this.employeeView = this.employeeView;
    }

    public void showMainMenu() {

        System.out.println("Bienvenido al Hotel Java");

        int init = FormValidationUtil.validateInt("Presione 1 para iniciar la aplicacion");
        sc.nextLine();
        while (init != 0) {

            System.out.println("Seleccione 1. Registrar Usuario 2. Iniciar Sesion 3. Menu Empleados 4. Salir");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Registrar Usuario");
                    guestView.createGuest();
                    break;
                case 2:
                    System.out.println("Iniciar Sesion");
                    showBedRoomMenu();
                    break;
                case 3:
                    System.out.println("Menu Empleados");
                    showEmployeeMenu();
                    break;
                case 4:
                    System.out.println("Saliendo de la aplicacion");
                    init = 0;
                    break;
                default:
                    System.out.println("Opcion no valida, por favor seleccione una opcion valida");
            }
        }
    }

    public void showGuestMenu() {

        System.out.println("Menu Huespedes");
        Boolean init = true;

        while (init) {
            System.out.println("Seleccione 1. Crear Huesped 2. Actualizar Huesped 3. Eliminar Huesped 4. Listar Huespedes 5. Buscar huesped por id 6. Salir");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Crear Huesped");
                    guestView.createGuest();
                    break;
                case 2:
                    System.out.println("Actualizar Huesped");
                    break;
                case 3:
                    System.out.println("Eliminar Huesped");
                    break;
                case 4:
                    System.out.println("Listar Huespedes");
                    guestView.getAllGuests();
                    break;
                case 5:
                    System.out.println("Buscar huesped por id");
                    break;
                case 6:
                    System.out.println("Saliendo del menu de huespedes");
                    init = false;
                    break;
                default:
                    System.out.println("Opcion no valida, por favor seleccione una opcion valida");
            }
        }
    }

    public void showBedRoomMenu() {

        System.out.println("Menu Habitaciones");
        Boolean init = true;

        while (init) {
            System.out.println("Seleccione 1. Crear Habitacion 2. Actualizar Habitacion 3. Eliminar Habitacion 4. Listar Habitaciones 5. Buscar habitacion por id 6. Salir");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Crear Habitacion");
                    bedRoomView.createBedRoom();
                    break;
                case 2:
                    System.out.println("Actualizar Habitacion");
                    bedRoomView.updateBedRoom();
                    break;
                case 3:
                    System.out.println("Eliminar Habitacion");
                    bedRoomView.deleteBedRoomById();
                    break;
                case 4:
                    System.out.println("Listar Habitaciones");
                    bedRoomView.getAllBedRooms();
                    break;
                case 5:
                    System.out.println("Buscar habitacion por id");
                    bedRoomView.getBedRoomById();
                    break;
                case 6:
                    System.out.println("Saliendo del menu de habitaciones");
                    init = false;
                    break;
                default:
                    System.out.println("Opcion no valida, por favor seleccione una opcion valida");
            }
        }
    }

    public void showEmployeeMenu() {

        System.out.println("Menu Empleados");
        Boolean init = true;

        while (init) {
            System.out.println("Seleccione 1. Crear Empleado 2. Eliminar Empleado 3. Listar Empleados 4. Buscar Empleado por id 5. Salir");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Crear Empleado");
                    employeeView.createEmployee();
                    break;
                case 2:
                    System.out.println("Eliminar Empleado");
                    employeeView.deleteEmployee();
                    break;
                case 3:
                    System.out.println("Listar Empleados");
                    employeeView.getAllEmployees();
                    break;
                case 4:
                    System.out.println("Buscar Empleado por id");
                    employeeView.getEmployeeById();
                    break;
                case 5:
                    System.out.println("Saliendo del menu de empleados");
                    init = false;
                    break;
                default:
                    System.out.println("Opcion no valida, por favor seleccione una opcion valida");
            }
        }
    }
}
