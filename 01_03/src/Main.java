import java.io.IOException;

public class Main {

    private static void ukazka1() {

    }

    public static void main(String[] args) {

         Short sh;
         Integer i;
         Float f;
         Double d;
         String s;
         Character c;

         NacteniHodnot in = new NacteniHodnot();

        // Short
        try{
            System.out.println("Zadej short:");
            sh = in.nacti_short();
            System.out.println("Short: " + sh);
        } catch  (Exception e){
           // System.out.println("ERROR: vstup");
        }

        // Integer
        try{
            System.out.println("Zadej integer:");
            i = in.nacti_int();
            System.out.println("Integer: " + i);
        } catch  (Exception e){
            //System.out.println("ERROR: vstup");
        }

        // Double
        try{
            System.out.println("Zadej double:");
            d = in.nacti_double();
            System.out.println("Double: " + d);
        } catch  (Exception e){
            //System.out.println("ERROR: vstup");
        }

        //String
        try {
            System.out.println("Zadej nejaky retezec:");
            s = in.nacti_string();
            System.out.println("Retezec:" + s);
        }
        catch (IOException e) {
            //System.out.println("ERROR: vstup");
        }

        //Char
        try {
            System.out.println("Zadej nejaky znak:");
            c = in.nacti_char();
            System.out.println("Znak:" + c);
        }
        catch (IOException e) {
            //System.out.println("ERROR: vstup");
        }

    }
}