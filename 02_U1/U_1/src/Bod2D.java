public class Bod2D {
    private double x;
    private double y;


    public Bod2D(){
        x = 0;
        y = 0;
    }

    public Bod2D(double n_x, double n_y){
        x = n_x;
        y = n_y;
    }

    public void setCoord(double n_x, double n_y){
        x = n_x;
        y = n_y;
        return;
    }

    public void setX(double n_x){
        x = n_x;
        return;
    }

    public void setY(double n_y){
        y = n_y;
        return;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void print(){
        System.out.print("["+x+";"+y+"]");

    }
}
