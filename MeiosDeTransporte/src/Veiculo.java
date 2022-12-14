public class Veiculo {
    private String marca;
    private String modelo;
    private int qtdRodas;
    private int velocidade;

    Veiculo(String marca, String modelo, int qtdRodas){
        this.marca = marca;
        this.modelo = modelo;
        this.qtdRodas = qtdRodas;
        this.velocidade = 0;
    }

    public void imprimir(){
        System.out.println("|----------------------------------------------|");
        System.out.println("Marca: " + marca + "| Modelo: " + modelo);
        System.out.println("Quantidade de rodas: " + qtdRodas);
        System.out.println("Velocidade: " + velocidade);
        System.out.println("|----------------------------------------------|");
    }

    public void acelerar(int valor) {
        this.velocidade += valor;
    }

    public void frear(int valor) {
        this.velocidade -= valor;
    }

    public String getModelo(){
        return this.modelo;
    }


}
