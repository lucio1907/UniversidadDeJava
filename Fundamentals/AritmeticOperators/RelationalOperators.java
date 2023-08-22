package Fundamentals.AritmeticOperators;

public class RelationalOperators {
    public static void main(String[] args) {
        int a = 3, b = 2;
        boolean c = a >= b;
        System.out.println("c = " + c);

        if (a % 2 == 0) {
            System.out.println("It's an even number");
        } else {
            System.out.println("It's an odd number");
        }

        int age = 30;
        int adult = 18;

        if (age >= adult) {
            System.out.println("He/she is an adult");
        } else {
            System.out.println("He/she is not an adult");
        }
    }
}
