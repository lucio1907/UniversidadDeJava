package Fundamentals.Arrays.test;

import Fundamentals.Arrays.domain.Person;

public class TestArraysObject {
    public static void main(String[] args) {
        // Arrays con objetos
        Person persons[] = new Person[2];
        persons[0] = new Person("Lucio");
        persons[1] = new Person("Martina");

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].getName());
        }
    }
}