import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class TestandoScannerEmFamilia2024 {
    public static void main(String[] args) {

        // Configurando o Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Criando uma lista de familiares
        List<String> familiares = new ArrayList<>();
        familiares.add("Albino FP - Espirito de equipe, pelo o todo!!!");
        familiares.add("Megera FP - Adora um Doraminha!!!");
        familiares.add("Filha FP - Ama história, vai brilhar nas salas de aula !!!");
        familiares.add("Filho Jr - Focado no Vava e no CN, decola !!!");
        familiares.add("Caçula FP - Brincar e se maquiar é uma rotina !!!");

        // Solicitando o nome do familiar
        System.out.println("Digite seu nome e receba minha mensagem (Exemplo: Albino, Megera, Filha, Filho Jr e Caçula): ");
        String nomeDigitado = scanner.nextLine();

        // Usando o switch para tratar o nome
        switch (nomeDigitado) {
            case "Albino":
                System.out.println(familiares.get(0));
                break;

            case "Megera":
                System.out.println(familiares.get(1));
                break;

            case "Filha":
                System.out.println(familiares.get(2));
                break;

            case "Filho Jr":
                System.out.println(familiares.get(3));
                break;

            case "Caçula":
                System.out.println(familiares.get(4));
                break;

            default:
                System.out.println("Esse não é da familia!!! Digite outro nome.");
                break;
        }

        // Mensagem bônus
        System.out.println(MensagemBonus.getMensagem(nomeDigitado));

        // Exibindo a data atual
        Date dataAtual = new Date();
        System.out.println("\nData Atual: " + dataAtual);

        // Fechando o scanner
        scanner.close();
    }
}

