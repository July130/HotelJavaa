package application.service.ports;

import application.domain.BedRoomType;

import java.util.Optional;

public interface BedRoomTypeRepositoryPort {

    BedRoomType saveBedRoomType();
    Optional<BedRoomType> findBedRoomTypeById(int id);

}
