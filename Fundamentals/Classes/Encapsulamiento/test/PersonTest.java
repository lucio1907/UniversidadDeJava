package Fundamentals.Classes.Encapsulamiento.test;

import Fundamentals.Classes.Encapsulamiento.domain.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Lucio", 2000.00, false);
        person1.setName("Ramiro"); 
        // System.out.println(person1.getName());
        // System.out.println(person1.getSalary());
        // System.out.println(person1.isDeleted());

        System.out.println(person1.toString());
    }
}
