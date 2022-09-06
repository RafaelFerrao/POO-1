public class Carro extends Automovel{
    private int qtdPortas;
    
    Carro(String marca, String modelo, int qtdRodas, double potenciaDoMotor, int qtdPortas){
        super(marca, modelo, qtdRodas, potenciaDoMotor);
        this.qtdPortas = qtdPortas;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Quantidade de portas: " + qtdPortas);
        System.out.println("|----------------------------------------------|");
    }

}
