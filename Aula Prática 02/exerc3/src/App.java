public class App {
    public static void main(String[] args) throws Exception {
        Televisao t1 = new Televisao(0, 0);
        ControleRemoto c1 = new ControleRemoto(t1);
        c1.trocarCanal(10);
        System.out.println(c1.toString()); 

        
        
    }
}
