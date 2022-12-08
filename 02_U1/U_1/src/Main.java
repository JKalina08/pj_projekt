import java.io.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bod 1: 0.5, 11,5");
        Bod2D b1 = new Bod2D(0.5, 11.5);
        b1.print();
        System.out.println();
        System.out.println("Bod 2: bez coordinatu");
        Bod2D b2 = new Bod2D();
        b2.print();
        System.out.println();
        System.out.println("Juchuuu");


        String str;
        int red_i = 255; // 0 .. 255
        int green_i = 255;
        int blue_i = 255;


        try{
            BarvaRGB b = new BarvaRGB(red_i, green_i, blue_i);
            b.print();
            b.print2();

            b.setColor(129,200,1);
            b.print();
            b.print2();


        } catch (Exception e) {

            System.out.print(e.getMessage());
        }
        try{
        Bod2D_Extend be = new Bod2D_Extend();
        be.print();

        be.move(666.4,-158.2);
        be.print();

        be.setColor(158,229,55);
        be.print();
        } catch (Exception e) {

            System.out.print(e.getMessage());
        }

        try{
            Bod2D_Extend be = new Bod2D_Extend();
            be.print();

            be.setColor(55555,-2229,00);
        } catch (Exception e) {

            System.out.print(e.getMessage());
        }


        return;
    }
}