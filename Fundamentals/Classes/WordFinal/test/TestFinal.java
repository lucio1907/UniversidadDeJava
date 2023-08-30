package test;

import domain.Person;

public class TestFinal {
    public static void main(String[] args) {
        final int myVar = 10; // Basicamente es una variable constante
        System.out.println(myVar);
        System.out.println(Person.CONSTANT);    
        
        // Se pueden modificar valores pero no se pueden crear objetos nuevos
        final Person person1 = new Person();
        person1.setName("Lucio");
        System.out.println(person1);
        person1.setName("Martina");
        System.out.println(person1);
    }
}