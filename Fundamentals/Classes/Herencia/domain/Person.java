package Fundamentals.Classes.Herencia.domain;

public class Person {
    // Si ponemos la variable de tipo "protected" la clase hija puede acceder a los atributos de la clase padre 
    protected String name;
    protected char gender;
    protected int age;
    protected String address;

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, char gender, int age, String address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person {name=" + name + ", gender=" + gender + ", age=" + age + ", address=" + address + "}";
    }
}
