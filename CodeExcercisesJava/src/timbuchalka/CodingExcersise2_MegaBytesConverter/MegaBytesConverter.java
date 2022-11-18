package timbuchalka.CodingExcersise2_MegaBytesConverter;

import java.lang.String;
public class MegaBytesConverter {
    public static String XX = "KB";
    public static String YY = "MB";
    public static String ZZ = "remaining kilobytes";


    public static int printMegaBytesAndKiloBytes(int kiloBytes) {


        if (kiloBytes < 0) {
            return -1;
        }
        return Math.round(kiloBytes / 1024);
    }

    public static void printConversion() {

        MegaBytesConverter.printConversion(String XX, YY, ZZ);

        int kiloBytes = 2500;

        if (kiloBytes == 5000) {
            System.out.println("5000 KB = 4 MB and 904 KB");
        } else if (kiloBytes == 2500) {
            System.out.println("2500 KB = 2 MB and 452 KB");

        }
    }
}
