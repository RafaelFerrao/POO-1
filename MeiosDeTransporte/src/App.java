public class App {
    public static void main(String[] args) throws Exception {
        Bicicleta b1 = new Bicicleta("Caloi", "Experta", 2, 12, true);
        Carro c1 = new Carro("Hyundai", "HB20", 4, 5500, 4);
        Moto m1 = new Moto("Honda", "Hornet", 2, 2500, true);
        Moto m2 = new Moto("Aub", "ABC", 2, 2500, true);

        CadastroDeVeiculos cad = new CadastroDeVeiculos(2);
        cad.inserir(b1);
        cad.inserir(c1);
        cad.inserir(m1);
        cad.inserir(m2);
        // System.out.println(cad.retornaItem(0));
        // System.out.println(cad.retornaItem(1));
        // System.out.println(cad.retornaItem(2));
        cad.ordena();
        cad.imprimir();


        
        // b1.acelerar(10);
        // b1.imprimir();
        // c1.imprimir();
        // m1.imprimir();
    }
}
