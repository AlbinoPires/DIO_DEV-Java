public class ContaCorrente {


    //variavel da classe conta corrente
    double saldo = 20000;

    public void sacar (Double valor){
        //variavel local de método
        
        double novoSaldo = saldo - valor;
        System.out.println(novoSaldo);
    }

    public void imprimirSaldo(){
        //disponivel em toda classe 
        System.out.println(saldo);
        //somente o método sacar conhece esta variavel
        //System.out.println(novoSaldo);
        }
    }
