package application.domain.enums;

public enum EmployeeState {

    ACTIVO("Empleado Activo"),
    INACTIVO("Empleado Inactivo");

    private final String description;

    EmployeeState(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}