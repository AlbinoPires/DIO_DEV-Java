// Pacote ou classe externa
public class MensagemBonus {

    public static String getMensagem(String nome) {
        switch (nome) {
            case "Albino":
                return "Parabéns, Albino! Sua ideia funcionou, o pacote integrou ao código atual!";
            case "Megera":
                return "Megera, parabéns! Você está brilhando como sempre.";
            case "Filha":
                return "Filha, continue brilhando nas salas de aula, seu retorno é sua independência financeira!";
            case "Filho Jr":
                return "Filho Jr, foque na sua missão, disciplina nos estudos e passe para CN, ganhará um PC ZeroBala!";
            case "Caçula":
                return "Caçulinha, nunca perca a magia da brincadeira sua familia te ama, BEBE DO PAPAI!";
            default:
                return "Nome não reconhecido, mas o esforço valeu a pena!";
        }
    }
}
