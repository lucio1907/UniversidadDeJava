package Fundamentals.Classes.Encapsulamiento.domain;

public class Person {
    // Ponemos las variables como privadas para que no se pueda acceder desde otras clases
    private String name;
    private double salary;
    private boolean deleted;

    public Person(String name, double salary, boolean deleted) {
        this.name = name;
        this.salary = salary;
        this.deleted = deleted;
    }

    // Get
    public String getName() {
        return this.name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Para los tipos boolean se cambia GET por IS ya que es una pregunta
    public boolean isDeleted() {
        return deleted;
    }
    
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    // Metodo para mostrar todos los datos, como el metodo __str__ en python
    public String toString() {
        return "Person [ name: " + this.name + 
        " salary: " + this.salary +
        " deleted: " + this.deleted + " ]";
    }
}
