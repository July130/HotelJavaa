package application.service;

import application.domain.BedRoom;
import application.domain.BedRoomType;
import application.service.outputs.BedRoomService;
import application.service.ports.BedRoomRepositoryPort;
import application.service.ports.BedRoomTypeRepositoryPort;
import application.util.FormValidationUtil;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class BedRoomServiceImp implements BedRoomService {



    private final BedRoomRepositoryPort bedRoomRepositoryPort;
    private final BedRoomTypeRepositoryPort bedRoomTypeRepositoryPort;
    public BedRoomServiceImp(BedRoomRepositoryPort bedRoomRepositoryPort, BedRoomTypeRepositoryPort bedRoomTypeRepositoryPort) {
        this.bedRoomRepositoryPort = bedRoomRepositoryPort;
        this.bedRoomTypeRepositoryPort = bedRoomTypeRepositoryPort;
    }


    @Override
    public BedRoom createBedRoom() {

        BedRoom bedRoom = new BedRoom();


        bedRoom.setRoomId(FormValidationUtil.validateInt("Ingrese el Id de la habitacion"));
        bedRoom.setRoom(FormValidationUtil.validateString("Ingrese el numero de la habitación"));

        Optional<BedRoomType> bedRoomTypeOpt =bedRoomTypeRepositoryPort.findBedRoomTypeById(FormValidationUtil.validateInt("Ingrese el id"));
        if(bedRoomTypeOpt.isPresent()){
            BedRoomType bedRoomType = bedRoomTypeOpt.get();
            bedRoom.setBedRoomType(bedRoomType);
        }

        bedRoom.setPrice(FormValidationUtil.validateDouble("Ingrese el precio de la habitación"));
        bedRoom.setState(BedRoomStateSelector.bedRoomAddState());

        bedRoomRepositoryPort.saveBedRoom(bedRoom);




        return bedRoom;
    }




    @Override
    public BedRoom updateBedRoom(BedRoom bedRoom) {

        bedRoomRepositoryPort.updateBedRoom(1,bedRoom);
        return bedRoom;
    }

    @Override
    public Optional<BedRoom> getBedRoomById(int id) {
        return bedRoomRepositoryPort
                .findBedRoomById(id);
    }

    @Override
    public List<BedRoom> getAllBedRooms() {

        return bedRoomRepositoryPort.findAllBedRooms();
    }

    @Override
    public void deleteBedRoomById(int id) {

    }
}
