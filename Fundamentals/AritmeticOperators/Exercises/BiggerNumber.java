package Fundamentals.AritmeticOperators.Exercises;

import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
        try(Scanner user = new Scanner(System.in)) {
            System.out.println("Insert a number");
            int number1 = user.nextInt();
            System.out.println("Insert another number");
            int number2 = user.nextInt();
            int result = number1 > number2 ? number1 : number2;
            System.out.println("The bigger number is " + result);
        }
    }
}
