public class Elevador {
    private int andarAtual = 0;
    private int quantAndares;
    private int capacidade;
    private int quantPessoasIn = 0;

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }
    public int getAndarAtual() {
        return andarAtual;
    }

    public void setQuantAndares(int quantAndares) {
        this.quantAndares = quantAndares;
    }
    public int getQuantAndares() {
        return quantAndares;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public int getCapacidade() {
        return capacidade;
    }
    public void setQuantPessoasIn(int quantPessoasIn) {
        this.quantPessoasIn = quantPessoasIn;
    }
    public int getQuantPessoasIn() {
        return quantPessoasIn;
    }

    public void inicializa(int andarAtual, int quantAndares, int quantPessoasIn, int capacidade){
        setAndarAtual(andarAtual);
        setQuantAndares(quantAndares);
        setQuantPessoasIn(quantPessoasIn);
        setCapacidade(capacidade);
    }

    @Override
    public String toString(){
        return "Andar atual: " + this.andarAtual + " | Quantidade de Andares : " + this.quantAndares + " | Quantidade de pessoas dentro: " + this.quantPessoasIn + " | Capacidade: " + this.capacidade;
    }

    public void entra() {
            if(this.quantPessoasIn + 1 <= this.capacidade)
                this.quantPessoasIn++;
            else
                System.out.println("Erro: o elevador esta cheio");
    }

    public void sobe() {
        if(this.andarAtual + 1 <= quantAndares - 1)
            this.andarAtual++;
        else
            System.out.println("Erro: impossivel subir mais");
    }

    public void desce() {
        if(this.andarAtual > 0)
            this.andarAtual--;
        else
            System.out.println("Erro: impossivel descer mais");
    }

    public void sai(){
        if(this.quantPessoasIn > 0)
            this.quantPessoasIn--;
        else
            System.out.println("Erro: o elevador ja esta vazio");
    }


}
