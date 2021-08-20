public class LeapYearCalculator {

    public static boolean isLeapYear(int year){
        if (year < 1) return false;
        if (year > 9999) return false;
        if (year % 4 == 0) return true;
        else if (year % 100 == 0) return true;
        else if (year % 400 == 0) return true;
        else return false;
    }
}
