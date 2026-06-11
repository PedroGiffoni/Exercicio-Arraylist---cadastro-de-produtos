/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.giffoni.pedro.desafioarraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class DesafioArrayList {
    
    public static Produto buscarProdutoPorNome(ArrayList<Produto> lista, String nome) {
        for (Produto p : lista) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }
    
    public static Produto buscarProdutoPorCodigo(ArrayList<Produto> lista, String codigo) {
    for (Produto p : lista) {
        if (p.getCodigo().equalsIgnoreCase(codigo)) {
            return p;
        }
    }
    return null;
}
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Produto> lista = new ArrayList<>();
        
        int opcao = 10;
        String produto;
        
        while (opcao != 0){
            System.out.println("====== MENU ======");
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Cadastrar novo produto: ");
            System.out.println("2 - Adicionar produto ao estoque");
            System.out.println("3 - Listar produtos");
            System.out.println("4 - Remover cadastro de produto");
            System.out.println("5 - Remover quantidade de produto");
            System.out.println("6 - Buscar produto");
            System.out.println("7 - Quantidade de produtos");
            System.out.println("8 - Valor total do estoque");
            System.out.println("9 - Alterar preço do produto");
            System.out.println("0 - Sair");
            if (input.hasNextInt()) {
                opcao = input.nextInt();
                input.nextLine();
            } else {
                System.out.println("Escolha uma opção de 0 a 9.");
                input.nextLine();
            continue;
            }
        
            switch (opcao){
                case 1: //CADASTRAR NOVO PRODUTO
                    System.out.println("Para cadastrar um novo produto digite o nome do produto: ");
                    String nome = input.nextLine().trim();
                                
                    if (nome.isBlank()) {
                    System.out.println("Nome inválido!");
                    break;
                    }
                                
                    boolean jaExiste = false;
                
                    Produto produtoEncontrado = buscarProdutoPorNome(lista, nome);

                    if (produtoEncontrado != null) {
                        System.out.println("Nao foi possivel cadastrar esse produto. O produto já foi cadastrado anteriormente!");
                    break;
                    }
                
                    System.out.println("Preço: ");
                    if (!input.hasNextDouble()) {
                        System.out.println("Preço inválido. Digite apenas números.");
                        input.nextLine();
                        break;
                    }

                    double preco = input.nextDouble();
                    input.nextLine(); 

                    if (preco <= 0) {
                        System.out.println("Preço inválido.");
                        break;
                    }

                    System.out.println("Quantidade:");

                    if (!input.hasNextInt()) {
                        System.out.println("Quantidade inválida. Digite apenas números inteiros.");
                        input.nextLine();
                        break;
                    }

                    int quantidade = input.nextInt();
                    input.nextLine();

                    if (quantidade < 0) {
                        System.out.println("Quantidade inválida.");
                        break;
                    }
                    
                    System.out.println("Codigo: ");
                    String codigo = input.nextLine().trim();
                    if (codigo.isBlank()) {
                        System.out.println("Código inválido.");
                        break;
                    }
                    boolean codigoExiste = false;

                    Produto produtoCodigoEncontrado = buscarProdutoPorCodigo(lista, codigo);

                    if (produtoCodigoEncontrado != null) {
                        System.out.println("Já existe um produto cadastrado com esse código.");
                        break;
                    }
                    
                    System.out.println("Categoria: ");
                    String categoria = input.nextLine().trim();
                    if (categoria.isBlank()) {
                        System.out.println("Categoria inválida.");
                        break;
                    }

                    Produto novoProduto = new Produto(nome, preco, quantidade, codigo, categoria);

                    lista.add(novoProduto);
                    
                    System.out.println("Produto cadastrado com sucesso!");
                break;
            
                case 2: // ADICIONAR PRODUTO AO ESTOQUE
                    System.out.println("Para adicionar no estoque digite o nome do produto: ");
                    produto = input.nextLine().trim();

                    if (produto.isBlank()) {
                        System.out.println("Nome inválido.");
                        break;
                    }

                    Produto produtoEncontradoEstoque = buscarProdutoPorNome(lista, produto);

                    if (produtoEncontradoEstoque == null) {
                        System.out.println("Produto não encontrado.");
                        break;
                    }

                    System.out.println("Quantidade: ");

                    if (!input.hasNextInt()) {
                        System.out.println("Quantidade inválida.");
                        input.nextLine();
                        break;
                    }

                    int quantidadeAdd = input.nextInt();
                    input.nextLine();

                    if (quantidadeAdd <= 0) {
                        System.out.println("Quantidade inválida.");
                        break;
                    }

                    produtoEncontradoEstoque.adicionarEstoque(quantidadeAdd);

                    System.out.println("Estoque atualizado! Quantidade atual: " + produtoEncontradoEstoque.getQuantidade());

                break;    
                
                case 3: //LISTAR PRODUTOS
                    if (lista.isEmpty()){
                        System.out.println("A lista está vazia ");
                    }else{
                        System.out.println("Listando produtos:");
                        for (Produto p : lista) {
                            System.out.println(p);
                        }  
                    } 
                break;
            
                case 4: //REMOVER CADASTRO DO PRODUTO
                    System.out.println("Qual produto deseja remover: ");
                    String produtoRemover = input.nextLine().trim();
                    if (produtoRemover.isBlank()) {
                        System.out.println("Nome inválido.");
                    break;
                    }
                
                    boolean produtoRemovido = false;
                
                    Produto produtoExcluir = buscarProdutoPorNome(lista, produtoRemover);

                    if (produtoExcluir == null) {
                        System.out.println("Produto não encontrado.");
                        break;
                    }

                    lista.remove(produtoExcluir);
                    System.out.println("Produto removido com sucesso!");
                    
                    if (!produtoRemovido) {
                        System.out.println("Produto não encontrado.");
                    }
                break;
            
                case 5: //REMOVER QUANTIDADE DE PRODUTO
                    System.out.println("Digite o nome do produto ");
                    String produtoSaida = input.nextLine().trim();
                    if (produtoSaida.isBlank()) {
                        System.out.println("Nome inválido.");
                    break;
                    }
                
                    System.out.println("Quantidade a remover: ");
                
                    if (!input.hasNextInt()) {
                        System.out.println("Quantidade inválida.");
                        input.nextLine();
                        break;
                    }
                    int quantidadeRemover = input.nextInt();
                    input.nextLine();
                
                    if (quantidadeRemover <= 0) {
                        System.out.println("Quantidade inválida.");
                        break;
                    }
                
                    boolean encontradoProduto = false;
                
                    for (Produto p : lista) {

                        if (p.getNome().equalsIgnoreCase(produtoSaida)) {

                            encontradoProduto = true;

                            boolean sucesso = p.removerEstoque(quantidadeRemover);

                                if (sucesso) {
                                    System.out.println("Saída registrada! Estoque atual: " + p.getQuantidade());
                                } else {System.out.println("Estoque insuficiente. Estoque atual: " + p.getQuantidade());
                                }               
                        break;
                        }
                    }

                    if (!encontradoProduto) {
                        System.out.println("Produto não encontrado.");
                    }
                break;
            
                case 6: // BUSCAR PRODUTO
                    System.out.println("Digite o nome do produto");
                    String produtoBuscar = input.nextLine().trim();

                    if (produtoBuscar.isBlank()) {
                        System.out.println("Nome inválido.");
                        break;
                    }

                    Produto produtoEncontradoBusca = buscarProdutoPorNome(lista, produtoBuscar);

                    if (produtoEncontradoBusca == null) {
                        System.out.println("Produto não encontrado.");
                    } else {
                        System.out.println(produtoEncontradoBusca);
                    }

                break;
            
                case 7: //QUANTIDADE DE PRODUTOS EM ESTOQUE
                    System.out.println("Existem " + lista.size() + " produtos diferentes cadastrados.");
                    int totalItens = 0;

                    for (Produto p : lista) {
                    totalItens += p.getQuantidade();
                    }

                    System.out.println("A quantidade total de produtos em estoque é " + totalItens + " produtos.");
                break;
            
                case 8:    //VALOR TOTAL DE ESTOQUE
                    double valorTotal = 0;

                    for (Produto p : lista) {
                    valorTotal += p.calcularValorEstoque();
                    }
                    System.out.println("Valor total do estoque: R$ " + valorTotal);
                break;
            
                case 9: // ALTERAR PREÇO DE PRODUTO
                    System.out.println("Digite o nome do produto: ");
                    String nomeProdutoNewPreco = input.nextLine().trim();

                    if (nomeProdutoNewPreco.isBlank()) {
                        System.out.println("Nome inválido.");
                    break;
                    }

                    boolean buscarNewPreco = false;

                    for (Produto p : lista) {

                        if (p.getNome().equalsIgnoreCase(nomeProdutoNewPreco)) {

                            buscarNewPreco = true;

                            System.out.println("Digite o novo preço do produto:");

                            if (!input.hasNextDouble()) {
                                System.out.println("Preço inválido. Digite apenas números.");
                                input.nextLine();
                            break;
                            }

                            double produtoNewPreco = input.nextDouble();
                            input.nextLine();

                            if (produtoNewPreco <= 0) {
                                System.out.println("Preço inválido.");
                            break;
                            }

                            p.setPreco(produtoNewPreco);

                            System.out.println("Preço do produto atualizado com sucesso!");
                            System.out.println(p);
                        break;
                        }
                    }

                    if (!buscarNewPreco) {
                    System.out.println("Produto não encontrado.");
                    }
                break;
            
                case 0:   //SAIR
                break;
            
                default:
                    System.out.println("Opção inválida! Escolha uma opção de 0 a 9!");
                break;
            } 
            if(opcao == 0){
                System.out.println("Saindo do programa");
                break;
            }
    }   }
}
