package application.domain;

import java.util.Scanner;

public class Employee{

    Scanner sc = new Scanner(System.in);

    private int employeeId;
    private String name;
    private String lastName;
    private String position;
    private double salary;
    private boolean state;

    // Constructors

    public Employee() {
    }

    public Employee(int employeeId, String name, String lastName, String position, double salary, boolean state) {
        this.employeeId = employeeId;
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
        this.state = state;
    }

    public Employee(String name) {
        this.name = name;
    }

    // Getters and Setters

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
public class Employee extends Person{

    private String position;
    private double salary;

    public Employee(){

        super();
    }

    public Employee(int id, String name, String lastName, String email, String password, Boolean state, String position, double salary) {
        super(id, name, lastName, email, password, state);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    // Methods

    public Employee createEmployee(Employee employee) {

        System.out.println("Ingrese el id del empleado");
        employee.employeeId = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el nombre del empleado");
        employee.name = sc.nextLine();

        System.out.println("Ingrese el apellido del empleado");
        employee.lastName = sc.nextLine();

        System.out.println("Ingrese el cargo del empleado");
        employee.position = sc.nextLine();

        System.out.println("Ingrese el salario");
        employee.salary = sc.nextDouble();
        sc.nextLine();

        System.out.println("Seleccione el estado del empleado");
        employee.state = sc.nextBoolean();

        return employee;
    }

    public void getEmployeeById(int id, Employee employee) {

        if (this.employeeId == id) {
            System.out.println("Id: " + employee.employeeId + "\n" +
                    "Nombre: " + employee.name + "\n" +
                    "Apellido: " + employee.lastName + "\n" +
                    "Cargo: " + employee.position + "\n" +
                    "Salario: " + employee.salary + "\n" +
                    "Estado: " + employee.state + "\n");
        } else {
            System.out.println("Valide el id del empleado que está consultando");
        }
    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
