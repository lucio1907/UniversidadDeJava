package domain;

// Tampoco puede tener clases hijas
public final class Person {
    public final static int CONSTANT = 1; // Variable constante

    private String name;

    public final void print() {
        System.out.println("Hola");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }   
}
