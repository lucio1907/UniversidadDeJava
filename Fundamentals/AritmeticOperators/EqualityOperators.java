package Fundamentals.AritmeticOperators;

public class EqualityOperators {
    public static void main(String[] args) {
        int a = 3, b = 2;

        // Operador igualdad
        boolean c = a == b;
        System.out.println("c = " + c);

        // Operador distinto que
        boolean d = a != b;
        System.out.println("d = " + d);

        String chain = "Hi";
        String chain2 = "GoodBye";
        boolean e = chain == chain2;
        System.out.println("e = " + e);

        // Otra forma
        boolean f = chain.equals(chain2);
        System.out.println("f = " + f);
    }
}
