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

    private void setAno(int ano) {
        if(ano > 0)
            this.ano = ano;
        else
            this.ano = 1;
    }

    private void setMes(int mes) {
        if(mes > 0 && mes <= 12)
            this.mes = mes;
        else
            this.mes = 1;
    }

    private void setDia(int dia) {
        if(dia > 0 && dia <= 31)
            this.dia = dia;
        else
            this.dia = 1;
    }

    Data(int d, int m, int a) {
        setAno(a);
        setMes(m);
        setDia(d);
    }

    Data(Data dt) {
        this.dia = dt.dia;
        this.mes = dt.mes;
        this.ano = dt.ano;
    }

}
