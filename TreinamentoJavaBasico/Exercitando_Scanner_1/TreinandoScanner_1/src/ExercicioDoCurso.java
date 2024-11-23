public class ExercicioDoCurso {
    public static void main(String[] args) {
        // Teste 1
        int valor1 = 3;
        int valor2 = 9;
        System.out.println("PROD = " + (valor1 * valor2));

        // Teste 2
        valor1 = -30;
        valor2 = 10;
        System.out.println("PROD = " + (valor1 * valor2));

        // Teste 3
        valor1 = 0;
        valor2 = 9;
        System.out.println("PROD = " + (valor1 * valor2));
    }
}


/*==================================================================
 * COMO FOI ACEITO E A EXPLICAÇÃO:
 * 
 * import java.util.Scanner;

public class ProdutoValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo os valores de entrada
        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();

        // Calculando o produto
        int PROD = valor1 * valor2;

        // Exibindo o resultado no formato esperado
        System.out.println("PROD = " + PROD);

        scanner.close(); // Boa prática para liberar recursos
    }
}

1. Entrada dos dados (STDIN):
   - Os dados fornecidos pelo sistema são lidos do "console" ou similar, dependendo da linguagem.
   - Em Java, utilizamos `BufferedReader` para ler os valores de entrada.

2. Saída dos dados (STDOUT):
   - O programa deve imprimir o resultado exatamente no formato esperado.

exemplo para o Desafio em Java
Segue o código ajustado com `BufferedReader` para se adequar ao ambiente de teste:


Por que Usar `BufferedReader` em Java?
- Ele é recomendado para leitura de entrada padrão em sistemas de teste porque:
  1. É eficiente e suporta grandes volumes de entrada.
  2. Garante compatibilidade com o ambiente do teste, que insere os valores automaticamente no STDIN.



Processo do Desafio
1. Entrada Dinâmica:
   - O sistema insere os dois valores inteiros no STDIN automaticamente.
   - O programa lê esses valores usando `BufferedReader`.

2. Processamento:
   - Calcula o produto dos dois valores e armazena na variável `PROD`.

3. saída Formatada:
   - Imprime o resultado exatamente no formato esperado: `PROD = resultado`.


Próximos Passos
1. Teste o código localmente com entradas no terminal.
2. Submeta o código na plataforma de desafio para validar os testes.

 */