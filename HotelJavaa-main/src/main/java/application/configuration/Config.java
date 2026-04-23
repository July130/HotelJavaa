package application.configuration;

import application.domain.Employee;
import application.domain.Guest;
import application.repository.BedRoomRepository;
import application.repository.BedRoomTypeRepository;
import application.repository.EmployeeRepository;
import application.repository.GuestRepository;
import application.service.BedRoomServiceImp;
import application.service.EmployeeAdminServiceImpl;
import application.service.EmployeeServiceImpl;
import application.service.GuestAdminServiceImpl;
import application.service.GuestServiceImpl;
import application.service.outputs.BedRoomService;
import application.service.outputs.EmployeeAdminService;
import application.service.outputs.EmployeeService;
import application.service.outputs.GuestAdminService;
import application.service.outputs.GuestService;
import application.service.ports.BedRoomRepositoryPort;
import application.userinterface.MenuApp;
import application.view.BedRoomView;
import application.view.EmployeeView;
import application.view.GuestView;

public class Config {

    public static MenuApp createMenuApp() {

        // Guest
        Guest guest = new Guest();
        GuestRepository guestRepository = new GuestRepository();
        GuestService guestService = new GuestServiceImpl(guestRepository);
        GuestAdminService guestAdminService = new GuestAdminServiceImpl(guestRepository);
        GuestView guestView = new GuestView(guestService, guest, guestAdminService);

        // BedRoom
        BedRoomTypeRepository bedRoomTypeRepository = new BedRoomTypeRepository();
        BedRoomRepositoryPort bedRoomRepositoryPort = new BedRoomRepository();
        BedRoomService bedRoomService = new BedRoomServiceImp(bedRoomRepositoryPort, bedRoomTypeRepository);
        BedRoomView bedRoomView = new BedRoomView(bedRoomService);

        // Employee
        Employee employee = new Employee();
        EmployeeRepository employeeRepository = new EmployeeRepository();
        EmployeeService employeeService = new EmployeeServiceImpl(employeeRepository);
        EmployeeAdminService employeeAdminService = new EmployeeAdminServiceImpl(employeeRepository);
        EmployeeView employeeView = new EmployeeView(employeeService, employee, employeeAdminService);

        return new MenuApp(guestView, bedRoomView, employeeView);
    }
}