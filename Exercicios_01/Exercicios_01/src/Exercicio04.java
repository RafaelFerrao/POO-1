public class Exercicio04 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 0, menor = a;
        if (menor > b)
            menor = b;
        else if (menor > c)
            menor = c;

        System.out.println("Menor numero: " + menor);

        System.out.println("Numeros positivos: ");
        if (a > 0)
            System.out.println(a);
        if (b > 0)
            System.out.println(b);
        if (c > 0)
            System.out.println(c);
    };
}
