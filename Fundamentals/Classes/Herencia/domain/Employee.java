package Fundamentals.Classes.Herencia.domain;

public class Employee extends Person {
    private int idEmployee = 1;
    private double salary;
    private static int employeeCounter;

    // Concepto de sobrecarga de constructores 
    public Employee() {
        this.idEmployee = Employee.employeeCounter++;
    }

    // No se puede utilizar super y this a la vez, con sobrecarga de constructores podriamos usarlo asi
    public Employee(String name, double salary) {
        // super(name);
        this();
        this.name = name;
        this.salary = salary;
    }

    public int getIdEmployee() {
        return this.idEmployee;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getEmployeeCounter() {
        return employeeCounter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee {idEmployee=").append(this.idEmployee);
        sb.append(", salary=").append(this.salary);
        sb.append(", ").append(super.toString()).append('}');
        sb.append('}');
        return sb.toString();
    }
}
