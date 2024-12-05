/**
 * <h1>Treinando While</h1>
 * Este programa exemplifica o conceito e uso do laço de repetição <b>while</b>.
 *
 * <p>
 * <b>Nota:</b> Este exemplo foca em estruturas de repetição para iniciantes.
 * </p>
 *
 * @author Albino Pires
 * @since 2024-11-26
 * @version 1.0
 * @category Java Developer
 */

import java.util.concurrent.ThreadLocalRandom;

public class TreinandoWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0){
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada){
                valorDoce = mesada;
            }

            System.out.println("Doce do valor: " + String.format("%.2f", valorDoce) + " adicionado ao cesto de compras.");
            mesada = mesada - valorDoce;
        }

        System.out.println("\nMesada: " + String.format("%.2f", mesada));
        System.out.println("Bubu gastou toda a mesada que tinha comprando doces!");

        // Exibe data e hora
        System.out.println(MensagemDataHoraAtual.getMensagem());
    
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,9);
    }
}
