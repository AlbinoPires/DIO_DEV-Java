/**
 * <h1>Treinando For com Arrays</h1>
 * Entendo for com Arrays
 * 
 * <p>
 * <b>Nota:</b> Estrutura de Repetição For - Arrays
 * 
 * @author Albino Pires
 * @since 26/11/2024
 * @Categoria Desenveloper Java
 */

public class EstruturaForArray {
    public static void main(String[] args) {

        String alunos [] = {"BIBI", "JUJU", "JAJA", "BUBU" };
        //Temos aqui nossa variavel de escopo aluno, aonde receberá nossa lista de arrays...
        // essa é uma forma mais agradável de trabalhar com elementos de uma array
        for (String aluno : alunos) { 
            System.out.println("O nome do aluno é " + aluno + ", é um excelente aluno(a).");
        }
    }
}

   /*    public static void main(String[] args) {
        // em arrays e em qualquer linguagem indices começa em 0
        String alunos [] = {"BIBI","JUJU", "JAJA", "BUBU"};
        // enquanto x for menor que meu numero de alunos (length = tamanho) ele continua a execução com o incremento x ++
        // quando x=0 (índice 0,1,2,3 = os quatro elementos dentro da lista de arrays)
        for (int x=0; x < alunos.length; x ++) {

            System.out.println("O Aluno no indice x= " + x + " é " + alunos[x] );
            
        }
    }
}

    */
