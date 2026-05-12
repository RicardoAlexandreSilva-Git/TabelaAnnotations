# Mini ORM Java

Projeto desenvolvido para praticar conceitos avançados de Java utilizando:

- Generics
- Reflection API
- Custom Annotations
- Factory Pattern
- Exceptions personalizadas

O sistema recebe palavras digitadas pelo usuário e armazena objetos dinamicamente em uma tabela genérica, utilizando Reflection para acessar atributos automaticamente em tempo de execução.

---

# Tecnologias e conceitos

- Java
- Generics
- Reflection
- Annotations
- Design Patterns
- POO

---

# Estrutura

```text
src/
├── annotations/
│   └── Tabela.java
│
├── exceptions/
│   ├── OpcaoInvalidaException.java
│   └── PalavraInvalidaException.java
│
├── factory/
│   └── TabelaFactory.java
│
├── model/
│   └── Usuario.java
│
├── service/
│   └── TabelaService.java
│
└── main/
    └── Main.java
