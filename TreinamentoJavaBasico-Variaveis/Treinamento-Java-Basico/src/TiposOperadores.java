/*
 * Operador de atribuição
 * = igualdade (o que recebe)
 * == igual
 * != Diferente
 * < menor 
 * > maior
 * <= menor igual
 * >= maior igual
 * Operador Aritimetico: + - * / % (modulo - se resultado da divisão 'restos da divisão')
 *  Operador unário
 * (+) números são positivos sem esse operador explicitante
 * (-) operador de negação 
 * (++) incrementa o valor em 1 unidade;
 * (--) decrementa o valor em 1 unidade
 * (!) nega o valor de uma expressão booleana (true ou false);
 * 
 * 
 */

import java.util.Date; // para poder criar a inscrição de data e hora local no exato ato criação

public class TiposOperadores {
    public static void main(String[] args) {
        char sexo = 'M';  // ocupa 2 bytes de memoria armazena 1 caractere- char
        boolean doadorOrgao = false;
        Date dataNascimento = new Date(); // criando o carimbo data/hora local tem que import java.util.Date
        double testeOperadorAritimetico = (2* 20) + (1 + 1);

        //output de saida no terminal
        System.out.println(testeOperadorAritimetico);
        System.out.println("Teste: " + doadorOrgao + "Sexo: " + sexo + " " + dataNascimento);

        //Verificando como IDE concatena caractere com numero:

        String concatenacao = "?";
        concatenacao = 1 + 1 + "1"; // vejamos que ele iniciou a soma, mas quando verifica caractere ele concatena
            System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1;
            System.out.println(concatenacao);
        concatenacao = "1" + 1 + 1 + 1;
            System.out.println(concatenacao); 
        concatenacao = "1" + (1+2+3);  // vejo que temos que ter cuidado ao manupular concatenação com tipos de operadores
            System.out.println(concatenacao);
        
        int numero1 = 5;
            System.out.println(- numero1); // imprime no termina '-5' porque negamos ele, pois todo nr sem nada é positivo
        int numero2 = 5;
        numero2 = - numero2;
            System.out.println(numero2); // imprime no termina '-5' porque negamos ele quando dizemos = - xxxxx
            // se fizermos ele negativo e retornar positivo numero = numero * -1;

        //iteração de repetição

        int numero = 5;
        //numero ++; // incrementamos
            System.out.println(++numero); //pode ser feito assim, mas sendo no bloco fica mais estetico
        //outro exemplo

        for (int i = 0; i < 5; i++) {
                System.out.println(i);
            }
        
        boolean minhaVariavel = true;
            
            System.out.println(! minhaVariavel);

        
        //Exercicio vendo a saga do daviluiz batendo penalty

        boolean penalidadeParaFla = true;
        String daviLuizbate = "Não, ele não! ";
        int saldoFla = 1; //aqui era para ser gol! mas era o daviluiz né;
        System.out.println(daviLuizbate + "Davi Luiz na bola. " + "Consideramos ele batendo: " + -saldoFla + "Fez o gol!!!! ( é " + !penalidadeParaFla + ")");

        //Operador Ternario

        int flamengo, aMineiro;
        flamengo = 1;
        aMineiro = 0;

        String resultado = flamengo == aMineiro ? "Verdadeiro, DaviLuiz fez gol!" : "Falso, ele perdeu a penalidade máxima!!!";
            System.out.println(resultado);
        /* MAS PODE SER ASSIM, O OPERADOR TERNARIO É PARA ABREVIAR O CODIGO
         * String resultado = "";
         * if (a==b)
         *  resultado = "verdadeiro";
         * else
         *  resultado = "falso";
         * 
         * Explicando <expressão condicional (true / false)> ? <Caso a condição seja true> : <Caso seja false>
         * 
         */

        //Operadores Relacionais

        // && Operador "E"  - || Operador Lógico "OU"

        boolean condicao1 = true;
        boolean condicao2 = false;
        if (condicao1 && (7 > 4)){
            System.out.println("As duas condições são verdadeiras");
        
        }
        if (condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
    }
}