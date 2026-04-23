package application.service.outputs;

import application.domain.Employee;

import java.util.List;

public interface EmployeeAdminService {

    public List<Employee> getEmployees();
    public void deleteEmployee(int id);

}