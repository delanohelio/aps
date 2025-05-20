# 1. Introdução aos Padrões de Projeto

Padrões de projeto são soluções reutilizáveis para problemas recorrentes no desenvolvimento de software orientado a objetos. Eles ajudam a melhorar a qualidade, a manutenibilidade e a reutilização do código.

---

## 1.1 O que é um padrão de projeto?

Um **padrão de projeto (design pattern)** é uma solução geral, reutilizável e comprovada para um problema comum em um determinado contexto de design de software.

> "Um padrão de projeto descreve uma estrutura de classes e objetos que soluciona um problema geral de design em um contexto específico." — Gang of Four

### Exemplo de analogia:

Imagine que você precisa construir várias casas com formatos parecidos. Em vez de projetar cada uma do zero, você pode usar uma planta padrão, adaptando-a quando necessário. O mesmo ocorre com padrões de projeto no desenvolvimento de software.

---

## 1.2 Padrões de projeto no MVC do Smalltalk

Um dos primeiros usos práticos de padrões de projeto foi no **MVC (Model-View-Controller)** do Smalltalk, que divide uma aplicação em três componentes principais:

- **Model**: representa os dados e regras de negócio.
- **View**: representa a interface com o usuário.
- **Controller**: lida com a entrada do usuário e atualiza o modelo ou a visão.

Cada parte do MVC pode ser associada a diferentes padrões de projeto:

| Componente  | Padrões relacionados                    |
|-------------|------------------------------------------|
| Model       | Observer                                 |
| View        | Composite, Strategy                      |
| Controller  | Command, Strategy                        |

### Exemplo com Java (Observer simplificado):

```java
import java.util.*;

class Observador implements Observer {
    private String nome;

    public Observador(String nome) {
        this.nome = nome;
    }

    public void update(Observable o, Object arg) {
        System.out.println(nome + " recebeu atualização: " + arg);
    }
}

class Modelo extends Observable {
    public void mudarEstado(String estado) {
        setChanged();
        notifyObservers(estado);
    }
}

public class DemoObserver {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        modelo.addObserver(new Observador("Tela1"));
        modelo.addObserver(new Observador("Tela2"));

        modelo.mudarEstado("Novo Estado!");
    }
}
````

---

## 1.3 Descrevendo os padrões de projeto

Cada padrão é descrito usando uma **estrutura comum**, que facilita sua compreensão e comparação. Essa estrutura inclui:

* **Nome**: uma identificação curta e expressiva.
* **Problema**: a situação em que o padrão se aplica.
* **Solução**: os elementos envolvidos e suas relações.
* **Consequências**: os efeitos de aplicar o padrão, como flexibilidade e complexidade.
* **Implementação**: dicas práticas e desafios para aplicá-lo.

---

## 1.4 O catálogo de padrões de projeto

O catálogo contém 23 padrões clássicos divididos em 3 grupos:

* **Padrões Criacionais**: tratam da criação de objetos.
* **Padrões Estruturais**: tratam da composição de classes e objetos.
* **Padrões Comportamentais**: tratam da comunicação entre objetos.

### Lista dos 23 padrões:

* **Criacionais**: Singleton, Factory Method, Abstract Factory, Builder, Prototype
* **Estruturais**: Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy
* **Comportamentais**: Chain of Responsibility, Command, Interpreter, Iterator, Mediator, Memento, Observer, State, Strategy, Template Method, Visitor

---

## 1.5 Organizando o catálogo

Os padrões podem ser organizados com base em dois critérios:

* **Finalidade**:

  * **Criação**
  * **Estrutura**
  * **Comportamento**

* **Escopo**:

  * **Classe**: define relações entre classes (estáticas).
  * **Objeto**: define relações entre objetos (dinâmicas).

### Tabela de Classificação (resumida):

| Finalidade    | Classe            | Objeto                            |
| ------------- | ----------------- | --------------------------------- |
| Criação       | Factory Method    | Abstract Factory, Builder, etc.   |
| Estrutura     | (não se aplica)   | Adapter, Decorator, Facade, etc.  |
| Comportamento | Interpreter, etc. | Observer, Strategy, Command, etc. |

---

## 1.6 Como os padrões solucionam problemas de projeto

Padrões ajudam a:

* **Reduzir o acoplamento** entre partes do sistema.
* **Aumentar a reutilização** de soluções já comprovadas.
* **Facilitar a comunicação** entre desenvolvedores através de uma linguagem comum.
* **Melhorar a manutenibilidade** e a escalabilidade do sistema.

### Exemplo comparativo:

Sem padrão:

```java
class Pedido {
    EmailServico email = new EmailServico();

    public void confirmar() {
        email.enviarConfirmacao();
    }
}
```

Com padrão Strategy:

```java
interface ServicoNotificacao {
    void notificar();
}

class EmailServico implements ServicoNotificacao {
    public void notificar() {
        System.out.println("Enviando e-mail...");
    }
}

class Pedido {
    private ServicoNotificacao notificacao;

    public Pedido(ServicoNotificacao notificacao) {
        this.notificacao = notificacao;
    }

    public void confirmar() {
        notificacao.notificar();
    }
}
```

---

## 1.7 Como selecionar um padrão de projeto

Perguntas que ajudam a escolher um padrão:

* Qual é o problema que estou tentando resolver?
* Existe um padrão que resolva esse tipo de problema?
* Quero evitar dependência entre classes? → **Observer, Mediator**
* Preciso criar objetos de forma flexível? → **Factory, Builder**
* Desejo permitir que objetos mudem de comportamento? → **Strategy, State**

Uma boa prática é conhecer o **catálogo de padrões** e os tipos de problema que cada um resolve. A experiência ajuda a identificar padrões de forma mais intuitiva.

---

## 1.8 Como usar um padrão de projeto

1. **Compreenda o problema**: o padrão deve fazer sentido no contexto.
2. **Estude a estrutura do padrão**: entenda suas classes e responsabilidades.
3. **Adapte ao seu caso**: os padrões são genéricos — personalize-os conforme necessário.
4. **Implemente incrementalmente**: refatore seu código aplicando o padrão.
5. **Documente o uso**: facilite a leitura e a manutenção do projeto.

---

> ⚠️ **Dica prática**: Não use padrões de forma prematura. Eles são ferramentas poderosas, mas devem ser aplicadas com critério. Às vezes, uma solução simples é melhor do que uma aplicação forçada de um padrão.

---

## Próximo passo

No próximo conteúdo, exploraremos os **Padrões Criacionais**, começando com o **Singleton**, um dos mais populares e simples de implementar.
