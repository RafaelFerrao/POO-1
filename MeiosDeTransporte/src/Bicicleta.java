public class Bicicleta extends Veiculo{
    private int numeroDeMarchas;
    private boolean bagageiro;

    Bicicleta(String marca, String modelo, int qtdRodas, int numeroDeMarchas, boolean bagageiro) {
        super(marca, modelo, qtdRodas);
        this.numeroDeMarchas = numeroDeMarchas;
        this.bagageiro = bagageiro;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Quantidade de marcas: " + numeroDeMarchas);
        System.out.println(bagageiro ? "Tem bagageiro" : "Nao tem bagageiro");
        System.out.println("|----------------------------------------------|");
    }


}
