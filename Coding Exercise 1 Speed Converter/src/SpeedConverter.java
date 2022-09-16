public class SpeedConverter {
    public static long toMilesPerHour (double kilometersPerHour){
        if (kilometersPerHour < 0) {
            return -1;
        }

        long result = Math.round (kilometersPerHour / 1.609);
        return result;
    }

    public static void printConversion(double kilometersPerHour) {
        long output = SpeedConverter.toMilesPerHour(kilometersPerHour);
        if (output == -1) {
            System.out.println("Invalid Value");
            return;
        }

        System.out.println(kilometersPerHour + " km/h = " + output + " mi/h");
    }
}
