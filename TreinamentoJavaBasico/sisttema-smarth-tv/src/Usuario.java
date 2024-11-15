public class Usuario {
    public static void main(String[] args) throws Exception {
        
        System.out.println("-----Status SmarthTv------: ");
        SmarthTv smarTv = new SmarthTv();
        System.out.println("A Tv está ligada: " + smarTv.ligada);

        smarTv.mudarCanal(22);
            System.out.println("Canal atual: " + smarTv.canal);

        smarTv.diminuirVolume(); //24
        smarTv.diminuirVolume(); //23
        smarTv.diminuirVolume(); //22
        smarTv.aumentarVolume(); //23
            System.out.println("Volume atual: " + smarTv.volume);

        smarTv.ligar();
            System.out.println("Novo status => Tv está ligada: " + smarTv.ligada);
        smarTv.desligar();
            System.out.println("Novo status => Tv está ligada: " + smarTv.ligada);

        smarTv.aumetarCanal();
        smarTv.aumentarVolume();
            System.out.println("Passando para o canal " + smarTv.canal +" e aumentando o volume para " + smarTv.volume);
        
        //queremos mudar para o canal 570 para assistir uma jogo Premier League:

        smarTv.mudarCanal(570);
            System.out.println("Canal atual: " + smarTv.canal);


    }
}
