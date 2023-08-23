package Fundamentals.Classes.Aritmetic.src.operations;

public class Aritmetic {
    // Atributos de la clase
    int a;
    int b;

    // Constructor vacio
    public Aritmetic() {
        System.out.println("Executing constructor");
    }

    public Aritmetic(int arg1, int arg2) {
        this.a = arg1;
        this.b = arg2;
    }

    public void sum() {
        int result = this.a + this.b;
        System.out.println(result);
    }

    public int sumWithReturn() {
        int result = this.a + this.b;
        return result;
    }

    public int sumWithArguments(int value1, int value2) {
        int result = value1 + value2;
        return result;
    }
}
