package Fundamentals.Exercises;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        try (Scanner console = new Scanner(System.in)) {
            System.out.println("Write the book title: ");
            var title = console.nextLine();

            System.out.println("Autor name: ");
            var author = console.nextLine();

            System.out.println(title + " " + "written by" + " " + author);
        }
    }
}
