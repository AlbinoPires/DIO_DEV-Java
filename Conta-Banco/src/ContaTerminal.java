import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    // Dados fixos do cliente
    static final String agenciaBancaria = "067-8";
    static final int contaCorrente = 1021;
    static final String nomeCliente = "Mario Andrade";
    static final double saldo = 237.48;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("-------------------ACESSO A SUA CONTA------------------------\n");

        // Solicita dados ao usuário
        System.out.println("Por favor, digite o número da Agência (ex.: 0000): ");
        String agencia = scanner.nextLine();

        // Formata a agência para incluir o traço
        if (agencia.length() == 4) {
            agencia = agencia.substring(0, 3) + "-" + agencia.charAt(3);
        }

        System.out.println("Digite o número da conta (ex.: 0000): ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Limpa o "enter" residual

        System.out.println("Digite seu Nome completo (ex.: Xxxxx Xxxxxx): ");
        String nomeUsuario = scanner.nextLine();

        // Validação dos dados
        if (agencia.equals(agenciaBancaria) && numeroConta == contaCorrente && nomeUsuario.equalsIgnoreCase(nomeCliente)) {
            System.out.println("\nOlá Sr. " + nomeCliente + ", obrigado por validar seu cadastro.");
            System.out.println("Sua agência é " + agenciaBancaria + " e conta " + contaCorrente + ".");
            System.out.println("Seu saldo R$ " + saldo + ", já está disponível para saque.\n");
            
        // Exibe data e hora
        System.out.println(MensagemDataHoraAtual.getMensagem());

            // Menu após validação
            exibirMenu(scanner);
        } else {
            System.out.println("\nErro: Dados não encontrados no sistema. Por favor, tente novamente ou contate o suporte 0800-999-123-987.");
        }
        scanner.close();
        
    }
    public static void exibirMenu(Scanner scanner) {
        System.out.println("-------------------MENU OPÇÕES------------------------");
        System.out.println("1. Solicitar Empréstimo");
        System.out.println("2. Solicitar Saque");
        System.out.println("3. Sair");

        System.out.println("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("\nOpção de Empréstimo selecionada. (Ainda não implementado)");
                break;
            case 2:
                System.out.println("\nOpção de Visualizar Extrato selecionada. (Ainda não implementado)");
                break;
            case 3:
                System.out.println("\nObrigado por utilizar nosso sistema. Até logo!");
                break;
            default:
                System.out.println("\nOpção inválida. Tente novamente.");
        }
    }
}
