/**
 * <h1>Condição Ternerária</h1>
 * Conceito de condição ternerária com condicional encadeada
 * 
 * <p>
 * <b>Nota:</b> Refatoramos o código desenvolvido para ser mais limpo com mais condicioanis
 * 
 * @author Albino Pires
 * @since 26/11/2024
 * @Categoria Desenveloper Java
 */


public class ResultadoEscolar3 {
    public static void main(String[] args) {
        double nota  = 6;

        // Conceito de condiçãoi ternária com expressão de condicional encadeada
        // Onde temos mais de uma condicional ao resultado podendo ser exibido ou encaminhado
        // a outra instrução dentro do desenvolvimento.

        String resultadoFinal =  nota >= 7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovação";
            System.out.println("O resultado final  é: " + resultadoFinal);
    }
}
