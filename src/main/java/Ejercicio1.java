public class Ejercicio1 {
    public static final int DAYS_IN_YEAR = 365;
    public static final int HOURS_IN_DAY = 24;
    public static final int MINUTES_IN_HOUR = 60;
    public static final int SECONDS_IN_MINUTE = 60;

    public static void main(String[] args) {
        int years = 1;
        int months = 12;
        int days = 30;
        int totalSeconds = calculateSeconds(years, months, days);
        System.out.println("Total seconds: " + totalSeconds);
    }

    public static int calculateSeconds(int years, int months, int days) {
        int totalDays = years * DAYS_IN_YEAR + months * days;
        int totalHours = totalDays * HOURS_IN_DAY;
        int totalMinutes = totalHours * MINUTES_IN_HOUR;
        return totalMinutes * SECONDS_IN_MINUTE;
    }
}