import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NacteniHodnot {

    private static BufferedReader br = null;//= new BufferedReader(new InputStreamReader(System.in));

    public NacteniHodnot() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    // ========== SHORT =================================================================
    public static Short nacti_short() throws IOException, NumberFormatException {
        try {
            String s = br.readLine();
            try{
                return Short.valueOf(s);
            } catch (NumberFormatException e){
                System.out.println(e.getMessage() + " Min: " + Short.MIN_VALUE + " Max: " + Short.MAX_VALUE);
                throw e;
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
            throw e;
        }
    }

    // ========== INTEGER =================================================================
    public static Integer nacti_int() throws IOException, NumberFormatException {
        try {
            String s = br.readLine();
            try{
                return Integer.valueOf(s);
            } catch (NumberFormatException e){
                System.out.println(e.getMessage() + " Min: " + Integer.MIN_VALUE + " Max: " + Integer.MAX_VALUE);
                throw e;
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
            throw e;
        }
    }

    // ========== FLOAT =================================================================
    public static Float nacti_float() throws IOException, NumberFormatException {
        try {
            String s = br.readLine();
            try{
                return Float.valueOf(s);
            } catch (NumberFormatException e){
                System.out.println(e.getMessage() + " Min: " + Float.MIN_VALUE + " Max: " + Float.MAX_VALUE);
                throw e;
            }

        } catch (IOException e){
            System.out.println(e.getMessage());
            throw e;
        }
    }

    // ========== DOUBLE =================================================================
    public static Double nacti_double() throws IOException, NumberFormatException {
        try {
            String s = br.readLine();
            try{
                return Double.valueOf(s);
            } catch (NumberFormatException e){
                System.out.println(e.getMessage() + " Min: " + Double.MIN_VALUE + " Max: " + Double.MAX_VALUE);
                throw e;
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
            throw e;
        }
    }

    // ========== STRING =================================================================
    public static String nacti_string() throws IOException
    {
        try {
            return br.readLine();
        }
        catch (IOException e) {
            throw e;
        }
    }

    // ========== CHAR =================================================================
    public static Character nacti_char() throws IOException
    {
        try {
            return (char) System.in.read();
        }
        catch (IOException e) {
            throw e;
        }
    }
}
