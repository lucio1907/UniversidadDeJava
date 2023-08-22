package Fundamentals.Exercises;

import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        try (var console = new Scanner(System.in)) {
            System.out.println("Name: ");
            var name = console.nextLine();
            System.out.println("ID: ");
            var id = console.nextInt();
            System.out.println("Price: ");
            var price = console.nextDouble();
            System.out.println("Free shipping: ");
            var freeShipping = console.nextBoolean();

            Object[] bookInfo = { name, id, price, freeShipping };
            String[] info = {"Name: ", "ID: ", "Price: $", "Free shipping: "};

            for (int i = 0; i < bookInfo.length; i++) {
                System.out.println(info[i] + bookInfo[i]);
            }
        }
    }
}
