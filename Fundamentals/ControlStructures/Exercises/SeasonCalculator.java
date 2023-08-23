package Fundamentals.ControlStructures.Exercises;

public class SeasonCalculator {
    public static void main(String[] args) {
        int month = 7;
        String season = "Unknow season";

        switch (month) {
            case 1: case 2: case 12:
                season = "Summer";
                break;
            case 3: case 4: case 5:
                season = "Autumn";
                break;
            case 6: case 7: case 8:
                season = "Winter";
                break;
            case 9: case 10: case 11:
                season = "Spring";
                break;
            default:
                season = "Season not found";
        }

        System.out.println(season);
    }
}
