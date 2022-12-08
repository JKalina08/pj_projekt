public class Bod2Db {
    private float x;
    private float y;


    public Bod2Db(){
        x = 0;
        y = 0;
    }

    private Bod2Db(float n_x, float n_y){
        x = n_x;
        y = n_y;
    }

    private void setCoord(float n_x, float n_y){
        x = n_x;
        y = n_y;
        return;
    }

    private void setX(float n_x){
        x = n_x;
        return;
    }

    private void setY(float n_y){
        y = n_y;
        return;
    }

    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }

    public void print(){
        System.out.print("["+x+";"+y+"]");

    }
}
