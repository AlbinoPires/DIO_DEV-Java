/**
* <h1>TestandoLista</h1>
* A lista recebe nomes gerados pelo usuario para teste.
* <p>
* <b>Note:</b> Lista inicia uma série de estudos para 
* entender como a linguagem se comporta em dados partindo
* de lista até entender o comportamento com chave e valor!
* 
* @author  Albino Pires
* @version  1.0
* @since    18/11/2024
*/


import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class TestandoLista {
   
     public static void main(String[] args) {

         //Declarando e inicializando uma lista de Strings - TESTE
         List<String>nomesAleatorios = new ArrayList<>();

         //Add elementos a lista
         nomesAleatorios.add("Albino");
         nomesAleatorios.add("Bubu");
         nomesAleatorios.add("Michele");
         nomesAleatorios.add("Isabella");
         nomesAleatorios.add("Juneba");
         nomesAleatorios.add("Mary");

         System.out.println("Minha lista: " + nomesAleatorios);
         System.out.println(" ");


         Date dataAtual = new Date();
         System.out.println("Oi, fui executado pelo Terminal, bugou mas no cliente funcionou!!!");
         System.out.println(dataAtual);
     }
}

/*
 * Explicação:
 * List<String>nomesAleatorios 
 * Define uma lista que armazena elemntos do tipo String.
 * 
 * new ArrayList<>();
 * Cria uma instância de implementação ArrayList
 * 
 * Método add()
 * Adiciona elemtnso à lista
 */