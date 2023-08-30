package Fundamentals.Arrays.test;

public class TestArrays {
    public static void main(String[] args) {
        int ages[] = new int[3];
        ages[0] = 10;
        ages[1] = 20;
        ages[2] = 22;
        
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
    }
}
