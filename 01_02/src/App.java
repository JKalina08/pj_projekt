public class App {

    // kalina08 - proc private metoda?
    private static void DatoveTypy(){

        byte mybyte = 0;
        short myshort = 0;
        int myint = 0;
        long mylong = 0;
        float myfloat = 0.0f;
        double mydouble  = 0.0;
        boolean mybool = false;
        char mychar = 0;
   }

    // kalina08 - proc private metoda?
    private static void PrintTypy(){
        final byte bits = 8;
        System.out.println("| Type \t\t\t\t| Size \t\t\t| Min \t\t\t\t\t\t\t| Max \t\t\t\t\t\t\t|");
        System.out.println("|---------------------------------------------------------------------------------------------------|");
        System.out.println("| byte (Byte) \t\t|  " + Byte.SIZE + " B =  " + Byte.SIZE*bits + " b \t|" + " min: " + Byte.MIN_VALUE + " \t\t\t\t\t|" + " max: " + Byte.MAX_VALUE + " \t\t\t\t\t\t|");
        System.out.println("| short (Short) \t| " + Short.SIZE + " B = " + Short.SIZE*bits + " b \t|" + " min: " + Short.MIN_VALUE + " \t\t\t\t\t|" + " max: " + Short.MAX_VALUE + " \t\t\t\t\t|");
        System.out.println("| int (Integer) \t| " + Integer.SIZE + " B = " + Integer.SIZE*bits + " b \t|" + " min: " + Integer.MIN_VALUE + " \t\t\t\t|" + " max: " + Integer.MAX_VALUE + " \t\t\t\t|");
        System.out.println("| long (Long) \t\t| " + Long.SIZE + " B = " + Long.SIZE*bits + " b \t|" + " min: " + Long.MIN_VALUE + " \t\t\t|" + " max: " + Long.MAX_VALUE + " \t\t|");
        System.out.println("| float (Float) \t| " + Float.SIZE + " B = " + Float.SIZE*bits + " b \t|" + " min: " + Float.MIN_VALUE + " \t\t\t\t\t|" + " max: " + Float.MAX_VALUE + " \t\t\t|");
        System.out.println("| double (Double) \t| " + Double.SIZE + " B = " + Double.SIZE*bits + " b \t|" + " min: " + Double.MIN_VALUE + " \t\t\t\t|" + " max: " + Double.MAX_VALUE + "\t|");
    // Zadání: U číselných datových typů bude uveden rozsah. - WTF? Vzdyt to je Min az Max. A jak mam vypsat jiny, nez ciselny typy
    }

    private static void TiskCislo(int cislo){
        System.out.println("Dekadicky tvar: " + cislo);
        System.out.println("Binarni: " + Integer.toBinaryString(cislo));
        System.out.println("Hexadecimální: " + Integer.toHexString(cislo));
        System.out.println("Osmičkový: " + Integer.toOctalString(cislo));
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("=== DU 01_02 ===");

        DatoveTypy();
        PrintTypy();

        System.out.println();
        System.out.println("6 + 4 = " + (6 + 4));
        System.out.println("\"\" + 6 + 4 = " + 6 + 4);
        System.out.println();
        TiskCislo(666);
        TiskCislo(39);
        TiskCislo(1245);
        ASCII ascii1 = new ASCII('a');
        ASCII ascii2 = new ASCII('X');
        ASCII ascii3 = new ASCII('z');
        ASCII ascii4 = new ASCII('§');
        ascii1.toASCII();
        ascii2.toASCII();
        ascii3.toASCII();
        ascii4.toASCII();

        ascii1.kompletASCII();
    }
}