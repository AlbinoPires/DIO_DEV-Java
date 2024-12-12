/**
 * <h1>Entendendo o Conceito de Classe</h1>
 * Demonstração e inicio do entendimento de POO em Java
 * Demonstração importando um enum
 * @author Albino Pires
 * @since 12/12/2024
 * @category Developer Java - POO
 */

import meupacote.MensagemDataHoraAtual;



public class Estudante {
    String nome;
    int idade;
    Cor cor;
    Sex sex;
    // Métodos exemplos
    
    void comendo(String alimento){
        //o codigo 
        System.out.println(nome + " está comendo um " + alimento);
        
    }
    void beberAlgo(String bebida){
        // o codigo
        System.out.println(nome + " está tomando uma " + bebida);
    }
    void correndo(){
        //o codigo
        System.out.println(nome + " está correndo!");
    }
    public static void main(String[] args) {
        System.out.println("Demonstração da minha classe em POO: ");
        Estudante estudante = new Estudante();
        estudante.nome = "Albino Pires";
        estudante.idade = 41;
        estudante.sex = Sex.Masculino;
        estudante.correndo();

        //ações do estudante
        estudante.comendo("churrasquinho de cria ");
        estudante.beberAlgo("cervejinha");
        estudante.correndo();

        //imprimindo os atributos
        
        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Gênero: " + estudante.sex);
        // Exibe data e hora
        System.out.println(MensagemDataHoraAtual.getMensagem() + "\n");
    }
}

