public class ASCII {
    private char c;

    public ASCII(){
        c = (char)0;
    }

    public ASCII(char c){
        setC(c);
    }

    public void setC(char c){
        this.c = c;
    }

    public void toASCII(){
        System.out.println(toASCIIdec(c));
        System.out.println(toASCIIhex(c));
    }

    private static String toASCIIdec(char c){
        String str;
        str = c +" decimalne: " + (int)c;
        return str;

    }

    private static String toASCIIhex(char c){
        return c + " hexadecimalne: " + Integer.toHexString((int)c);
    }

    public static void kompletASCII(){
        System.out.println();
        System.out.println("|Kompletni tabulka pisem a cislic s ASCII kodem |");
        System.out.println("|-----------------------------------------------|");
        int delta = (int)'A' - (int)'a';
        int i = (int)'a';
        do{
            System.out.println("| " + toASCIIdec((char)i) + "\t\t| " + toASCIIdec((char)(i+delta)) + "\t\t|");
            i++;
        }while( i <= (int)'z');
        i = (int)'0';
        do{
            System.out.println("| " + toASCIIdec((char)i) + "\t\t\t\t\t\t\t\t|");
            i++;
        }while( i <= (int)'9');

    }

}
