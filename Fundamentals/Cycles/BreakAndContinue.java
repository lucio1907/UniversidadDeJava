package Fundamentals.Cycles;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            if (i % 2 == 0) {
                continue; // Continue sigue con el ciclo y break corta el ciclo
            }
            System.out.println(i);
        }
    }
}
