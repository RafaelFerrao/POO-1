public class App {
    public static void main(String[] args) throws Exception {
        Elevador p1 = new Elevador(4, 4);
        System.out.println(p1.toString());

        p1.sobe();
        p1.sobe();
        p1.sai();
        p1.sai();
        p1.desce();
        p1.desce();
        p1.desce();
        p1.entra();
        p1.entra();
        p1.entra();
        p1.entra();
        p1.entra();
        System.out.println(p1.toString());
    }
}
