# **Testando Interação em Java - Projeto Familiar**

Este projeto demonstra a interação do usuário com uma aplicação em **Java** utilizando entradas pelo terminal. A aplicação utiliza pacotes externos, listas e operadores para exibir informações personalizadas baseadas no nome digitado pelo usuário. A estrutura do projeto é modular e segue boas práticas de programação.

---

## **Setup Utilizado**
- **Sistema Operacional:** Ubuntu 22.04
- **IDE:** Visual Studio Code
- **JDK:** Oracle JDK 23.0.1
- **Ferramentas:** 
  - Terminal do Ubuntu
  - Configuração da pasta `bin` para execução dos arquivos compilados
- **Comando de Execução no Terminal:**
  ```bash
  java --enable-preview TestandoScannerEmFamilia2024
  ```

---

## **O que foi Utilizado?**

1. **Entradas do Usuário:**
   - Interação via `Scanner` para capturar o nome do usuário.
   - Configuração do Scanner com `Locale.US` para evitar erros de formatação com números.

2. **Estrutura Modular:**
   - Criação de uma classe auxiliar (`MensagemBonus`) para tratar mensagens personalizadas.
   - Uso de listas (`ArrayList`) para armazenar informações sobre os familiares.

3. **Testes Diretos no Terminal:**
   - O programa foi compilado e executado diretamente no terminal sem dependência da IDE, garantindo portabilidade.

4. **Operadores e Estruturas Condicionais:**
   - Uso de `switch-case` para retornar informações específicas baseadas no nome digitado.

5. **Pacotes Externos:**
   - Importação do pacote `java.util` para o uso de Scanner, listas e datas.
   - Utilização do pacote `java.time` para manipulação e formatação de data/hora.

6. **Boas Práticas:**
   - Fechamento do `Scanner` ao final do programa para liberar recursos.
   - Separação de lógica em classes distintas, promovendo a reutilização e clareza.

---

## **Código Principal - `TestandoScannerEmFamilia2024.java`**

```java
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class TestandoScannerEmFamilia2024 {
    public static void main(String[] args) {

        // Configurando o Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Criando uma lista de familiares
        List<String> familiares = new ArrayList<>();
        familiares.add("Albino FP - Espirito de equipe, pelo o todo!!!");
        familiares.add("Megera FP - Adora um Doraminha!!!");
        familiares.add("Filha FP - Ama história, vai brilhar nas salas de aula !!!");
        familiares.add("Filho Jr - Focado no Vava e no CN, decola !!!");
        familiares.add("Caçula FP - Brincar e se maquiar é uma rotina !!!");

        // Solicitando o nome do familiar
        System.out.println("Digite o nome do familiar (ex: Mariana): ");
        String nomeDigitado = scanner.nextLine();

        // Usando o switch para tratar o nome
        switch (nomeDigitado) {
            case "Albino":
                System.out.println(familiares.get(0));
                break;

            case "Megera":
                System.out.println(familiares.get(1));
                break;

            case "Filha":
                System.out.println(familiares.get(2));
                break;

            case "Filho Jr":
                System.out.println(familiares.get(3));
                break;

            case "Caçula":
                System.out.println(familiares.get(4));
                break;

            default:
                System.out.println("Esse não é da familia!!! Digite outro nome.");
                break;
        }


        // Mensagem bônus
        System.out.println(MensagemBonus.getMensagem(nomeDigitado));

        // Exibindo a data atual
        Date dataAtual = new Date();
        System.out.println("\nData Atual: " + dataAtual);

        // Fechando o scanner
        scanner.close();
    }
}
```

---

## **Classe Auxiliar - `MensagemBonus.java`**

```java
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

```

---

## **Execução no Terminal**

### **Passo a Passo:**
1. Compile os arquivos `.java` para `.class`:
   ```bash
   javac TestandoScannerEmFamilia2024.java MensagemBonus.java
   ```
2. Navegue até o diretório onde os arquivos `.class` foram gerados.
3. Execute o programa:
   ```bash
   java --enable-preview TestandoScannerEmFamilia2024
   ```

---

## **Melhorias Futuras**

- Adicionar testes unitários para validar a interação com os pacotes.
- Expandir a lista de familiares com mais informações.
- Implementar uma interface gráfica usando **JavaFX** para enriquecer a experiência do usuário.

---

**Autor:** Albino Pires  
**Data:** 20/11/2024  
**Licença:** MIT  
**Linguagem:** ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)