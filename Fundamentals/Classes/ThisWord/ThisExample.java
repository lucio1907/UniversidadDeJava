package Fundamentals.Classes.ThisWord;

public class ThisExample {
    public static void main(String[] args) {
        Person person1 = new Person("Lucio", "Gastellu");    
        System.out.println(person1);
    }
}

class Person {
    String name;
    String lastname;

    // Constructor
    Person(String name, String lastname) {
        // super(); Se manda a llamar el constructor de la clase padre
        this.name = name;
        this.lastname = lastname;
        System.out.println("Person object using this: " + this);
        new ShowInfo().print(this);
    }
}

class ShowInfo {
    public void print(Person person) {
        System.out.println("Person from print " + person);
        System.out.println("Println about the actual object (this) " + this);
    }
}