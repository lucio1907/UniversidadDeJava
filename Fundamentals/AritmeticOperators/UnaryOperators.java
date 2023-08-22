package Fundamentals.AritmeticOperators;

public class UnaryOperators {
    public static void main(String[] args) {
        // Para enteros
        int a = 3;
        int b = -a;

        System.out.println(a);
        System.out.println(b);

        // Para booleanos
        boolean c = true;
        boolean d = !c;
        System.out.println(d);

        // Incremetno
        // 1.Preincremento (simbolo antes de la variable)
        int e = 3;
        int f = ++e; // Primero se incrementa la variable y luego se usa su valor
        System.out.println(e);
        System.out.println(f);
        
        // 2.Postincremento (simbolo despues de la variable)
        int g = 5;
        int h = g++; // Primero se utiliza el valor y luego se incrementa

        System.out.println(g);
        System.out.println(h);

        // Decremento
        // 1.Predecremento
        int i = 2;
        int j = --i;

        System.out.println(i); // Ya esta decementada
        System.out.println(j);

        // 2.Postdecremento
        int k = 4;
        int l = k--;

        System.out.println(k);
        System.out.println(l); // Primero se usa el valor de la variable y queda pendiente decremento
    }
}
