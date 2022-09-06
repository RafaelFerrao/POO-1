public class Moto extends Automovel{
    private boolean partidaEletrica;
    
    Moto(String marca, String modelo, int qtdRodas, double potenciaDoMotor, boolean partidaEletrica){
        super(marca, modelo, qtdRodas, potenciaDoMotor);
        this.partidaEletrica = partidaEletrica;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println(partidaEletrica ? "Tem partida eletrica" : "Nao tem partida eletrica");
        System.out.println("|----------------------------------------------|");
    }

}
