package application.service.outputs;

import application.domain.Employee;

import java.util.Optional;

public interface EmployeeService {

    public Employee createEmployee(Employee employee);
    public Employee updateEmployee(Employee employee);
    public Optional<Employee> getEmployeeById(int id);

}
