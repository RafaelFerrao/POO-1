public class BlocoDeLembretes {
    private Lembrete[] blocoLembretes = new Lembrete[10];
    private int nLembretes = 0;

    public Lembrete[] getBlocoLembretes() {
        return blocoLembretes;
    }

    public void incluirLembrete(Lembrete l){
        if(this.nLembretes < 10){
            this.blocoLembretes[this.nLembretes] = l;
            this.nLembretes++;
        } else {
            System.out.println("Erro: numero maximo de lembretes atingido nesse bloco");
        }
    }

    public int numeroDeLembretes(){
        return this.nLembretes;
    }

    public void removerLembrete(int n){ // 10 | 9 | 
        if(n != numeroDeLembretes()){
            for(int i = 0; i < numeroDeLembretes() - n ; i++){ // 10 - 9 = 1
                this.blocoLembretes[n+i] = this.blocoLembretes[n+1+i];
            }
        } else {
            this.blocoLembretes[n] = null;
        }
        
        nLembretes--;

    }







}
