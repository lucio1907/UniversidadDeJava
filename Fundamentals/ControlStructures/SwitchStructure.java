package Fundamentals.ControlStructures;

public class SwitchStructure {
    public static void main(String[] args) {
        int number = 2;
        String numberText = "Unknow value";

        switch(number) {
            case 1:
                numberText = "Number one";
                break;
            case 2:
                numberText = "Number two";
                break;
            case 3:
                numberText = "Number three";
                break;
            case 4: 
                numberText = "Number four";
                break;
            default: 
                numberText = "Case not found";
        }

        System.out.println(numberText);
    }
}
