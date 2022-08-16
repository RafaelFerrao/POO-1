public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa();
        p1.setNome("Rafael Ferrao");
        p1.setAltura(180);
        p1.setNascimento("06", "10", "2001");

        System.out.println(p1.toString());
    }
}
