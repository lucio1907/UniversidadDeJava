package Fundamentals.basics;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        System.out.println("Write your name: ");
        Scanner console = new Scanner(System.in);

        var user = console.nextLine();
        System.out.println(user);

        System.out.println("Write your title: ");

        var title = console.nextLine();
        System.out.println("Result: " + title + " " + user);

        console.close();
    }
}
