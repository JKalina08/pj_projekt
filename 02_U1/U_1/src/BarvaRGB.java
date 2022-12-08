public class BarvaRGB {
    byte r; // -128 .. 127
    byte g;
    byte b;
    float intens;

    public BarvaRGB(){
        r = -128;
        g = -128;
        b = -128;
        intens = (float)0.0;
    }
    public BarvaRGB(int n_r, int n_g, int n_b) throws Exception{
        if (n_r<0 || n_r >255 || n_g<0 || n_g >255 || n_b<0 || n_b >255) {
            throw new Exception("ERROR: Out of color range 0 .. 255");
        }
        r = (byte)(n_r-128);
        g = (byte)(n_g-128);
        b = (byte)(n_b-128);
        intens = (float)(r +g + b)/3;
    }

    public void setR(int n_r) throws Exception{
        if (n_r<0 || n_r >255) {
            throw new Exception("ERROR: Out of color range 0 .. 255");
        }
        r = (byte)(n_r-128);
    }

    public void setG(int n_g) throws Exception{
        if (n_g<0 || n_g >255) {
            throw new Exception("ERROR: Out of color range 0 .. 255");
        }
        g  = (byte)(n_g-128);
    }

    public void setB(int n_b) throws Exception{
        if (n_b<0 || n_b >255) {
            throw new Exception("ERROR: Out of color range 0 .. 255");
        }
        b  = (byte)(n_b-128);
    }

    public void setColor(int red, int green, int blue){
        try{
            setR(red);
            setG(green);
            setB(blue);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.print(e.getMessage());
        }
        return;
    }

    public byte getR(){
        return r;
    }

    public byte getG(){
        return g;
    }

    public byte getB(){
        return b;
    }

    public float getIntens(){
        return intens;
    }

    public void print(){
        String r_rhx = Integer.toHexString((int)r+128);
        String g_rhx = Integer.toHexString((int)g+128);
        String b_rhx = Integer.toHexString((int)b+128);

        if(r_rhx.length()==1) r_rhx = '0'+ r_rhx;
        if(g_rhx.length()==1) g_rhx = '0'+ g_rhx;
        if(b_rhx.length()==1) b_rhx = '0'+ b_rhx;

        System.out.println("r:"+r_rhx+";g:"+g_rhx+";b:"+b_rhx);
    }
    public void print2(){
        String r_rhx = Integer.toHexString((int)r+128);
        String g_rhx = Integer.toHexString((int)g+128);
        String b_rhx = Integer.toHexString((int)b+128);

        int a = 2;

        if(r_rhx.length()==1) r_rhx = '0'+ r_rhx;
        if(g_rhx.length()==1) g_rhx = '0'+ g_rhx;
        if(b_rhx.length()==1) b_rhx = '0'+ b_rhx;

        System.out.println("#"+r_rhx+g_rhx+b_rhx);
    }
}
