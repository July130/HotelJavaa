package application.domain.enums;

public enum EmployeeEnums {

    RECEPCIONISTA("Recepcionista"),
    ADMINISTRADOR("Administrador"),
    ASEADOR("Aseador");

    private final String description;

    EmployeeEnums(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}