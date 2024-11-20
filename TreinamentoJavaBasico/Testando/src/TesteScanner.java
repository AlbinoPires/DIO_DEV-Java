import java.util.Scanner;

public class TesteScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Idade informada: " + idade);
        System.out.println("Altura informada: " + altura);
    }
}
