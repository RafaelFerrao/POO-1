public class Data {
    private int dia;
    private int mes;
    private int ano;

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    Data(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    Data(Data dt) {
        this.dia = dt.dia;
        this.mes = dt.mes;
        this.ano = dt.ano;
    }

}
