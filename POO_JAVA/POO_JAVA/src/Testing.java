public class Testing {
    private String numeros;
    private String verbos;
    private String pluralModificados;

    public String make(char candidato, int contador) {
        createPluralDependenteMenssagemParts(contador);
        return String.format(
            "There %s %s %s%s", verbos, numeros, candidato, pluralModificados
        );
    }

    private void createPluralDependenteMenssagemParts(int contador) {
        if (contador == 0) {
            thereAreNoLetters();
        } else if (contador == 1) {
            thereIsOneLetter();
        } else {
            thereAreManyLetters(contador);
        }
    }

    private void thereAreManyLetters(int contador) {
        numeros = Integer.toString(contador);
        verbos = "are";
        pluralModificados = "s";
    }

    private void thereIsOneLetter() {
        numeros = "1";
        verbos = "is";
        pluralModificados = "";
    }

    private void thereAreNoLetters() {
        numeros = "no";
        verbos = "are";
        pluralModificados = "s";
    }

    public static void main(String[] args) {
        Testing testing = new Testing();

        // Testando diferentes valores
        System.out.println(testing.make('a', 0)); // There are no as
        System.out.println(testing.make('b', 1)); // There is 1 b
        System.out.println(testing.make('c', 5)); // There are 5 cs
    }
}

