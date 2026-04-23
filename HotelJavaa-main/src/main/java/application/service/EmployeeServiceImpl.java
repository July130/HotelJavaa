package application.service;

import application.domain.Employee;
import application.repository.EmployeeRepository;
import application.service.outputs.EmployeeService;

import java.util.Optional;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    Scanner sc = new Scanner(System.in);

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee createEmployee(Employee employee) {

        System.out.println("Ingrese el id del Empleado");
        int id = sc.nextInt();
        sc.nextLine();
        employee.setId(id);
        System.out.println("Ingrese el nombre del Empleado");
        String name = sc.nextLine();
        employee.setName(name);
        System.out.println("Ingrese el apellido");
        String lastName = sc.nextLine();
        employee.setLastName(lastName);
        System.out.println("Ingrese el email");
        String email = sc.nextLine();
        employee.setEmail(email);
        System.out.println("Ingrese el password");
        String password = sc.nextLine();
        employee.setPassword(password);
        System.out.println("Estado Empleado (true/false)");
        boolean state = sc.nextBoolean();
        sc.nextLine();
        employee.setState(state);
        System.out.println("Ingrese el cargo");
        String position = sc.nextLine();
        employee.setPosition(position);
        System.out.println("Ingrese el salario");
        double salary = sc.nextDouble();
        employee.setSalary(salary);

        employeeRepository.saveEmployee(employee);

        return employee;
    }

    @Override
    public Employee updateEmployee(Employee employee) {

        Employee existing = employeeRepository.findEmployeeById(employee.getId())
                .orElseThrow(() -> new IllegalArgumentException(
                        "Empleado con id " + employee.getId() + " no encontrado"
                ));

        existing.setName(employee.getName());
        existing.setLastName(employee.getLastName());
        existing.setEmail(employee.getEmail());
        existing.setPassword(employee.getPassword());
        existing.setState(employee.getState());
        existing.setPosition(employee.getPosition());
        existing.setSalary(employee.getSalary());

        employeeRepository.updateEmployee(existing.getId(), existing);

        return existing;
    }

    @Override
    public Optional<Employee> getEmployeeById(int id) {
        return employeeRepository.findEmployeeById(id);
    }
}