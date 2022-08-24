public class BlocoDeLembretes {
    private Lembrete[] blocoLembretes;
    private int nLembretes;
    private int size;

    BlocoDeLembretes() {
        this.size = 3;
        this.blocoLembretes = new Lembrete[size];
        nLembretes = 0;
    }

    public Lembrete[] getBlocoLembretes() {
        return blocoLembretes;
    }

    public void incluirLembrete(Lembrete l) {
        if (this.nLembretes < this.blocoLembretes.length) {
            this.blocoLembretes[this.nLembretes] = l;
        } else {
            Lembrete novoBloco[] = new Lembrete[this.blocoLembretes.length * 2];
            for (int i = 0; i < this.blocoLembretes.length; i++)
                novoBloco[i] = this.blocoLembretes[i];
            this.blocoLembretes = novoBloco;
            this.blocoLembretes[this.nLembretes] = l;
        }
        this.nLembretes++;
    }

    public int numeroDeLembretes() {
        return this.nLembretes;
    }

    public void removerLembrete(int n) {
        if (n > this.nLembretes - 1 || n < 0)
            System.out.println("Erro: o indice acessado nao eh valido");
        else {
            if (this.nLembretes - n - 1 > 0) {
                int i;
                for (i = 0; i < this.nLembretes - n - 1; i++) {
                    this.blocoLembretes[n + i] = this.blocoLembretes[n + i + 1];
                }
                this.blocoLembretes[n + i] = null;
            } else {
                this.blocoLembretes[n] = null;
            }
            nLembretes--;
        }
    }

    public void listarLembretes() {
        for (int i = 0; i < this.nLembretes; i++)
            System.out.println(blocoLembretes[i].imprimir());
    }

    public void buscarLembretesPorData(Data dt) {
        for (int i = 0; i < this.nLembretes; i++)
            if (this.blocoLembretes[i].getData().dataEhIgual(dt))
                System.out.println(blocoLembretes[i].imprimir());
    }

    public void buscarLembretesPorNome(String n) {
        for (int i = 0; i < this.nLembretes; i++)
            if (this.blocoLembretes[i].nomeEhIgual(n))
                System.out.println(blocoLembretes[i].imprimir());
    }

}
