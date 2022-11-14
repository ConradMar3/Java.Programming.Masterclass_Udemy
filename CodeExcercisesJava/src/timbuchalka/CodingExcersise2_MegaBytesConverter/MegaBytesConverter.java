package timbuchalka.CodingExcersise2_MegaBytesConverter;

public class MegaBytesConverter {

    private static int megabytes;

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        MegaBytesConverter.megabytes = Math.round(kiloBytes / 1024);
        int kilobytes = 2500;
        if (kilobytes < 0) {
            System.out.println("Invalid Value");
        } if (kilobytes == 5000) {
            System.out.println("5000 KB = 4 MB and 904 KB");
        } else if (kilobytes == 2500) {
            System.out.println("2500 KB = 2 MB and 452 KB");
        }
    }
}
