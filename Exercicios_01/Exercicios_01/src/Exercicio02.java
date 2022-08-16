public class Exercicio02 {
    public static void main(String[] args) {
        double peso = 29;
        if (peso < 20)
            System.out.println("Magro");
        else if (peso < 25)
            System.out.println("Normal");
        else if (peso < 29)
            System.out.println("Acima do peso");
        else if (peso < 30)
            System.out.println("Obeso");
        else
            System.out.println("Muito obeso");
    };
}
