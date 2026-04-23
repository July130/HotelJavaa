package application.service;

import application.domain.Employee;
import application.repository.EmployeeRepository;
import application.service.outputs.EmployeeAdminService;

import java.util.List;

public class EmployeeAdminServiceImpl implements EmployeeAdminService {

    private final EmployeeRepository employeeRepository;

    public EmployeeAdminServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAllEmployees();
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteEmployeeById(id);
    }
}
