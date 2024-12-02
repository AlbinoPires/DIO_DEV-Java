/**
 * <h1>Controle de fluxo com Switch Case</h1>
 * Conceito de controle de fluxo com múltiplos casos
 * 
 * <p>
 * <b>Nota:</b> verificando a aplicabilidade desse elemento
 * 
 * @author Albino Pires
 * @since 26/11/2024
 * @Categoria Desenveloper Java
 */


public class PlanoTelefoneSwitchCase {
    public static void main(String[] args) {

        //Entendendo, se caso T (plano turbo ele segue as cases e inclui tudo que tem M e S)
        //Entendendo, se caso M (plano medio ele segue a case e inclui tudo do plano S)
        //Entendendo, se caso S (plano short ele segue retorna somente ele mesmo)
        // no caso do break não utilizado foi a espertize de não repetir tudo nos casos abaixo
        System.out.println("\n------------Plano Escolhido:------------\n");
        String plano = "T";
        switch (plano) {
            case "T":{
                System.out.println(" Plano Turbo temos: 10Tb Dados");
            }
            case "M":{
                System.out.println(" - Youtube e Whatsapp ilimitado");
            }
            case "S":{
                System.out.println(" - 1000 minutos em ligação em todo o território nacional");
                break;
            }
        }
    }
}
