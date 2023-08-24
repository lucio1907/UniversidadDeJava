package Fundamentals.Classes.PasoPorValor;

import Fundamentals.Classes.Person;

public class Ref {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Lucio";
        System.out.println("Name: " + person1.name);

        // Cambiamos valor
        person1 = changeValue(person1);   
        System.out.println("New name: " + person1.name);     
    }

    public static Person changeValue(Person person) {
        if (person == null) return null;
        person.name = "Martina"; // Como el argumento esta apuntando al mismo objeto que la variable person1, esta va a cambiar de valor
        return person;
    }
}
