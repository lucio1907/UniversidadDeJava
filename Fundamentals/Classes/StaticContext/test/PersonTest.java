package Fundamentals.Classes.StaticContext.test;

import Fundamentals.Classes.StaticContext.domain.Person;

public class PersonTest {
    private int counter;

    public static void main(String[] args) {
        Person person1 = new Person("Lucio");
        Person person2 = new Person("Martina");

        print(person1);
        print(person2);

    }

    // Contexto estatico - No puede utilizar metodos dinamicos ni tampoco usar variables de tipo privadas con la palabra this 
    public static void print(Person person) {
        System.out.println(person);
    }

    // Contexto dinamico - Puede acceder a metodos estaticos y variables privadas sin problema
    public int getCounter() {
        print(new Person("Martin"));
        return this.counter;
    }
}
