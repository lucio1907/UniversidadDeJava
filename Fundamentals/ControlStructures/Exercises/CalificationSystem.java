package Fundamentals.ControlStructures.Exercises;

import java.util.Scanner;

public class CalificationSystem {
    public static void main(String[] args) {
        try(Scanner student = new Scanner(System.in)) {
            System.out.println("Write your note:");
            int note = student.nextInt();
            
            if (note < 0 || note > 10) {
                System.out.println("Unknow value");
            }

            if (note >= 0 && note < 6) {
                System.out.println("Calification: 'F'");
            }

            if (note >= 6 && note < 7) {
                System.out.println("Calification: 'D'");
            }

            if (note >= 7 && note < 8) {
                System.out.println("Calification: 'C'");
            }

            if (note >= 8 && note < 9) {
                System.out.println("Calification: 'B'");
            }

            if (note >= 9 && note <= 10) {
                System.out.println("Calification: 'A'");
            }
        }
    }
}
