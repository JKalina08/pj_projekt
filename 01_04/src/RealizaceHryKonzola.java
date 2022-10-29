import java.io.IOException;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;

enum DIRECTION{left,right,up,down}


public class RealizaceHryKonzola {

    private static void execute(HraPosunSachovnici sach){
        DIRECTION dir = DIRECTION.right;
        boolean skip= false;
        char in = '0';

        do{
            sach.vypis_history();
            sach.draw(sach);
            try {
                in = nacti_char();
            }
            catch (IOException e) {
                System.out.println("" + "ERR:Chyba při načtení znaku. Chyba vstupně výstpní operace.");
            }
            if(in != 'u' && in != 'd' && in != 'r' && in != 'l' && in != 'k') { skip = true; } else { skip = false; }
            if(!skip){
                dir = nacti_direction(in);
                if(sach.move(dir)){
                    sach.zapis_tah(dir);
                }else{
                    System.out.println("V tomto smeru se nelze posunout");
                }
            }
        } while (in !='k');
    }

    private static DIRECTION nacti_direction(char in){
        DIRECTION dir = switch (in) {
            case 'u' -> DIRECTION.up;
            case 'd' -> DIRECTION.down;
            case 'l' -> DIRECTION.left;
            case 'r' -> DIRECTION.right;
            default -> DIRECTION.right; // random hodnota, abz prekladac nerval
        };
        return dir;
    }

    public static byte nacti_byte() throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s  = br.readLine();
            return Byte.valueOf(s);
        }
        catch (NumberFormatException e) {
            throw e;
        }
    }

    public static char nacti_char() throws IOException, NumberFormatException { // BLBOST
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
//            Scanner sc = new Scanner(System.in);
//            char c = sc.next().charAt(0);
            char c = (char) br.read();
            return c;
//        try {
//            return (char)System.in.read();
        }
        catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void main(String[] args) {
        byte nx = 0;
        byte ny = 0;

        System.out.println("=== DU 01_04 ===");

        try {       // NACTU POCET RADKU
            System.out.print("Zadej pocet sloupcu hraciho pole: ");
            nx = nacti_byte();
        }
        catch (NumberFormatException e) {
            System.out.println("" + "ERR:Chyba při načtení celého čísla. Zadaný textový údaj není ve formátu celého čísla nebo hodnota čísla překračuje rozsah datového typu.");
        }
        catch (IOException e) {
            System.out.println("" + "ERR:Chyba při načtení celého čísla. Chyba vstupně výstpní operace.");
        }
        try {       // NACTU POCET SLOUPCU
            System.out.print("Zadej pocet radku hraciho pole: ");
            ny = nacti_byte();
        }
        catch (NumberFormatException e) {
            System.out.println("" + "ERR:Chyba při načtení celého čísla. Zadaný textový údaj není ve formátu celého čísla nebo hodnota čísla překračuje rozsah datového typu.");
        }
        catch (IOException e) {
            System.out.println("" + "ERR:Chyba při načtení celého čísla. Chyba vstupně výstpní operace.");
        }

        HraPosunSachovnici sach = new HraPosunSachovnici(nx, ny);  // mam vytvorenou sachovnici o zadanych rozmerech
        execute(sach);

    }
}