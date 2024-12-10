/**
 * <h1>DataHoraAtual</h1>
 * Em todo o projeto, exercício ou simulado eu coloco
 * essa mensagem nas classe para poder me organizar
 * em questão do tempo utilizado no aprendizado.
 * <p>
 * <b>Nota:</b> Exibe data e horario atual no momento
 * da compilação do programa.
 * 
 * @author Albino Pires
 * @since 07/12/2024
 * @version 1.0
 * 
 */


 import java.time.LocalDateTime;
 import java.time.format.DateTimeFormatter;
 
 /**
  * Classe responsável por gerar a mensagem com a data e hora atual.
  */
 public class MensagemDataHoraAtual {
     public static String getMensagem() {
         // Obtém a data e hora atual
         LocalDateTime agora = LocalDateTime.now();
 
         // Define o formato desejado
         DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
 
         // Retorna a data/hora formatada como String
         return "Data e Hora Atual: " + agora.format(formato);
     }

    public static String getMessage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMessage'");
    }
 }