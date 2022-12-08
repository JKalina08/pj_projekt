public class Bod2D_Extend extends Bod2D{
    BarvaRGB barva;

    public Bod2D_Extend(){
        super();
        barva = new BarvaRGB();
    }

    public Bod2D_Extend(double n_x, double n_y){
        super(n_x,n_y);
        barva = new BarvaRGB();
    }

    @Override public void print(){
        super.print();
        System.out.print(":");
        barva.print2();
    }

    public void move(double dx, double dy){
        setCoord(dx,dy);
    }


    public void setColor(int red, int green, int blue){
        barva.setColor(red, green, blue);
    }


}
