/**
 * <h1>TratamentoExcecao</h1>
 * Entendendo controle de fluxo simples e aprendendo o Debug ou Depuração.
 * Este exemplo inclui estrutura de repetição com FOR.
 *
 * <p>
 * <b>Nota:</b> Estrutura de Repetição
 * </p>
 *
 * @author Albino Pires
 * @since 26/11/2024
 * @version 1.0
 */

 import java.util.InputMismatchException;
 import java.util.Scanner;
 
 public class TratamentoExcecao{
     public static void main(String[] args) {
         try {
             // Data e hora atual
             System.out.println(MensagemDataHoraAtual.getMensagem());
             Scanner scanner = new Scanner(System.in);
 
             String nome;
             int idade = 0;
             double altura = 0.0;
 
             // Lê o nome (sem risco de exceção)
             System.out.print("Digite seu nome: ");
             nome = scanner.nextLine();
 
             // Loop para entrada de idade
             boolean entradaValida = false;
             while (!entradaValida) {
                 try {
                     System.out.print("Digite sua idade (número inteiro): ");
                     idade = scanner.nextInt();
                     entradaValida = true; // Sai do loop se a entrada for válida
                 } catch (InputMismatchException e) {
                     System.out.println("Erro: A idade deve ser um número inteiro.");
                     scanner.nextLine(); // Limpa a entrada incorreta
                 }
             }
 
             // Loop para entrada de altura
             entradaValida = false;
             while (!entradaValida) {
                 try {
                     System.out.print("Digite sua altura (número decimal, ex: 1.75): ");
                     altura = scanner.nextDouble();
                     entradaValida = true; // Sai do loop se a entrada for válida
                 } catch (InputMismatchException e) {
                     System.out.println("Erro: A altura deve ser um número decimal.");
                     scanner.nextLine(); // Limpa a entrada incorreta
                 }
             }
 
             // Exibe os dados coletados
             System.out.println("\nDados Coletados:");
             System.out.println("Nome: " + nome);
             System.out.println("Idade: " + idade);
             System.out.println("Altura: " + altura);
 
             scanner.close();
         } catch (Exception e) {
             System.out.println("Erro inesperado: " + e.getMessage());
         }
     }
 }
 