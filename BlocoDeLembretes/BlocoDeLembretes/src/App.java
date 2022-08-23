public class App {
    public static void main(String[] args) throws Exception {
        Lembrete l1 = new Lembrete(06, 10, 2022, "Aniversario", "Dia do meu aniversario");
        Lembrete l2 = new Lembrete(25, 06, 2022, "Ir ao mercado", "Comprar macas");
        Lembrete l3 = new Lembrete(30, 06, 2022, "Ir ao mercado de novo", "Comprar mais macas!");

        
        BlocoDeLembretes b1 = new BlocoDeLembretes();
        b1.incluirLembrete(l1);
        b1.incluirLembrete(l2);
        b1.incluirLembrete(l3);


        System.out.println(b1.getBlocoLembretes()[0].imprimir());
        System.out.println(b1.getBlocoLembretes()[1].imprimir());
        System.out.println(b1.getBlocoLembretes()[2].imprimir());



    }
}
