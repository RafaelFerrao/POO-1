import java.time.LocalDate;

public class Pessoa {
    private String nome;  
    private Data nascimento;
    private int altura;

    Pessoa(String n, int d, int m, int a, int altura){
        this.nome = n;
        this.nascimento = new Data(d, m, a);
        this.altura = altura;
    }

    Pessoa(Pessoa p){
        this.nome = p.nome;
        this.nascimento = p.nascimento;
        this.altura = p.altura;
    }

    String getNome(){
        return this.nome;
    }

    public String getNascimento() {
        String nascimento = this.nascimento.getDia() + "/" + this.nascimento.getMes() + "/" + this.nascimento.getAno();
        return nascimento;
    }

    int getAltura(){
        return this.altura;
    }

    int calculaIdade(){
        LocalDate dataAtual = LocalDate.now();

        int ano = dataAtual.getYear();
        int mes = dataAtual.getMonthValue();
        int dia = dataAtual.getDayOfMonth();

        int idade = ano - this.nascimento.getAno();

        if(this.nascimento.getMes() < mes || this.nascimento.getDia() <= dia && this.nascimento.getMes() == mes)
            idade++;
        
        return idade;
    }

    @Override
    public String toString(){
        return "Nome: " + this.getNome() + " | Data de Nascimento: " + this.getNascimento() + " | Altura: " + this.getAltura() + " | Idade: " + this.calculaIdade();
    }


}
