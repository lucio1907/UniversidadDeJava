package Fundamentals.Classes.PasoPorValor;

public class Example {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);

        valueChange(x);
        System.out.println(x); // La variable local no se modifica, se modifica solo en el metodo
    }   
    
    public static int valueChange(int arg1) {
        System.out.println(arg1);
        arg1 = 15;
        return arg1;
    }
}