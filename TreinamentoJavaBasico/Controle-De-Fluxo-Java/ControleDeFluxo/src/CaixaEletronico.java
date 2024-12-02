/**
 * <h1>Treinando Controle de fluxo</h1>
 * Entendo controle de fluxo simples e aprendendo o Debug ou Depuração
 * 
 * <p>
 * <b>Nota:</b> Neste caso com um retorno positivo
 * 
 * @author Albino Pires
 * @since 26/11/2024
 * @Categoria Desenveloper Java
 */


public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 50000;
        double saqueSolicitado = 100;
        //double saldoAtualizado = 0; uma ideia futura
        if (saqueSolicitado < saldo)
            saldo =  saldo - saqueSolicitado;



        System.out.println("\nPrezado Sr Albino Pires seu saque foi efetuado com sucesso!\n" + "R$ " + saqueSolicitado);
        System.out.println("Seu saldo atual é: \n" + "R$  "+ saldo);
    }
}
