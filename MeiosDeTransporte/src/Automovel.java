public class Automovel extends Veiculo{
    private double potenciaDoMotor;

    Automovel(String marca, String modelo, int qtdRodas, double potenciaDoMotor) {
        super(marca, modelo, qtdRodas);
        this.potenciaDoMotor = potenciaDoMotor;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Potencia do motor: " + potenciaDoMotor);
        System.out.println("|----------------------------------------------|");
    }


}
