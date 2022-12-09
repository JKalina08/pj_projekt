

public class Nadrz {


    int max;
    int state;
    enum Type{BENZIN, NAFTA, ETHANOL, WASSER};
    Type type;

    public Nadrz(){
        max = 0;
        state = 0;
        type = Type.WASSER;
    }

    public Nadrz(int m, int s, Type t) {
        max = m;
        state = s;
        type = t;
    }

    public void setMax(int m) {
        max = m;
    }

    public void setState(int s){
        state  = s;
    }

    public void setType(Type t){
        type = t;
    }

    public int getMax(){
        return max;
    }

    public int getState(){
        return state;
    }

    public Type getType(){
        return type;
    }


    public double naplneni(){
        return (double)state/max;
    }

    public void print(){

        String out = getState() + "/" + getMax() + "("+ naplneni()*100  +"%),"+getType();
        System.out.println(out);
    }


    public void pridat(int x) throws MyException_PlnaNadrz{
        if((x+state) > max) throw new MyException_PlnaNadrz("Nadrz je prilis plna pro pridani");
        else{
            setState(getState()+x);
        }
    }

    public void odebrat(int x) throws MyException_PrazdnaNadrz{
        if((state - x) < 0) throw new MyException_PrazdnaNadrz("Nadrz je moc prazdna na odebrani");
        else{
            setState(getState()-x);
        }
    }

}

