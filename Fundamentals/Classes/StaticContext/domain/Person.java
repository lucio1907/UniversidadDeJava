package Fundamentals.Classes.StaticContext.domain;

public class Person {
    private int idPerson;
    private String name;
    private static int counterPersons = 1;

    public Person(String name) {
        this.name = name;
        // Incrementar el contador por cada objeto nuevo
        // counterPersons++;  No se recomienda usar la palabra this para las variables static ya que se maneja con la clase
        // Asignar nuevo valor a la variable idPerson
        this.idPerson = Person.counterPersons++; // Forma corta
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCounterPersons() {
        return counterPersons;
    }

    public static void setCounterPersons(int counterPersons) {
        Person.counterPersons = counterPersons;
    }

    @Override
    public String toString() {
        return "Person [idPerson=" + idPerson + ", name=" + name + "]";
    }    
}
