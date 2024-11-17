/**
* <h1>Calculadora</h1>
* A Calculadora realiza operações matemáticas entre números.
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classe 
* para desfrutar dos recursos oferecidos pelo autor!
* 
* @author  Albino Pires
* @version  1.0
* @since    17/11/2024
*/
public class Calculadora {

   /**
    * Este método é utilizado para somar dois números inteiros.
    * @param numeroUm este é o primeiro parâmetro do método
    * @param numeroDois este é o segundo parâmetro do método
    * @return int o resultado deste método é a soma dos dois números
    */
   public int somar(int numeroUm, int numeroDois) {
       return numeroUm + numeroDois;
   }

   /**
    * Este método é utilizado para subtrair dois números inteiros.
    * @param numeroUm este é o primeiro parâmetro do método
    * @param numeroDois este é o segundo parâmetro do método
    * @return int o resultado deste método é a subtração do primeiro pelo segundo número
    */
   public int subtrair(int numeroUm, int numeroDois) {
       return numeroUm - numeroDois;
   }

   /**
    * Este método é utilizado para multiplicar dois números inteiros.
    * @param numeroUm este é o primeiro parâmetro do método
    * @param numeroDois este é o segundo parâmetro do método
    * @return int o resultado deste método é a multiplicação dos dois números
    */
   public int multiplicar(int numeroUm, int numeroDois) {
       return numeroUm * numeroDois;
   }

   /**
    * Este método é utilizado para dividir dois números inteiros.
    * @param numeroUm este é o primeiro parâmetro do método
    * @param numeroDois este é o segundo parâmetro do método
    * @return double o resultado deste método é a divisão do primeiro pelo segundo número
    * @throws ArithmeticException se numeroDois for zero
    */
   public double dividir(int numeroUm, int numeroDois) {
       if (numeroDois == 0) {
           throw new ArithmeticException("Divisão por zero não é permitida!");
       }
       return (double) numeroUm / numeroDois;
   }

   public static void main(String[] args) {
       Calculadora calculadora = new Calculadora();

       System.out.println("|:::::::::CALCULADORA:::::::::|");

       System.out.println("Soma de 10 + 5: " + calculadora.somar(10, 5));
       System.out.println("Subtração de 10 - 5: " + calculadora.subtrair(10, 5));
       System.out.println("Multiplicação de 10 * 5: " + calculadora.multiplicar(10, 5));
       System.out.println("Divisão de 10 / 5: " + calculadora.dividir(10, 5));

       System.out.println("|:::::::::OBRIGADO!:::::::::::|");

    }
}
