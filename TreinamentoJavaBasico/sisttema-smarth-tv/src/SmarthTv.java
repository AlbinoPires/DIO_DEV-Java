public class SmarthTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // criando um método para ligar e desligar
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    // criando um método aumetar e diminuir o volume
    public void aumentarVolume(){
        volume++; //incrementando em +1
            System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--; // incrmeentando em -1
            System.out.println("Diminuindo o volume para: " + volume);
    }

    // criando um método para aumentar, diminuir e mudar canal, passando um parametro 'int novoCanal'

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumetarCanal(){
        canal++;
        System.out.println("Passando para o Canal: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Passando para o Canal: " + canal);
    }
}
