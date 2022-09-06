public class App {
    public static void main(String[] args) throws Exception {
        Bicicleta b1 = new Bicicleta("Caloi", "Experta", 2, 12, true);
        Carro c1 = new Carro("Hyundai", "HB20", 4, 5500, 4);
        Moto m1 = new Moto("Honda", "Hornet", 2, 2500, true);
        b1.acelerar(10);
        b1.imprimir();
        c1.imprimir();
        m1.imprimir();
    }
}
