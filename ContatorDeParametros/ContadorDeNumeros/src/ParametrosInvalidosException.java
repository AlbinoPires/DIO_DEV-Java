/**
 * <h1>Criando uma Exceção Personalizada</h1>
 * 
 * Criando uma exceção personalizada para nossa classe Contador
 * caso o usuario digite algo fora do solicitado é tratado
 * @author Albino Pires
 * @date 11/12/24
 * @category Developer Java
 */

public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}