package Fundamentals.Classes.Herencia.test;

import java.util.Date;

import Fundamentals.Classes.Herencia.domain.Client;
import Fundamentals.Classes.Herencia.domain.Employee;

public class InheritanceTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Lucio", 2000.00);
        System.out.println(employee1);

        Client client1 = new Client("Lucio", 'm', 22, "San martin 1485", new Date(), true);
        System.out.println(client1.toString());
    }
}
