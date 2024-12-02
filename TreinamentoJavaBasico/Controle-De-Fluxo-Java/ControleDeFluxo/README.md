


# 🌟 Condição Ternária em Java

A **condição ternária** é um operador especial em Java usado para simplificar blocos simples de `if-else`. Ela é uma ótima alternativa para atribuir valores com base em uma condição, utilizando menos linhas de código.

---

## 🛠️ Estrutura

```java
variavel = (condicao) ? valor_se_verdadeiro : valor_se_falso;
```

### Componentes:
1. **`condicao`**: Uma expressão lógica que será avaliada (ex.: `nota >= 7`).
2. **`?`**: Significa "então" – executa se a condição for verdadeira.
3. **`:`**: Significa "senão" – executa se a condição for falsa.

---

## 📘 Exemplo de Uso

```java
public class ResultadoEscolar {

    public static void main(String[] args) {
        double nota = 7.0;
        String resultadoFinal = nota >= 7 ? "Aprovado" : "Reprovado";

        System.out.println("\n" + resultadoFinal);
    }
}
```

### Explicação:
1. **`nota >= 7`**: É a condição lógica que será avaliada.
   - Se **verdadeira**, retorna `"Aprovado"`.
   - Se **falsa**, retorna `"Reprovado"`.

2. O valor retornado será atribuído à variável `resultadoFinal`.

3. **Saída para `nota = 7.0`**:
   ```
   Aprovado
   ```

---

## 🔄 Comparação com `if-else`

O mesmo código acima com `if-else` seria:

```java
public class ResultadoEscolar {

    public static void main(String[] args) {
        double nota = 7.0;
        String resultadoFinal;

        if (nota >= 7) {
            resultadoFinal = "Aprovado";
        } else {
            resultadoFinal = "Reprovado";
        }

        System.out.println("\n" + resultadoFinal);
    }
}
```

---

## 💡 Quando Usar Condição Ternária?

- **Vantagens**:
  - Menos código, mais direto.
  - Ideal para situações onde você só precisa retornar ou atribuir um valor simples.

- **Evitar**:
  - Quando a lógica for muito complexa (ex.: múltiplos `if-else` aninhados), pois pode dificultar a legibilidade.

---

## 🖥️ Teste no Seu Computador

### Código completo:
```java
public class ResultadoEscolar {

    public static void main(String[] args) {
        double nota = 7.0;
        String resultadoFinal = nota >= 7 ? "Aprovado" : "Reprovado";

        System.out.println("\n" + resultadoFinal);
    }
}
```

1. Crie um arquivo chamado `ResultadoEscolar.java`.
2. Copie o código acima.
3. Compile e execute:
   ```bash
   javac ResultadoEscolar.java
   java ResultadoEscolar
   ```

---

## 🚀 Resultado Esperado
Para `nota = 7.0`, a saída será:
```
Aprovado
```

---

## 🤝 Contribuição
Se você achou útil, sinta-se à vontade para dar um ⭐ no repositório! 😊
```

---
