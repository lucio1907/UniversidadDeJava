package Fundamentals;

public class PrimitiveTypes {
    public static void main(String[] args) {
        /*
         * Tipos primitivos enteros: byte, short, int, long
         */

        byte byteNumber = 10;
        System.out.println(byteNumber);
        System.out.println("Minimum value byte:" + Byte.MIN_VALUE);
        System.out.println("Maximum value byte:" + Byte.MAX_VALUE);

        short shortNumber = 10;
        System.out.println("\nShortnumber = " + shortNumber);
        System.out.println("Minimum value short: " + Short.MIN_VALUE);
        System.out.println("Maximum value short: " + Short.MAX_VALUE);

        int numberInt = (int) 21474836472L; // Literal de tipo long "L"
        System.out.println("\nnumberInt = " + numberInt);
        System.out.println("Minimum value int: " + Integer.MIN_VALUE);
        System.out.println("Maximum value int: " + Integer.MAX_VALUE);
        
        long numberLong = 9223372036854775807L;
        System.out.println("\nnumberLong = " + numberLong);
        System.out.println("Minimum value long: " + Long.MIN_VALUE);
        System.out.println("Maximum value long: " + Long.MAX_VALUE);
    }
}
