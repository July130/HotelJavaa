package application.domain.enums;

public enum GuestState {

    ACTIVO("Huésped Activo"),
    INACTIVO("Huésped Inactivo");

    private final String description;

    GuestState(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
