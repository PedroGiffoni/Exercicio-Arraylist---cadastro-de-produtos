# 🛒 Gerenciador de Lista de Compras com ArrayList

## 📖 Sobre o Projeto

Este projeto foi desenvolvido com o objetivo de praticar o uso da classe `ArrayList` em Java, aplicando conceitos fundamentais de manipulação de listas dinâmicas, estruturas de repetição, estruturas de decisão e validação de dados.

A aplicação simula um pequeno sistema de gerenciamento de lista de compras, permitindo ao usuário adicionar, listar, buscar e remover produtos através de um menu interativo executado no terminal.

Além dos requisitos originais do desafio, foram implementadas funcionalidades extras para reforçar o aprendizado e tornar a aplicação mais robusta.

---

## 🎯 Objetivo do Desafio

Desenvolver uma aplicação capaz de:

- Adicionar produtos a uma lista dinâmica
- Listar todos os produtos cadastrados
- Remover produtos da lista
- Buscar produtos cadastrados
- Exibir a quantidade total de produtos
- Trabalhar com menus interativos
- Aplicar validações de entrada

---

## ⚙️ Funcionalidades

### ➕ Adicionar Produto

Permite cadastrar um novo produto na lista.

Validações implementadas:

- Não permite nomes vazios ou em branco.
- Exibe mensagem de confirmação após o cadastro.

Exemplo:

```text
Para adicionar digite o nome do produto:
Arroz

Produto adicionado com sucesso!
```

---

### 📋 Listar Produtos

Exibe todos os produtos cadastrados na lista.

Caso a lista esteja vazia, uma mensagem informativa é apresentada.

Exemplo:

```text
Listando produtos:

1 - Arroz
2 - Feijão
3 - Macarrão
```

---

### ❌ Remover Produto

Permite remover um produto informando seu nome.

A busca é realizada utilizando:

```java
equalsIgnoreCase()
```

Dessa forma, não há diferenciação entre letras maiúsculas e minúsculas.

Exemplo:

```text
Qual produto deseja remover?

arroz

Produto removido com sucesso!
```

---

### 🔍 Buscar Produto

Permite verificar se determinado produto está cadastrado.

A busca também utiliza:

```java
equalsIgnoreCase()
```

Exemplo:

```text
Digite o nome do produto

Feijão

Produto disponível!
```

---

### 📦 Quantidade de Produtos

Exibe o total de produtos atualmente cadastrados na lista.

Exemplo:

```text
Existem 5 produtos cadastrados.
```

---

### 🚪 Sair

Encerra a execução do programa.

---

## 🛡️ Validações Implementadas

Além do solicitado originalmente, foram adicionadas validações para tornar o sistema mais seguro.

### Validação de Menu

Caso o usuário digite um valor que não seja numérico:

```text
Escolha uma opção de 1 a 6.
```

---

### Validação de Opção

Caso o usuário informe uma opção inexistente:

```text
Opção inválida! Escolha uma opção de 1 a 6!
```

---

### Validação de Produto

Não permite cadastrar produtos com nome vazio.

Exemplo:

```text
Nome inválido!
```

---

## 🏗️ Estrutura da Aplicação

A aplicação foi desenvolvida utilizando:

- Menu interativo
- Estrutura de repetição `while`
- Estrutura de decisão `switch case`
- Classe `ArrayList`
- Entrada de dados com `Scanner`
- Estruturas condicionais
- Laços de repetição
- Manipulação de Strings

---

## 🔄 Fluxo de Execução

```text
Início
   │
   ▼
Exibir Menu
   │
   ▼
Escolher Opção
   │
   ├── Adicionar Produto
   ├── Listar Produtos
   ├── Remover Produto
   ├── Buscar Produto
   ├── Quantidade de Produtos
   └── Sair
        │
        ▼
      Fim
```

---

## 📂 Estrutura do Projeto

```text
src/
└── br/
    └── com/
        └── giffoni/
            └── pedro/
                └── desafioarraylist/
                    └── DesafioArrayList.java
```

### Classe Principal

#### DesafioArrayList

Responsável por:

- Criar e gerenciar a lista de produtos
- Exibir o menu interativo
- Capturar entradas do usuário
- Executar as funcionalidades da aplicação
- Realizar validações de entrada

---

## 🛠️ Tecnologias Utilizadas

<div align="center">

<img src="https://skillicons.dev/icons?i=java,git,github" />

</div>

### Ferramentas

- Java
- NetBeans IDE
- Scanner
- ArrayList
- Git
- GitHub

---

## 📚 Conceitos Praticados

### Estruturas de Dados

- ArrayList
- Lista dinâmica

### Métodos do ArrayList

```java
add()
remove()
get()
size()
isEmpty()
```

### Estruturas de Controle

- while
- switch case
- if / else
- for

### Manipulação de Strings

```java
equalsIgnoreCase()
isBlank()
```

### Entrada de Dados

- Scanner
- hasNextInt()

### Boas Práticas

- Validação de entrada
- Tratamento de erros de preenchimento
- Organização de código
- Separação de responsabilidades

---

## 🎓 Objetivos de Aprendizagem

Este projeto teve como foco o desenvolvimento das habilidades necessárias para trabalhar com coleções em Java, especialmente o uso de `ArrayList`.

Durante a implementação foram praticados conceitos essenciais para aplicações reais, como:

- Cadastro dinâmico de dados
- Busca de informações
- Remoção de elementos
- Controle de fluxo
- Validação de entradas do usuário

---

## 👨‍💻 Autor

<div align="center">

<a href="https://github.com/PedroGiffoni">
<img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white">
</a>

<a href="https://www.linkedin.com/in/pedrogiffoni/">
<img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white">
</a>

<a href="mailto:pedrotonimelo@gmail.com">
<img src="https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white">
</a>

</div>

---

## ⭐ Apoie o Projeto

Se este projeto foi útil para você ou ajudou nos estudos de ArrayList em Java, considere deixar uma estrela no repositório.
