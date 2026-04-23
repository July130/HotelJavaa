package application.repository;

import application.domain.Employee;
import application.service.ports.EmployeeRepositoryPort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class EmployeeRepository implements EmployeeRepositoryPort {

    List<Employee> employees = new ArrayList<>(
            Arrays.asList(
                    new Employee(1, "Laura", "Torres", "laura@hotel.com", "admin1", true, "Recepcionista", 2500000),
                    new Employee(2, "Pedro", "Gomez", "pedro@hotel.com", "admin2", true, "Administrador", 4000000),
                    new Employee(3, "Sofia", "Diaz", "sofia@hotel.com", "admin3", false, "Aseador", 1800000)
            ));

    @Override
    public Employee saveEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }

    @Override
    public Employee updateEmployee(int id, Employee employee) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                employees.set(i, employee);
                return employee;
            }
        }
        throw new IllegalArgumentException("Empleado con Id " + id + " no encontrado");
    }

    @Override
    public Optional<Employee> findEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return Optional.of(employee);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Employee> findAllEmployees() {
        return employees;
    }

    @Override
    public void deleteEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employees.remove(employee);
                System.out.println("Empleado con id " + id + " ha sido eliminado.");
                return;
            }
        }
        System.out.println("Empleado con id " + id + " no encontrado.");
    }
}