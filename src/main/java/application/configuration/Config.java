package application.configuration;

import application.domain.Guest;
import application.repository.BedRoomRepository;
import application.repository.BedRoomTypeRepository;
import application.repository.GuestRepository;
import application.service.BedRoomServiceImp;
import application.service.GuestAdminServiceImpl;
import application.service.GuestServiceImpl;
import application.service.outputs.BedRoomService;
import application.service.outputs.GuestAdminService;
import application.service.outputs.GuestService;
import application.service.ports.BedRoomRepositoryPort;
import application.userinterface.MenuApp;
import application.view.BedRoomView;
import application.view.GuestView;

public class Config {

    public static MenuApp createMenuApp(){

        Guest guest = new Guest();
        GuestRepository guestRepository = new GuestRepository();
        GuestService guestService = new GuestServiceImpl(guestRepository);
        GuestAdminService guestAdminService = new GuestAdminServiceImpl(guestRepository);
        GuestView guestView = new GuestView(guestService, guest, guestAdminService );

        BedRoomTypeRepository bedRoomTypeRepository = new BedRoomTypeRepository();


        BedRoomRepositoryPort bedRoomRepositoryPort = new BedRoomRepository();
        BedRoomService bedRoomService = new BedRoomServiceImp(bedRoomRepositoryPort, bedRoomTypeRepository);
        BedRoomView bedRoomView = new BedRoomView(bedRoomService);

        return new MenuApp(guestView, bedRoomView);
    }






}
