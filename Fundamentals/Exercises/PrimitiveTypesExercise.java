package Fundamentals.Exercises;

import java.util.Scanner;

public class PrimitiveTypesExercise {
    public static void main(String[] args) {
        // Convertir string a tipo int
        var age = Integer.parseInt("20");
        System.out.println(age + 2);

        var PIValue = Double.parseDouble("3.1416");
        System.out.println(PIValue);
        
        // Pedir valor
        try (var console = new Scanner(System.in)) {
            System.out.println("Write anything: ");
            age = Integer.parseInt(console.nextLine());
            System.out.println(age);
        }

        var ageText = String.valueOf(age);
        System.out.println(ageText);
        
        var character = "Hi!".charAt(0); // Indice para buscar caracter
        System.out.println(character);
    }
}
