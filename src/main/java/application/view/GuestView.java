package application.view;

import application.domain.Guest;
import application.service.outputs.GuestAdminService;
import application.service.outputs.GuestService;

public class GuestView {

    private final GuestService guestService;
    private final GuestAdminService guestAdminService;
    private final Guest guest;

    public GuestView(GuestService guestService, Guest guest , GuestAdminService guestAdminService) {
        this.guestAdminService = guestAdminService;
        this.guestService = guestService;
        this.guest = guest;
    }

    public void createGuest(){


        guestService.createGuest(guest);

    }

    public void getAllGuests(){
        guestAdminService.getGuests();
    }





}
