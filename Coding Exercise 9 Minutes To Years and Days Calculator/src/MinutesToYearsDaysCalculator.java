public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0 ){
            System.out.println("Invalid Value");
            return;
        }
        int year = (int) (minutes / (24 * 60 * 365));
        int minutes_left = (int) (minutes % (24 * 60 * 365));
        int day = (int) (minutes_left / (24 * 60));
        System.out.printf(minutes + " min = " + year + " y and " + day + " d");
    }
}
