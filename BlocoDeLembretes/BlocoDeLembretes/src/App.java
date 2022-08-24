public class App {
    public static void main(String[] args) throws Exception {
        Lembrete l1 = new Lembrete(new Data(6,10,2022), "Aniversario", "Dia do meu aniversario");
        Lembrete l2 = new Lembrete(new Data(25, 06, 2022), "Ir ao mercado", "Comprar macas");
        Lembrete l3 = new Lembrete(new Data(30, 06, 2022), "Ir ao mercado de novo", "Comprar mais macas!");
        Lembrete l4 = new Lembrete(new Data(2, 7, 2022), "Pagar academia", "Projeto verao");
        Lembrete l5 = new Lembrete(new Data(9, 7, 2022), "TESTE", "Projeto teste");

        
        BlocoDeLembretes b1 = new BlocoDeLembretes();
        b1.incluirLembrete(l1);
        b1.incluirLembrete(l2);
        b1.incluirLembrete(l3);
        b1.incluirLembrete(l4);
        b1.incluirLembrete(l5);

        b1.removerLembrete(1);

        // b1.listarLembretes();

        // b1.buscarLembretesPorData(new Data(6,10,2022));
        b1.buscarLembretesPorNome("Pagar academia");

    }
}
