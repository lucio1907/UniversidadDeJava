package Fundamentals;

public class Types {
    public static void main(String[] args) {
        // int myVariable = 10;
        // System.out.println(myVariable);
        
        // myVariable = 4;
        // System.out.println(myVariable);

        String myStringVariable = "Hi!";
        System.out.println(myStringVariable);

        // Var - Inferencia de tipos en Java - Se pasan en automatico los tipos
        var newVariable = 10;
        System.out.println(newVariable);

        System.out.println("My variable " + newVariable);

        // Formas correctas de definir variables
        var myVariable = 1;
        var _myVariable = 2;
        var $myVariable = 3;

        System.out.println(myVariable + _myVariable + $myVariable);
    }    
}
