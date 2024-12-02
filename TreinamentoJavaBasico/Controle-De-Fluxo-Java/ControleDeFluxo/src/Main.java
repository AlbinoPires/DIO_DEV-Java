import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Declaração de um ArrayList
        ArrayList<String> lista = new ArrayList<>(); // COM TEXTO ADICIONAMO STRING COM NUMEROS INTERGER
        lista.add("albino");
        lista.add("michele");
        lista.add("jr");
        lista.add("ok");
        lista.add("ache o erro");

        // Impressão direta
        System.out.println(lista);

        // Iteração para imprimir cada elemento
        for (int elemento : lista) {
            System.out.println(elemento);
        }
    }
}

