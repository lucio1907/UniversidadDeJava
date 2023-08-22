package Fundamentals.AritmeticOperators;

public class Aritmetic {
    public static void main(String[] args) {
        // Suma
        int a=3, b=2;
        int result = a + b;
        System.out.println(result);

        // Resta
        result = a - b;
        System.out.println(result);

        // Multiplicacion
        result = a * b;
        System.out.println(result);

        // Division 
        double newResult = 3.0 / b;
        System.out.println(newResult);
    
        // Modulo
        result = a % b;
        System.out.println(result);

        if ( a % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("impar");
        }
    }
}
