import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

// package candidatos;
/**
     * Esta classe está validando a proposta de um candidato <b>Analisando Candidatura</b>.
     *
     * <h1>Analisador de Candidatura</h1>
     * Lógica simples e reutilizavel.
     *
     * <p>
     * <b>Nota:</b> Analisando Candidatura
     * </p>
     *
     * @author Albino Pires
     * @since 2024-12-07
     * @version 1.1
     * @category Developer Java
     */



public class ValidadorProcessoSeletivo {
    public static void main(String[] args) throws Exception {
       // Exibe data e hora
       System.out.println(MensagemDataHoraAtual.getMensagem() + "\n");
        //imprimirCandidatos();
        //selecaoCandidatos();

        // chamando o metodo entrando em contato
        String [] candidatos = {"Paulo", "Bubu", "Jose", "Maria", "Joao", "Jaja"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
            
        }
    }
    
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 0;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu=atender();
            continuarTentando = !atendeu;
            if (continuarTentando) 
                tentativasRealizadas++;
            else
                System.out.println("\nContato realizado com sucesso!");

        }while(continuarTentando && tentativasRealizadas <3);

            if(atendeu)
                System.out.println("Conseguimos o contato com " + candidato + " na " + tentativasRealizadas + " realizada(s)");
            else
                System.out.println("Conseguimos o contato com " + candidato + " na " + tentativasRealizadas + " realizada(s)");

    }
    static boolean atender() {
       return new Random().nextInt(3)==1; 
    }


    static void imprimirCandidatos(){
        String [] candidatos = {"Paulo", "Bubu", "Jose", "Maria", "Joao", "Jaja"};
        System.out.println("Imprimindo a lista de candidatos informando o dindice do elemento");

        for(int indice=0; indice < candidatos.length; indice++){
            System.out.println("O candidato nº " + (indice + 1) + " é o " + candidatos[indice]);
        }
        System.out.println("\nForma abrevida de interação for each");
        for (String candidato : candidatos) {
            System.out.println("O candidato foi " + candidato);
            
        }
    }

    static void selecaoCandidatos(){
        String []candidatos = {"Paulo", "Bubu", "Jose", "Maria", "Joao", "Jaja", "Maik"};
    
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
// Formatando a saida: Explicação:
// %s: Substitui por uma String (o nome do candidato).
// %.2f: Formata o valor numérico com 2 casas decimais (o salário pretendido).
// %n: Insere uma nova linha (equivalente a \n).

            System.out.printf("O candidato %s foi selecionado para a vaga - valor pretendido: R$ %.2f%n", candidato, salarioPretendido);
            candidatoAtual++;
        }
        candidatoAtual++;
    }

    static final double valorPretendido(){
    return ThreadLocalRandom.current().nextDouble(1800,2000);
}


    //Método para verificar as propostas 
    static void analisarCandidato(double salarioPretendido){

        double salarioBase = 2000.00;

        if(salarioBase > salarioPretendido) {
            System.out.println("- LIGAR PARA O CANDIDATO");

        }else if (salarioBase==salarioPretendido) {

            System.out.println("- LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
            
        }else{

            System.out.println("- AGUARDANDO OS OUTROS CANDIDATOS");
        }
    }

}
