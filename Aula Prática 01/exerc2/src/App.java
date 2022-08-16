public class App {
    public static void main(String[] args) throws Exception {
        Elevador p1 = new Elevador();
        p1.inicializa(0, 3, 0, 2);
        System.out.println(p1.toString());

        p1.sobe();
        p1.sobe();
        p1.sai();
        p1.sai();
        p1.desce();
        p1.desce();
        p1.desce();
        System.out.println(p1.toString());
    }
}
