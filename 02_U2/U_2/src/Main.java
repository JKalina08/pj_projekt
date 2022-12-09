public class Main {
    public static void main(String[] args) {

        Nadrz n = new Nadrz();

        n.setMax(1000);
        n.setState(165);
        n.setType(Nadrz.Type.ETHANOL);
        n.print();

        System.out.println("Odebiram 15");
        try {
            n.odebrat(15);
            n.print();
        }catch (MyException_PrazdnaNadrz e) {
            System.out.println(e.getMessage());
        }


        System.out.println("Odebiram 666");
        try {

            n.odebrat(666);
            n.print();
        }catch (MyException_PrazdnaNadrz e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Pridavam 200");
        try {
            n.pridat(200);
            n.print();
        }catch (MyException_PlnaNadrz e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Pridavam 11200");
        try {
            n.pridat(11200);
            n.print();
        }catch (MyException_PlnaNadrz e) {
            System.out.println(e.getMessage());
        }

    }
}