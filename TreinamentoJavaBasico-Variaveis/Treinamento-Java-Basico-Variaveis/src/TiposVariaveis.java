//Treinamento Java Basico - Tipos de variaveis - Dev Jr Albino Pires

/* primitivos Types - int, byte, short, long, float, double, boolean e char:
 * * * * * * * * * * * * * *
 * INTEIROS:
 * byte - 1 byte ()
 * short - 2 bytes (valor utilizado para data, anos 2024....)
 * int - 4 bytes (valor mais extenso...geralmente MUITO UTILIZADO)
 * long - 8 bytes (valor muito grande contagem de estrela no universo...)
 * * * * * * * * * * * * * *
 * FRACIONAVEIS:
 * float - 4 bytes (Limitação que compromete seu uso, mantém precisão decimal entre 6 e 7 digitos)
 * double - 8 bytes (MUITO UTILIZADO, para garantia das precisões do algoritmo)
 * 
 * Como declarar:
 * Tipo / nomeVariavel / AtribuiçãoDeValorOpcional
 * int idade;
 * int anoFabricacao = 2021;
 * double salarioMinimo = 2500  (2.500 = 2,5);
 */


public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        byte idade = 99;
        short ano = 2021;
        int cep = 21911300;       // Se começar com 0 tem que ser outro tipo String   
        long cpf = 000000000000L; // Se começar com 0 tem que ser do tipo String e terminar com L para representar
        float pi = 3.14F;       //Tem que colocar F no final em todo tipo float
        double salario = 1450.33;
        System.out.println("Hello, World! Começamos!!!" + idade + " " + ano + " " + cep + " " + cpf + pi + " " + salario + " Teste Ok");
    }
}

