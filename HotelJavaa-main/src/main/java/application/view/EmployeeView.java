package application.view;

import application.domain.Employee;
import application.service.outputs.EmployeeAdminService;
import application.service.outputs.EmployeeService;
import application.util.FormValidationUtil;

import java.util.List;

public class EmployeeView {

    private final EmployeeService employeeService;
    private final EmployeeAdminService employeeAdminService;
    private final Employee employee;

    public EmployeeView(EmployeeService employeeService, Employee employee, EmployeeAdminService employeeAdminService) {
        this.employeeService = employeeService;
        this.employee = employee;
        this.employeeAdminService = employeeAdminService;
    }

    public void createEmployee() {
        employeeService.createEmployee(employee);
    }

    public void getAllEmployees() {
        List<Employee> employees = employeeAdminService.getEmployees();
        for (Employee emp : employees) {
            System.out.println(emp.getId() + " "
                    + emp.getName() + " "
                    + emp.getLastName() + " "
                    + emp.getPosition() + " "
                    + emp.getSalary() + " "
                    + emp.getState());
        }
    }

    public void getEmployeeById() {
        System.out.println("Buscar empleado por Id");
        Employee emp = employeeService.getEmployeeById(
                        FormValidationUtil.validateInt("Ingrese el id del Empleado"))
                .orElseThrow(() -> new IllegalArgumentException(
                        "Empleado no encontrado"
                ));

        System.out.println(emp.getId() + " "
                + emp.getName() + " "
                + emp.getLastName() + " "
                + emp.getPosition() + " "
                + emp.getSalary() + " "
                + emp.getState());
    }

    public void deleteEmployee() {
        employeeAdminService.deleteEmployee(
                FormValidationUtil.validateInt("Ingrese el id del Empleado a eliminar"));
    }
}