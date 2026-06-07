# 📦 Sistema de Controle de Estoque com ArrayList

## 📖 Sobre o Projeto

Este projeto foi desenvolvido com o objetivo de aprofundar os estudos sobre a classe `ArrayList` em Java, evoluindo um simples gerenciador de lista de compras para um sistema de controle de estoque baseado em Programação Orientada a Objetos.

A aplicação permite cadastrar produtos, controlar quantidades em estoque, realizar buscas, remover produtos, calcular o valor total do estoque e visualizar todas as informações cadastradas através de um menu interativo executado no terminal.

Além da utilização de coleções, o projeto também explora conceitos como encapsulamento, validação de dados, criação de classes personalizadas, métodos de negócio e sobrescrita do método `toString()`.

---

## 🎯 Objetivo do Desafio

Desenvolver uma aplicação capaz de:

- Cadastrar produtos em uma lista dinâmica
- Armazenar objetos em um `ArrayList`
- Adicionar produtos ao estoque
- Buscar produtos cadastrados
- Remover produtos
- Listar todos os produtos
- Exibir a quantidade total de itens em estoque
- Calcular o valor total do estoque
- Aplicar validações de entrada
- Praticar Programação Orientada a Objetos

---

## ⚙️ Funcionalidades

### ➕ Cadastrar Produto

Permite cadastrar novos produtos informando:

- Nome
- Preço
- Quantidade
- Código
- Categoria

Validações implementadas:

- Nome obrigatório
- Código obrigatório
- Categoria obrigatória
- Preço maior que zero
- Quantidade não negativa
- Não permite produtos com nomes duplicados
- Não permite códigos duplicados

---

### 📥 Adicionar Estoque

Permite aumentar a quantidade disponível de um produto já cadastrado.

O sistema localiza o produto pelo nome e atualiza automaticamente o estoque.

Exemplo:

```text
Para adicionar no estoque digite o nome do produto:

Teclado

Quantidade:

10

Estoque atualizado! Quantidade atual: 20
```

---

### 📋 Listar Produtos

Exibe todos os produtos cadastrados utilizando o método sobrescrito `toString()`.

Exemplo:

```text
Nome: Teclado
| Preço: R$150.0
| Estoque: 20
| Código: TEC001
| Categoria: Periféricos
```

---

### ❌ Remover Produto

Permite remover um produto através do nome.

A busca é realizada ignorando diferenças entre letras maiúsculas e minúsculas.

Exemplo:

```text
Qual produto deseja remover?

Teclado

Produto removido com sucesso!
```

---

### 🔍 Buscar Produto

Permite localizar um produto específico e exibir todas as suas informações.

Exemplo:

```text
Digite o nome do produto

Teclado

Nome: Teclado
| Preço: R$150.0
| Estoque: 20
| Código: TEC001
| Categoria: Periféricos
```

---

### 📦 Quantidade de Produtos

Exibe duas informações:

- Quantidade de produtos diferentes cadastrados
- Quantidade total de itens em estoque

Exemplo:

```text
Existem 5 produtos diferentes cadastrados.

A quantidade total de produtos em estoque é 120 produtos.
```

---

### 💰 Valor Total do Estoque

Calcula automaticamente o valor total armazenado no estoque.

O cálculo é realizado através da multiplicação:

```text
Preço × Quantidade
```

de todos os produtos cadastrados.

Exemplo:

```text
Valor total do estoque: R$ 15450.00
```

---

### 🚪 Sair

Encerra a execução do programa.

---

## 🛡️ Validações Implementadas

O sistema possui diversas validações para evitar inconsistências nos dados.

### Validação de Menu

Caso o usuário informe um valor que não seja numérico:

```text
Escolha uma opção de 1 a 8.
```

---

### Validação de Nome

Não permite:

- Campos vazios
- Espaços em branco

Exemplo:

```text
Nome inválido!
```

---

### Validação de Preço

Não permite:

- Letras
- Valores menores ou iguais a zero

Exemplo:

```text
Preço inválido.
```

---

### Validação de Quantidade

Não permite:

- Letras
- Valores negativos

Exemplo:

```text
Quantidade inválida.
```

---

### Validação de Código

Não permite:

- Código vazio
- Código duplicado

Exemplo:

```text
Já existe um produto cadastrado com esse código.
```

---

## 🏗️ Classes do Projeto

### DesafioArrayList

Classe principal responsável por:

- Exibir o menu interativo
- Capturar entradas do usuário
- Gerenciar a lista de produtos
- Executar as funcionalidades da aplicação
- Aplicar validações

---

### Produto

Classe responsável por representar um produto dentro do estoque.

#### Atributos

```java
private String nome;
private double preco;
private int quantidade;
private String codigo;
private String categoria;
```

#### Métodos

```java
adicionarEstoque()
removerEstoque()
calcularValorEstoque()
toString()
getters e setters
```

A classe foi desenvolvida seguindo os princípios de encapsulamento, mantendo seus atributos privados e disponibilizando acesso através de métodos públicos.

---

## 📂 Estrutura do Projeto

```text
src/
└── br/
    └── com/
        └── giffoni/
            └── pedro/
                └── desafioarraylist/
                    ├── DesafioArrayList.java
                    └── Produto.java
```

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
   ├── Cadastrar Produto
   ├── Adicionar Estoque
   ├── Listar Produtos
   ├── Remover Produto
   ├── Buscar Produto
   ├── Quantidade de Produtos
   ├── Valor Total do Estoque
   └── Sair
        │
        ▼
      Fim
```

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

### Programação Orientada a Objetos

- Classes
- Objetos
- Encapsulamento
- Construtores
- Sobrescrita de métodos
- Getters e Setters

### Coleções

- ArrayList
- Armazenamento de objetos
- Manipulação dinâmica de listas

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
- for
- if / else

### Manipulação de Strings

```java
equalsIgnoreCase()
trim()
isBlank()
```

### Validação de Dados

- hasNextInt()
- hasNextDouble()
- Verificação de duplicidade
- Validação de campos obrigatórios
- Controle de valores negativos

### Métodos Personalizados

```java
adicionarEstoque()
removerEstoque()
calcularValorEstoque()
```

---

## 🎓 Objetivos de Aprendizagem

Este projeto foi desenvolvido para consolidar conhecimentos sobre:

- Programação Orientada a Objetos
- Encapsulamento
- Criação de classes personalizadas
- Utilização de ArrayList com objetos
- Validação de entradas do usuário
- Manipulação de coleções
- Estruturas de controle
- Desenvolvimento de regras de negócio

A evolução do desafio permitiu transformar uma simples lista de compras em um pequeno sistema de gerenciamento de estoque, simulando situações comuns encontradas em aplicações reais.

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

Se este projeto foi útil para você ou ajudou nos estudos de ArrayList, Programação Orientada a Objetos e controle de estoque em Java, considere deixar uma estrela no repositório.
