package Fundamentals.Classes.Laboratory;

public class TestQuadrate {
    public static void main(String[] args) {
        int width = 3;
        int height = 2;
        int deep = 6;

        new Quadrate();

        Quadrate quadrate2 = new Quadrate(width, height, deep);

        int result = quadrate2.calculateVolume();
        System.out.println("The quadrate volume is " + result);
    }
}
