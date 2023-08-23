package Fundamentals.Classes.Laboratory;

// Volumen formula = width * height * deep

public class Quadrate {
    int width;
    int height;
    int deep;

    public Quadrate() {
        System.out.println("Executing program!");
    }

    public Quadrate(int width, int height, int deep) {
        this.width = width;
        this.height = height;
        this.deep = deep;
    }

    public int calculateVolume() {
        int result = this.width * this.height * this.deep;
        return result;
    }


}
