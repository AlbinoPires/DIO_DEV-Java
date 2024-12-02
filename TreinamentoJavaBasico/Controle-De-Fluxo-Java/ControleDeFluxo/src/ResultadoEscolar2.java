/**
 * <h1>Condição Ternária</h1>
 * Conceito de condição ternária
 * 
 * <p>
 * <b>Nota:</b> Refatoramos o código desenvolvido para ser mais limpo com condição composta
 * 
 * @author Albino Pires
 * @since 26/11/2024
 * @Categoria Desenveloper Java
 */

public class ResultadoEscolar2 {
    
    public static void main(String[] args) {
        double nota = 7.0;
        String resultadoFinal  = nota >= 7 ? "Aprovado" : "Reprovado";
        //Aqui temos uma expressão ternária que joga para uma varável seu resultado
        //Podemos exibir ou atrelar a outra finalidade como desencadear outra condição 

        System.out.println("\n" + resultadoFinal);
    }
}

/*
* String resultadoFinal = nota >= 7 ? "Aprovado" : "Reprovado";
* nota >= 7: Condição lógica. Será avaliada como verdadeira ou falsa.
* ? - "Então". Define o valor se a condição for verdadeira → "Aprovado".
* : - "Senão". Define o valor se a condição for falsa → "Reprovado".
*
* Como funciona na prática
* Se a nota for 7.5: Avalia a condição: nota >= 7 → Verdadeiro. Resultado do ?: Atribui "Aprovado".
* Se a nota for 6.5: Avalia a condição: nota >= 7 → Falso.
* Resultado do :: Atribui "Reprovado".🚀
 */
