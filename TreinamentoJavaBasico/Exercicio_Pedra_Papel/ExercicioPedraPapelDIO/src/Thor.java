import java.util.Scanner;

public class Thor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int C = leitor.nextInt(); // Lê o número de casos de teste
        String nome;
        int N;

        for (int i = 0; i < C; i++) { // Itera sobre o número de casos
            nome = leitor.next(); // Lê o nome
            N = leitor.nextInt(); // Lê a força em Newtons
            if (nome.equals("Thor")) {
                System.out.println("Y"); // Thor sempre consegue levantar o martelo
            } else {
                System.out.println("N"); // Qualquer outro nome não consegue
            }
        }
    }
}
