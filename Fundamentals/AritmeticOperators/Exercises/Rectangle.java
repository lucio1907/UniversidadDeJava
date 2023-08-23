package Fundamentals.AritmeticOperators.Exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        try (Scanner user = new Scanner(System.in)) {
            System.out.println("Give me a height:");
            int height = user.nextInt();

            System.out.println("Give me a width:");
            int width = user.nextInt();

            int area = height * width;
            int perimeter = (height + width) * 2;

            System.out.println("The rectangle area is " + area + " units");
            System.out.println("The rectangle perimeter is " + perimeter + " units");
        }
    }
}
