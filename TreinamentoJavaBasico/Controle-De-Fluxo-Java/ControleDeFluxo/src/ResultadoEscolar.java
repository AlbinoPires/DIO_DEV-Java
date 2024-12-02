public class ResultadoEscolar {

    public static void main(String[] args) {
        // vamos testar os casos, se maior 5 imprime aluno02 se não aluno01
        double notaAluno01 = 4.5;
        int notaAluno02 = 9;
        String aluno01 = "Isabella Almeida";
        String aluno02 = "Albino Pires Jr";


        if (notaAluno01 >= 7){
            System.out.println("Parabéns Sr." + aluno01 + " - Nota: " + notaAluno01 + " .Aprovado com sucesso, boas férias!");

        }else if (notaAluno01 >= 5 && notaAluno01 < 7) {// SEMPRE CONDIÇÃO ANTES DO OPERADOR >= || <= 

            System.out.println("\nProva de recuperação dia 31 Dez 2099. -Sr(a) " + aluno01 );

        
        }else {
            System.out.println("\nInfelizmente o Srª " + aluno01 + " - Nota: " + notaAluno01 + " . Está Reprovada!!!");
        }

    }
}