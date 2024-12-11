import java.util.Scanner;

/**
 * <h1>Contador de Numeros</h1>
 * Exercicio de um contador de numeros aonde o a diferença do numero será iniciado um contador, aonde o usuario digita os numeros, independente de quais são.
 * Uma exceção personalizada foi criada para poder auxiliar na interação sem erros esperados.
 * @autor Albino Pires
 * @data 11/12/24
 * @category Developer Java
 */
public class ContadorDeNumeros {
    public static void main(String[] args) throws Exception {
        System.out.println("---------------------MENU DO CONTADOR-----------------------------------");
        System.out.println("Regra para interação: 1º numero deve ser menor que o segundo!");

        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o seu primeiro numero: ");
        int numeroUm = terminal.nextInt();

        System.out.println("Digite o seu segundo numero: ");
        int numeroDois = terminal.nextInt();

        try {
            contar(numeroUm, numeroDois);
        } catch (ParametrosInvalidosException Exception) {
            System.out.println(Exception.getMessage());
            // chamando a execption criada
        }

    }
    // Criando o método para poder realizar a verificação dos numeros digitados pelo usuario
    static void contar(int numeroUm, int numeroDois)throws ParametrosInvalidosException{

        if(numeroUm > numeroDois){
            throw new ParametrosInvalidosException("O segundo numero deve ser maior que o primeiro, digite novamente!");
        }
        int contagem = numeroDois - numeroUm;
        
        for (int i = 1; i <= contagem; i++){
            System.out.println("- Imprimindo o número: " + i);
        }
    System.out.println("\nObrigado por utilizar nosso teste! ");
    }
}
