import java.io.IOException;

public class Main {

    private static void ukazka1() {

    }

    public static void main(String[] args) {

        KonzolovaAplikace_VstupDat konzolovaAplikace_vstupDat = new KonzolovaAplikace_VstupDat();

        // ----

        //String s1, s2, s3;

        try {
            String s1 = konzolovaAplikace_vstupDat.nacti_string_1();
            System.out.println("s1:" + s1);
        }
        catch (IOException e) {
            System.out.println("Chyba při načtení dat (IOException). " + e.getMessage());
        }

        try {
            String s2 = konzolovaAplikace_vstupDat.nacti_string_2();
            System.out.println("s1:" + s2);
        }
        catch (IOException e) {
            System.out.println("Chyba při načtení dat (IOException). " + e.getMessage());
        }

        try {
            String s3 = konzolovaAplikace_vstupDat.nacti_string_3();
            System.out.println("s1:" + s3);
        }
        catch (IOException e) {
            System.out.println("Chyba při načtení dat (IOException). " + e.getMessage());
        }

        // ---

        byte b1 = (byte)255; // int -> byte
        int c1 = b1; // byte -> int
        int c2 = (int) b1;
        System.out.println("" + b1 + " " + c1 + " " + c2);

        int c3 = 255; // int -> int
        byte b2 = (byte) c3; // int -> byte
        System.out.println("" + c3 + " " + b2);

        final char sep = '\'';
        int c4 = 1024;
        String s_c4 = Integer.toString(c4); // = String.valueOf(c4);
        System.out.println("" + c4 + " " + sep + s_c4 + sep);
        //System.out.println("" + c4 + " " + '\'' + s_c4 + '\'');

        String s_c5 = "256";
        try {
            int c5 = Integer.valueOf(s_c5);
        }
        catch (NumberFormatException e) {
            ; // ošetření chybového stavu NumberFormatException
        }

        try {
            byte b5 = Byte.valueOf(s_c5);
        }
        catch (NumberFormatException e) {
            ; // ošetření chybového stavu NumberFormatException
        }

        // ---

        Integer c6;
        int c7;

        try {
            System.out.println("" + "1:Zadej celé číslo: ");
            c6 = konzolovaAplikace_vstupDat.nacti_int();
            System.out.println("" + "1:OK");
            System.out.println("" + c6);

        }
        catch (NumberFormatException e) {
            System.out.println("" + "1:Chyba při načtení celého čísla. Zadaný textový údaj není ve formátu celého čísla nebo hodnota čísla překračuje rozsah datového typu.");
        }
        catch (IOException e) {
            System.out.println("" + "1:Chyba při načtení celého čísla. Chyba vstupně výstpní operace.");
        }

        try {
            System.out.println("" + "2:Zadej celé číslo: ");
            c7 = konzolovaAplikace_vstupDat.nacti_int();
            System.out.println("2:OK");
        }
        catch (NumberFormatException e) {
            System.out.println("" + "2:Chyba při načtení celého čísla. Zadaný textový údaj není ve formátu celého čísla nebo hodnota čísla překračuje rozsah datového typu.");
        }
        catch (IOException e) {
            System.out.println("" + "2:Chyba při načtení celého čísla. Chyba vstupně výstpní operace.");
        }

    }
}