public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBites){
        if (kiloBites < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int megaBytes = kiloBites / 1024;
        int remainsBytes = kiloBites % 1024;
        System.out.println(kiloBites + " KB = " + megaBytes + " MB and " + remainsBytes + " KB");
    }
}
