package Fundamentals.ControlStructures;

public class Season {
    public static void main(String[] args) {
        int month = 1;
        String season = "Unknow season";

        if (month == 1 || month == 2 || month == 12) {
            season = "Winter";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "Spring";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "Summer";
        } else if (month == 9 || month == 10 || month == 11) {
            season = "autumn";
        } 
        System.out.println(season);
    }
}
