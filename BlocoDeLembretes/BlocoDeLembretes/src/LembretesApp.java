import java.util.Scanner;

public class LembretesApp {
    static BlocoDeLembretes bloco = new BlocoDeLembretes();

    // LembretesApp(){
    //     this.bloco = new BlocoDeLembretes();
    // }

    public static void menu(){
        System.out.println("###################");
        System.out.println("Lembretes App - A lista contem " + bloco.numeroDeLembretes() + " lembretes.");
        System.out.println("Escolha uma das seguintes opcoes:");
        System.out.println("1- Adicionar novo lembrete");
        System.out.println("2- Remover lembrete");
        System.out.println("3- Listar");
        System.out.println("4- Busca por data");
        System.out.println("5- Busca por nome");
        System.out.println("6- Sair");
        System.out.print("Sua escolha: ");
    }

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    byte userChoice;
    do{
        menu();
        userChoice = sc.nextByte();
        System.out.println("\n###################");
        switch (userChoice) {
            case 1:
                System.out.print("Insira o nome do bilhete: ");
                String nome = "";
                nome = sc.nextLine();
                nome += sc.nextLine();
                System.out.println("Insira a data do bilhete");
                System.out.print("Dia: ");
                int dia = sc.nextInt();
                System.out.print("Mes: ");
                int mes = sc.nextInt();
                System.out.print("Ano: ");
                int ano = sc.nextInt();
                System.out.print("Insira a descricao do bilhete: ");
                String desc = "";
                desc = sc.nextLine();
                desc += sc.nextLine();
                bloco.incluirLembrete(new Lembrete(new Data(dia, mes, ano), nome, desc));
                break;
            case 2:
                System.out.print("Insira o índice do bilhete a ser removido: ");
                byte i = sc.nextByte();
                bloco.removerLembrete(i);
                break;
            case 3:
                bloco.listarLembretes();
                break;
            case 4:
                System.out.println("Insira a data que deseja buscar");
                System.out.print("Dia: ");
                dia = sc.nextInt();
                System.out.print("Mes: ");
                mes = sc.nextInt();
                System.out.print("Ano: ");
                ano = sc.nextInt();
                bloco.buscarLembretesPorData(new Data(dia, mes, ano));
                break;
            case 5:
                System.out.println("Insira o nome que deseja buscar");
                System.out.print("Nome: ");
                nome = "";
                nome = sc.nextLine();
                nome += sc.nextLine();
                System.out.println("TESTE: " + nome);
                bloco.buscarLembretesPorNome(nome);
                break;
            case 6:
                break;

            default:
                System.out.println("Erro: Valor invalido inserido. Tente novamente!");
                break;
        }
    } while( userChoice != 6);
    
    sc.close();
}


}
