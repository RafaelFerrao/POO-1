public class App {
    public static void main(String[] args) throws Exception {
        Bicicleta b1 = new Bicicleta("Caloi", "Experta", 2, 12, true);
        b1.acelerar(10);
        b1.imprimir();
    }
}
