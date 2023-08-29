package Fundamentals.Classes.SobrecargaMetodos.test;

import Fundamentals.Classes.SobrecargaMetodos.operations.Operations;

public class OperationsTest {
    public static void main(String[] args) {
        int result = Operations.sum(1, 3);
        System.out.println(result);

        double result2 = Operations.sum(2.0, 2.3);
        System.out.println(result2);
    }
}
