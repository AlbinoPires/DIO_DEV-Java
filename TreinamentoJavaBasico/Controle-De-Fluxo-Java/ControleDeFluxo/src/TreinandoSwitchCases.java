/**
 * <h1>Controle de fluxo com Switch Case</h1>
 * Conceito de controle de fluxo com múltiplos casos
 * Treinando uma case para uma entrevista.
 * <p>
 * <b>Nota:</b> verificando a aplicabilidade desse elemento
 * 
 * @author Albino Pires
 * @since 26/11/2024
 * @Categoria Desenveloper Java
 */


public class TreinandoSwitchCases {
    public static void main(String[] args) {

        System.out.println("--------------------------BEM VINDO AO QUIOSQUE DOS COMBOS -------------------");
        System.out.println("\n- Abaixo segue seu pedido: ");
        String comboComida = "A";

        switch (comboComida) {
            case "A":
                System.out.println("- 2 Cocas 2L | 4 XTudos | 2 Porções Batata Fritas.");
                break;

            case "B":
                System.out.println("- 1 Agua C/Gas 1,5Lt | 2 Pizzas Calabrezas | 1 Porção Batata Frita");
                break;
            case "C":
                System.out.println("1 Coca 2L | 500Gr Salgadinhos Sortidos | 1 Porção Batata Frtia");
                break;
            default:
                break;
        }

        System.out.println("************************** Favor retirar no balcão, obrigado! *****************");


    }
}
