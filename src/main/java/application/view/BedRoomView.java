package application.view;

import application.domain.BedRoom;
import application.service.outputs.BedRoomService;
import application.util.FormValidationUtil;

public class BedRoomView {

    private final BedRoomService bedRoomService;



    public BedRoomView(BedRoomService bedRoomService) {
        this.bedRoomService = bedRoomService;
    }

    public void createBedRoom() {
        System.out.println("Mostrando la habitación...");
        bedRoomService.createBedRoom();

    }

    public void getAllBedRooms() {
        System.out.println("Mostrando todas las habitaciones...");
        bedRoomService.getAllBedRooms();
    }


    public void getBedRoomById(){
        bedRoomService.getBedRoomById(FormValidationUtil
                .validateInt("Ingrese el id de la Habitacion"));
    }



}
