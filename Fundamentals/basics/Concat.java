package Fundamentals.basics;

public class Concat {
    public static void main(String[] args) {
        var user = "Lucio";
        var title = "Programmer";

        var concat = user + " " + title;

        System.out.println(concat);

        var i = 3;
        var j = 4;

        System.out.println(i + j);
        System.out.println(user + i + j); //? Se va a comportar como una concatenacion porque la variable "user" es un String, por lo tanto se concatena
        System.out.println(i + j + user); //? En este caso se comporta como suma porque la variable "i" es un entero
        System.out.println(user + (i + j)); //? Si separamos por parentesis se pueden hacer las 2 formas, concatenacion y cuenta
    }
}
