package Fundamentals;

public class PrimitiveTypes2 {
    public static void main(String[] args) {
        /*
         * Tipo primitivo char
         */
        char myCharacter = 33; // Numero decimal que contiene caracter ascii
        System.out.println(myCharacter);

        var age = 17;
        var isAdult = age >= 18; // Se pueden usar condicionales en las variables

        if (isAdult) {
            System.out.println("Is adult");
        } else {
            System.out.println("Is not adult");
        }
    }
}