package Fundamentals.Classes;

public class TestsPerson {
    public static void main(String[] args) {
        Person person1;
        person1 = new Person();
        person1.name = "Lucio";
        person1.lastname = "Gastellu";
        person1.showInfo();

        Person person2;
        person2 = new Person();
        person2.name = "Martina";
        person2.lastname = "Perez";
        person2.showInfo();
    }
}
