import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KonzolovaAplikace_VstupDat {

    private BufferedReader br = null;//= new BufferedReader(new InputStreamReader(System.in));

    public KonzolovaAplikace_VstupDat() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    // ----

    public String nacti_string_1() throws IOException {
        return br.readLine();//return System.console().readLine();
    }

    public String nacti_string_2() throws IOException {
        byte[] str = new byte[255];
        System.in.read(str); // !!! //System.in.read(str, 0, 255);
        return str.toString();
    }

    public String nacti_string_3() throws IOException
    {
        try {
            final byte SIZE = (byte)255;
            int[] str = new int[SIZE];
            int n = 0;

            do {
                str[n] = System.in.read();
                n++;
            } while ((str[n-1] != '\n') && (n < SIZE));

            return str.toString();
        }
        catch (IOException e) {
            throw e;
        }
    }

    public Integer nacti_int() throws IOException, NumberFormatException {
        try {
            String s = nacti_string_1(); //br.readLine(); //System.console().readLine();
            Integer c = Integer.valueOf(s);
            return c;
        }
        catch (NumberFormatException e) {
            throw e;
        }
    }
}
