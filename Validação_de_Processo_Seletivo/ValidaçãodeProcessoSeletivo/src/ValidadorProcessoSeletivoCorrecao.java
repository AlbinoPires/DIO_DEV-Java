import java.util.concurrent.ThreadLocalRandom;

public class ValidadorProcessoSeletivoCorrecao {
    public static void main(String[] args) throws Exception {
        // Exibe data e hora
        System.out.println(MensagemDataHoraAtual.getMensagem() + "\n");

        selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"Paulo", "Bubu", "Jose", "Maria", "Joao", "Jaja", "Maik"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;

        double salarioBase = 2000.00;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            // Formatação da saída
            System.out.printf("O candidato %s foi selecionado para a vaga - valor pretendido: R$ %.2f%n", candidato, salarioPretendido);

            // Análise do salário pretendido
            analisarCandidato(salarioPretendido);

            candidatoAtual++;
            candidatosSelecionados++; // Incrementa apenas se o candidato for avaliado
        }
    }

    static double valorPretendido() {
        // Gera um valor aleatório entre 1800 e 2000
        return ThreadLocalRandom.current().nextDouble(1800, 2000);
    }

    // Método para verificar as propostas
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.00;

        if (salarioBase > salarioPretendido) {
            System.out.println("- LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("- LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("- AGUARDANDO OS OUTROS CANDIDATOS");
        }
    }
}
