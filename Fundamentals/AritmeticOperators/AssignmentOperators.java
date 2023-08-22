package Fundamentals.AritmeticOperators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 3, b = 2;
        int c = a + 5 - b;

        System.out.println(c);

        // Asignacion
        a += 1;
        System.out.println(a);

        a -= 1;
        System.out.println(a);

        a *= 2;
        System.out.println(a);

        a /= 2;
        System.out.println(a);
    }
}
