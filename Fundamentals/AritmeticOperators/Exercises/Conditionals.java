package Fundamentals.AritmeticOperators.Exercises;

public class Conditionals {
    public static void main(String[] args) {
        int a = 10;
        int minimumValue = 0;
        int maximumValue = 10;

        boolean result = a >= 0 && a <= 10;

        if (result) {
            System.out.println(maximumValue);
        } else {
            System.out.println(minimumValue);
        }

        boolean holidays = false;
        boolean restDay = false;

        if (holidays || restDay) {
            System.out.println("Father could attend to his son's game");
        } else {
            System.out.println("Father is busy");
        }
    }
}
