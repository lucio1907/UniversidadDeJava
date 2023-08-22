package Fundamentals;
/**
 * SpecialChars
 */
public class SpecialChars {
    public static void main(String[] args) {
        var name = "Lucio";

        // ? Salto de linea
        System.out.println("New line: \n" + name);
        // ? Tabulador
        System.out.println("Tabulator: \t" + name);
        // ? Retroseso
        System.out.println("Return: \b" + name);
        // ? Comilla simple
        System.out.println("Comilla simple: \'" + name + "\'");
        System.out.println("Comilla doble: \"" + name + "\"");
    }
}