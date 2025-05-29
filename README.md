# 📱 Projeto Simulação Iphone - Java

Este projeto é uma simulação simples de um Iphone em Java feito como desafio do **Bootcamp Java Clound Native Bradesco**, que implementa três principais funcionalidades:

- 📞 **Telefone**
- 🎵 **Reprodutor Musical**
- 🌐 **Navegador de Internet**

O projeto foi desenvolvido utilizando os princípios da **Programação Orientada a Objetos (POO)**, com uso de **interfaces**, **implementações** e uma classe principal para testes.

---

## 🏗️ Estrutura do Projeto

```
IPhone-project/src/
├── Iphone.java
├── Navegador.java
├── ReprodutorMusical.java
├── Telefone.java
└── Usuario.java
```

---

## 🚀 Funcionalidades

### 🔹 **ReprodutorMusical (Interface)**
- `tocar()` → Toca uma música.
- `pausar()` → Pausa a música.
- `selecionarMusica()` → Seleciona uma música.

### 🔹 **Telefone (Interface)**
- `ligar()` → Realiza uma chamada.
- `atender()` → Atende uma chamada.
- `iniciarCorreioVoz()` → Inicia o correio de voz.

### 🔹 **Navegador (Interface)**
- `exibirPagina()` → Exibe uma página da web.
- `adicionarNovaPagina()` → Abre uma nova aba/página.
- `atualizarPagina()` → Atualiza a página atual.

### 🔸 **Classe Iphone**
- Implementa as três interfaces:
  - `ReprodutorMusical`
  - `Telefone`
  - `Navegador`
- Contém a implementação dos métodos definidos nas interfaces.

### 🔸 **Classe Usuario (main)**
- Responsável por executar o programa e testar as funcionalidades do Iphone.

---

## 🗺️ Diagrama UML

```
         +----------------------+
         |  <<interface>>       |
         |  ReprodutorMusical   |
         +----------------------+
         | +tocar()             |
         | +pausar()            |
         | +selecionarMusica()  |
         +----------------------+

         +----------------------+
         |  <<interface>>       |
         |  Telefone            |
         +----------------------+
         | +ligar()             |
         | +atender()           |
         | +iniciarCorreioVoz() |
         +----------------------+

         +----------------------+
         |  <<interface>>       |
         |  Navegador           |
         +----------------------+
         | +exibirPagina()      |
         | +adicionarNovaPagina()|
         | +atualizarPagina()   |
         +----------------------+

                  ^
                  |
         +-------------------------------+
         |            Iphone              |
         +-------------------------------+
         | +tocar()                      |
         | +pausar()                     |
         | +selecionarMusica()           |
         | +ligar()                      |
         | +atender()                    |
         | +iniciarCorreioVoz()          |
         | +exibirPagina()               |
         | +adicionarNovaPagina()        |
         | +atualizarPagina()            |
         +-------------------------------+

         +-------------------------------+
         |           Usuario              |
         +-------------------------------+
         | +main(String[] args)           |
         +-------------------------------+
```

## 🧠 Conceitos abordados

- Programação Orientada a Objetos (POO)
- Interfaces em Java
- Implementação de múltiplas interfaces
- Organização e modelagem de software

---
