public class App {
    public static void main(String[] args) throws Exception {
        ControleRemoto c1 = new ControleRemoto();
        Televisao t1 = new Televisao();
        c1.setTv(t1);
        c1.trocarCanal(10);
        System.out.println(c1.toString()); 

        
        
    }
}
