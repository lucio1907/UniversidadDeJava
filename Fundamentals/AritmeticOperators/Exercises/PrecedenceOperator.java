package Fundamentals.AritmeticOperators.Exercises;

public class PrecedenceOperator {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = ++x + y--; // Se suma anteriormente 1 a X y luego se suma Y que es 10 y se decrementa posteriormente, por lo que queda en 16
        System.out.println(z);

        int result = 4 + 5 * 6 / 3; // Mas prioridad tiene la multiplicacion y la division por lo que quedaria de esta forma = 4 + ((5 * 6) / 3)
        System.out.println(result);

        result = (4 + 5) * 6 / 3;
        System.out.println(result);
    }
}
