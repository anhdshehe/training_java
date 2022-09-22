public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upper_range = 35;
        int lower_range = 25;
        if (summer) {
            upper_range = 45;
        }

        return (temperature >= lower_range) && (temperature <= upper_range);
    }
}
