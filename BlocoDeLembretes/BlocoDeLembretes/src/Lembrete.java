public class Lembrete {
    private Data data;
    private String nome;
    private String desc;

    public Data getData() {
        return data;
    }

    public String getNome() {
        return nome;
    }

    public String getDesc() {
        return desc;
    }

    Lembrete(Data data, String nome, String desc){
        this.data = new Data(data);
        this.nome = nome;
        this.desc = desc;


    }
    
    public String imprimir(){
        String d;
        String m;

        if(data.getDia() < 10)
            d = "0" + data.getDia();
        else
            d = "" + data.getDia();
        
        if(data.getMes() < 10)
            m = "0" + data.getMes();
        else
            m = "" + data.getMes();

        return "\nNome: " + this.nome + "\nData: " + d + "/" + m + "/" + data.getAno() + "\nDescricao: " + this.desc;
    }

    public boolean nomeEhIgual(String n){
        if(this.nome.equals(n))
            return true;
        else
            return false;
    }

    

}
