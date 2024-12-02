import java.lang.classfile.instruction.SwitchCase;

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

public class EntendendoSwitchCase {

    public static void main(String[] args) {
        
        String sigla = "G";
        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MEDIO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("Não definido!");
                break;
        }
    }
}