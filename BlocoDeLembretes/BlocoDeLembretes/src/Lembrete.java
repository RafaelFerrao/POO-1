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

    Lembrete(int d, int m, int a, String nome, String desc){
        this.data = new Data(d, m, a);
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

        return "\nData: " + d + "/" + m + "/" + data.getAno() + "\nNome: " + this.nome + "\nDescricao: " + this.desc;
    }

    

}
