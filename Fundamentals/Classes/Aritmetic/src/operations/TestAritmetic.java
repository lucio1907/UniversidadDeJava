package Fundamentals.Classes.Aritmetic.src.operations;

public class TestAritmetic {
    public static void main(String[] args) {
        Aritmetic aritmetic1 = new Aritmetic();

        aritmetic1.a = 1;
        aritmetic1.b = 3;
        aritmetic1.sum();

        int result = aritmetic1.sumWithReturn();
        System.out.println(result);

        int result2 = aritmetic1.sumWithArguments(1, 4);
        System.out.println(result2);

        Aritmetic aritmetic2 = new Aritmetic(2, 13);
        aritmetic2.sum();
    }
}
