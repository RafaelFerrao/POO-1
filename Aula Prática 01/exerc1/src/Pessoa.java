public class Pessoa {
    private String nome;  
    private Data nascimento = new Data();
    private int altura;

    void setNome(String n){
        this.nome = n;
    }

    String getNome(){
        return this.nome;
    }

    public void setNascimento(String dia, String mes, String ano) {
        this.nascimento.setDia(dia);
        this.nascimento.setMes(mes);
        this.nascimento.setAno(ano);
    }

    public String getNascimento() {
        String nascimento = this.nascimento.getDia() + "/" + this.nascimento.getMes() + "/" + this.nascimento.getAno();
        return nascimento;
    }
    
    void setAltura(int alt){
        this.altura = alt;
    }

    int getAltura(){
        return this.altura;
    }

    int calculaIdade(int dia, int mes, int ano){
        int diaNasc = Integer.parseInt(this.nascimento.getDia());
        int mesNasc = Integer.parseInt(this.nascimento.getMes());
        int anoNasc = Integer.parseInt(this.nascimento.getAno());

        int idade = ano - anoNasc;

        if(mesNasc < mes || diaNasc <= dia && mesNasc == mes)
            idade++;
        
        return idade;
    }

    // void mostraDados(){
    //     System.out.println("Nome: " + this.getNome());
    //     System.out.println("Data de Nascimento: " + this.getNascimento());
    //     System.out.println("Altura: " + this.getAltura());
    //     System.out.println("Idade: "+ this.calculaIdade(9, 8, 2022));
    // }

    @Override
    public String toString(){
        return "Nome: " + this.getNome() + " | Data de Nascimento: " + this.getNascimento() + " | Altura: " + this.getAltura() + " | Idade: " + this.calculaIdade(9, 8, 2022);
    }


}
