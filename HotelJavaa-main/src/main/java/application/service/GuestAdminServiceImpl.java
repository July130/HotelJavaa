package application.service;

import application.domain.Guest;
import application.repository.GuestRepository;
import application.service.outputs.GuestAdminService;

import java.util.List;

public class GuestAdminServiceImpl implements GuestAdminService {


    private final GuestRepository guestRepository;

    public GuestAdminServiceImpl(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    public List<Guest> getGuests() {
        return guestRepository.getAllGuests();
    }

    @Override
    public void deleteGuest(int id) {

    }
}
