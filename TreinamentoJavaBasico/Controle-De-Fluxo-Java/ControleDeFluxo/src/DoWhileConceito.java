import java.util.Random;
/**
     * Esta classe demonstra o conceito do laço de repetição <b>do-while</b>.
     *
     * <h1>DoWhileConceito</h1>
     * Conceito de Do While
     *
     * <p>
     * <b>Nota:</b> Estrutura de Repetição
     * </p>
     *
     * @author Albino
     * @since 2024-12-05
     * @version 1.1
     */
 public class DoWhileConceito {
     public static void main(String[] args) {
         // Exibe data e hora
         System.out.println(MensagemDataHoraAtual.getMensagem());
 
         System.out.println("Discando ...");
 
         do {
             System.out.println("Telefone tocando ...");
         } while (tocando());
 
         System.out.println("Alô ...");
     }
 
     // Método deve estar fora do main()
     private static boolean tocando() {
         boolean atendeu = new Random().nextInt(3) == 1;
         System.out.println("Atendeu? " + atendeu);
         return !atendeu;
     }
 }
 