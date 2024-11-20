import java.util.Date;

/**
 * Testando a execução da Classe em terminal
 * <h1>AboutMe</h1>
* A lista recebe nomes gerados pelo usuario para teste.
* <p>
* <b>Note:</b> Teste via terminal executando a nossa 
* Classe AboutMe, no contexto ela espera a entrada 
* das informações pelo usuario para retornar algo...
* 
* @author  Albino Pires
* @version  1.0
* @since    20/11/2024
 */

public class AboutMe {
    public static void main(String[] args) {

        if (args.length < 5) {
            System.out.println("Por favor, insira todos os 5 argumentos: nome, sobrenome, idade, altura e área de atuação.");
            return;
        }
        String nome = args[0];
        String sobreNome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);
        String areaAtuacao = args[4];
        Date dataAtual = new Date();

        System.out.println("Olá meu nome é " + nome + sobreNome + "sou " +  areaAtuacao);
        System.out.println("Tenho " + idade + " anos " );
        System.out.println("Minha altura "+ altura);
        System.out.println(dataAtual);
    }
}
