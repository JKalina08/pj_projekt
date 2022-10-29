public class HraPosunSachovnici {
    static final int N_HISTORY = 255;
    private byte nx;
    private byte ny;
    private byte x;
    private byte y;

    String[] history = new String[N_HISTORY];
    private int n_tahu = 0;

    public HraPosunSachovnici(byte new_nx, byte new_ny){
        nx = new_nx;
        ny = new_ny;
        x = 1;
        y = 1;
    }

    public HraPosunSachovnici(HraPosunSachovnici old){
        nx = old.getX();
        ny = old.getY();
    }

    public boolean move(DIRECTION dir){
//        System.out.println(dir.name()); //debug
        if(can_move(dir)){
            switch(dir) {
                case up:
                    setY((byte) (this.getY()-1));
                    break;
                case down:
                    setY((byte) (this.getY()+1));
                    break;
                case left:
                    setX((byte) (this.getX()-1));
                    break;
                case right:
                    setX((byte) (this.getX()+1));
            }
            return true;
        }else{
            return false;
        }
    }

    public boolean can_move(DIRECTION dir){
        switch(dir) {
            case up:
                return can_up();
            case down:
                return can_down();
            case left:
                return can_left();
            case right:
                return can_right();
        }
        return false;
    }

    private boolean can_left(){
        if(this.getX()==1) { return false; }
        return true;
    }
    private boolean can_right(){
        if(this.getX()==this.getNX()) { return false; }
        return true;
    }
    private boolean can_up(){
        if(this.getY()==1) { return false; }
        return true;
    }
    private boolean can_down(){
        if(this.getY()==this.getNY()) { return false; }
        return true;
    }

    public byte getX() { return x; }
    public byte getY() { return y; }
    public void setX(byte new_x) {  x=new_x; }
    public void setY(byte new_y) { y=new_y; }
    public byte getNX() { return nx; }
    public byte getNY() { return ny; }


    public void draw(HraPosunSachovnici sach){
        System.out.println("x: "+this.getX()+", y: "+this.getY());

        for(byte j = 1; j <= sach.getNY(); j++){
            System.out.print("|");
            for(byte k = 1; k <= sach.getNX(); k++){
                if(sach.getX() == k && sach.getY() == j){
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }

    public void vypis_history(){
//        System.out.print("pocet tahu: "+n_tahu); //debug
        System.out.print("Historie tahu: [1,1]");
        for(int i = 0; i < n_tahu; i++){
            System.out.print(" -> " + history[i]);
        }
        System.out.println();
    }

    public void zapis_tah(DIRECTION dir){
        history[n_tahu] = dir.name();
        n_tahu++;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Object) new HraPosunSachovnici(this); //return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
}
