package application.domain.enums;

public enum GuestEnums {

    NACIONAL("Nacional"),
    EXTRANJERO("Extranjero");

    private final String description;

    GuestEnums(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}