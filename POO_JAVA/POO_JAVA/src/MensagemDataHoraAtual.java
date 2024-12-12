 import java.time.LocalDateTime;
 import java.time.format.DateTimeFormatter;

 /** 
  * <h1>Padronizando Data Hora </h1>
  * Classe responsável por gerar a mensagem com a data e hora atual.
  * Padronizado em todo e qualquer atividade exercida
  * @autor Albino Pires
  * @since 12/12/2024
  * @categoria Java Developer - POO
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
 