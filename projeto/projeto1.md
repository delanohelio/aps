# 📦 Projeto: Sistema de Pedidos com Simulação de Notificações

## 🎯 Objetivo

Desenvolver um sistema orientado a objetos que simule o fluxo de pedidos de uma loja virtual, incluindo cadastro de clientes e produtos, criação de pedidos, envio de notificações e geração de relatórios. O sistema deve funcionar de forma simples, via terminal (interface de texto), e **não deve utilizar frameworks externos ou bibliotecas além da JDK padrão**.

Este projeto será **refatorado ao final da disciplina com o uso de padrões de projeto**, portanto, **não utilize padrões de projeto nesta fase**.

---

## 📚 Contexto

Imagine que você foi contratado para criar um sistema básico de pedidos para uma pequena loja online. O sistema precisa permitir que os funcionários:

- Cadastrem clientes e produtos.
- Criem pedidos contendo um ou mais produtos.
- Simulem o envio de notificações de confirmação ao cliente.
- Gerem relatórios dos pedidos em dois formatos: **texto simples** e **JSON (simulado)**.
- Calculem o valor do frete com duas opções de cálculo.

---

## 🧰 Funcionalidades obrigatórias

### 1. Cadastro de Clientes
- Nome, CPF, e-mail, telefone.

### 2. Cadastro de Produtos
- Nome, preço, peso (em kg).

### 3. Criação de Pedido
- Associado a um cliente.
- Contém uma lista de produtos (quantidade por produto).
- Deve calcular:
  - Total do pedido.
  - Frete.
  - Total com frete.

### 4. Cálculo de Frete
- Oferecer duas opções de cálculo:
  1. **Por peso total**: R$ 5,00 por quilo.
  2. **Fixo por distância**: usuário informa distância em km, e o frete é R$ 0,50 por km.

> O usuário escolhe qual estratégia de cálculo de frete usar no momento da criação do pedido.

### 5. Notificação de Pedido
- Ao confirmar um pedido, o sistema deve **simular** o envio de uma notificação ao cliente.
- A notificação pode ser feita por:
  - E-mail
  - SMS
  - WhatsApp
- **Não é necessário enviar mensagens reais.** Basta imprimir no terminal algo como:
```

Enviando e-mail para [joao@email.com](mailto:joao@email.com): Seu pedido foi confirmado!

````

> O tipo de notificação pode ser fixo ou definido no momento da confirmação. A implementação deve apenas funcionar, sem se preocupar com boas práticas ainda.

### 6. Relatórios
- O sistema deve permitir a geração de relatórios dos pedidos em dois formatos:
- **Texto simples (exibido no terminal)** com:
  ```
  Cliente: João
  Produtos:
  - Arroz (2x) - R$ 20,00
  - Feijão (1x) - R$ 10,00
  Total: R$ 30,00
  Frete: R$ 15,00
  Total com frete: R$ 45,00
  ```
- **JSON (simulado)**:
  ```
  {
    "cliente": "João",
    "produtos": [
      {"nome": "Arroz", "quantidade": 2, "preco": 20.0},
      {"nome": "Feijão", "quantidade": 1, "preco": 10.0}
    ],
    "total": 30.0,
    "frete": 15.0,
    "total_com_frete": 45.0
  }
  ```

> Não é necessário usar bibliotecas JSON — apenas montar a string formatada.

---

## ❗ Regras e restrições

- Não utilizar frameworks (Spring, Hibernate, etc.).
- Não usar padrões de projeto nesta fase (mesmo que conheça).
- Código deve ser estruturado em classes e pacotes de forma clara.
- Tudo deve ser executado pelo terminal com menus ou comandos simples.

---

## 📁 Estrutura sugerida de pacotes/classes

````

src/
├── Main.java
├── model/
│   ├── Cliente.java
│   ├── Produto.java
│   ├── Pedido.java
│   └── ItemPedido.java
├── servico/
│   ├── FreteCalculadoraPeso.java
│   ├── FreteCalculadoraDistancia.java
│   ├── NotificadorEmail.java
│   ├── NotificadorSMS.java
│   └── NotificadorWhatsApp.java
├── relatorio/
│   ├── RelatorioTexto.java
│   └── RelatorioJSON.java
└── util/
└── Entrada.java  // leitura via Scanner

````

---

## 📦 Entregáveis

- Código fonte completo organizado por pacotes.
- Um menu simples via terminal que permita testar todas as funcionalidades.
- Um pequeno arquivo README.md com:
  - Instruções para compilar e executar.
  - Quais funcionalidades estão implementadas.
  - Quais desafios encontrou.

Os artefatos deveram estar no GitHub.

---

## 🧠 Dica

Neste momento, **não se preocupe em evitar duplicações ou acoplamentos** — esses problemas serão tratados futuramente com o uso de **padrões de projeto**, quando você será desafiado a **refatorar este mesmo projeto** aplicando boas práticas.

---

## 📅 Prazo de entrega

> *25/06/2025 23:59*

---

## ✅ Critérios de avaliação (primeira entrega - sem padrões)

| Critério                                   | Pontos |
|-------------------------------------------|--------|
| Funcionalidades obrigatórias completas    | 4,0    |
| Código organizado e classes bem definidas | 3,0    |
| Entrada/saída funcional via terminal      | 1,0    |
| Estrutura de dados adequada               | 1,0    |
| Documentação no README.md                 | 1,0    |
| Total                                     | **10,0** |


