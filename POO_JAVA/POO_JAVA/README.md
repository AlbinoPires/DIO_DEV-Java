# 👋 Olá, eu sou Albino Pires!

🌐 Cloud Enthusiast | AWS Cloud | Python | Linux 

🚀 Certificado AWS Cloud Practitioner e estudante de Computação em Nuvem, com um forte interesse em automação, infraestrutura como código (IaC) e DevOps. Sempre buscando aprender mais sobre tecnologias de ponta, como Python, Terraform, Kubernetes e Docker.

Atualmente, estou me preparando para a certificação **AWS Solutions Architect** e desenvolvendo em Java aprendendo essa linguagem fantástica para poder conseguir minha oportunidade na área Tech 🚀.



# **Demonstração de Programação Orientada a Objetos (POO) em Java**

## 📝 **Descrição**
Este projeto é uma demonstração prática de conceitos fundamentais de **POO (Programação Orientada a Objetos)** em Java. Foi criado para explorar o uso de **classes**, **métodos**, **atributos**, e o recurso de **enums** para definir constantes imutáveis, garantindo maior robustez e legibilidade ao código.

Além disso, o projeto inclui a exibição dinâmica de data e hora no console, registrando o momento exato de execução.

---

## 📂 **Estrutura do Projeto**

### **Classe `Estudante`**
A classe `Estudante` representa uma entidade do mundo real, com os seguintes atributos e métodos:

#### **Atributos**
- `String nome`: Nome do estudante.
- `int idade`: Idade do estudante.
- `Sex sex`: Enum representando o gênero do estudante (`Masculino`, `Feminino`).

#### **Métodos**
- `void comendo(String alimento)`: Simula o estudante comendo algo e exibe a mensagem correspondente no console.
- `void beberAlgo(String bebida)`: Simula o estudante bebendo algo e exibe a mensagem correspondente no console.
- `void correndo()`: Simula o estudante correndo e exibe a mensagem correspondente no console.

---

### **Enum `Sex`**
Definido como um conjunto de constantes imutáveis para representar o gênero de forma consistente e segura:
```java
enum Sex {
    Masculino, Feminino;
}
```

---

### **Classe `MensagemDataHoraAtual`**
Essa classe fornece uma mensagem com a data e hora exatas da execução do programa. Ela utiliza a API `java.time` para manipular data e hora de forma moderna e eficiente.

#### **Exemplo de Implementação**
```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class MensagemDataHoraAtual {
    static String getMensagem() {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return "Execução em: " + agora.format(formato);
    }
}
```

---

## 💻 **Demonstração Prática**
### **Código Principal (`main`)**
O método `main` realiza as seguintes ações:
1. Cria um objeto da classe `Estudante` e define seus atributos (`nome`, `idade`, `sex`).
2. Invoca métodos da classe para simular ações (`comendo`, `beberAlgo`, `correndo`).
3. Exibe os atributos do objeto no console.
4. Registra o momento exato da execução com data/hora.

---

## 🖼️ **Exemplo de Saída**
Ao executar o programa, a saída no console será semelhante a esta:

```
Demonstração da minha classe em POO: 
Albino Pires está correndo!
Albino Pires está comendo um churrasquinho de cria 
Albino Pires está tomando uma cervejinha
Albino Pires está correndo!
Nome: Albino Pires
Idade: 41
Gênero: Masculino
Execução em: 12/12/2024 20:30:45
```

---

## 🔧 **Como Executar**
1. Clone o repositório:
   ```bash
   git clone https://github.com/AlbinoPires/POO-Estudante.git
   cd POO-Estudante
   ```
2. Compile o projeto:
   ```bash
   javac Estudante.java
   ```
3. Execute o programa:
   ```bash
   java Estudante
   ```

---

## 🚀 **Tecnologias Utilizadas**
- **Java**: Linguagem de programação.
- **VSCode**: IDE para desenvolvimento.
- **API `java.time`**: Para manipulação de data e hora.

---

## 📚 **Conceitos Explorados**
- Criação e manipulação de **classes** e **métodos**.
- Uso de **atributos** para representar propriedades do objeto.
- Implementação de **enums** para valores fixos e imutáveis.
- Registro de **data e hora dinâmica** na execução do programa.

---
🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀