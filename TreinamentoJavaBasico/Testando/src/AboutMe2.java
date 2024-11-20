import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * Testando a execução da Classe em terminal
 * <h1>AboutMe</h1>
 * A lista recebe nomes gerados pelo usuario para teste.
 * <p>
 * <b>Note:</b> Teste via terminal executando a nossa 
 * Classe AboutMe, no contexto ela espera a entrada 
 * das informações pelo usuario para retornar algo...
 * 
 * @author  Albino Pires
 * @version 1.0
 * @since 20/11/2024
 */

public class AboutMe2 {
    public static void main(String[] args) {

        // Configurando o Scanner para usar o formato numérico dos EUA
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Solicitando a entrada do usuário - com tratamento para casos de erro na altura
        System.out.println("Digite sua altura (no formato 0.00): ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Erro: Por favor, insira a altura no formato 0.00");
            return;
        }
        double altura = scanner.nextDouble();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite seu sobrenome: ");
        String sobreNome = scanner.next();
        System.out.println("Digite sua área de atuação: ");
        String profissao = scanner.next();

        // Exibindo as entradas do usuario
        System.out.println("----------------------------------------------------");
        System.out.println("================= Seus Dados =======================");
        System.out.println("Confirmando, a sua altura é: " + altura + "mt");
        System.out.println("Confirmando, o Sr(a) tem " + idade + " anos");
        System.out.println("Confirmando seu nome e sobrenome: "+ nome + " " +sobreNome );
        System.out.println("Confirmando você é: " + profissao);
        
        // Exibindo a data atual
        Date dataAtual = new Date();
        System.out.println(dataAtual);
// Entrada de dados
scanner.close(); // Libera recursos - boas práticas tendo vista sistemas criticos

    }
}
