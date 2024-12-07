/**
 * <h1>Tratamento Exceções</h1>
 * Exercitando para verificação de tratamento
 * de erros não checados
 * 
 * <p>
 * <b>Nota:</b> Exception
 * </p>
 *
 * @author Albino Pires
 * @since 26/11/2024
 * @version 1.0
 */

public class FormatadorCEPExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCEP("2345678");
            System.out.println("----------Verificador de CEP Nacional --------------");
            System.out.println(cepFormatado);
        
        } catch (CepInvalidoExeption e) { 
            System.out.println("O Cep não corresponde ao padrão estabelecido, digite os 8 digitos novamente. ");
            // TODO: handle exception
        }
        
    }


//Validando nosso método para verificar se o cep do usuario atende a regra de 8 numeros
    static String formatarCEP(String cep) throws CepInvalidoExeption{
        if(cep.length() !=8)
        throw new CepInvalidoExeption();

        return "21.911-300";
    }
}
