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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Produto> lista = new ArrayList<>();
        
        int opcao = 0;
        String produto;
        
        while (opcao != 8){
            System.out.println("====== MENU ======");
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Cadastrar novo produto: ");
            System.out.println("2 - Adicionar produto no estoque");
            System.out.println("3 - Listar produtos");
            System.out.println("4 - Remover produto");
            System.out.println("5 - Buscar produto");
            System.out.println("6 - Quantidade de produtos");
            System.out.println("7 - Valor total do estoque");
            System.out.println("8 - Sair");
            if (input.hasNextInt()) {
                opcao = input.nextInt();
                input.nextLine();
            } else {
                System.out.println("Escolha uma opção de 1 a 8.");
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
                
                for (Produto p : lista) {

                    if (p.getNome().equalsIgnoreCase(nome)) {
                        jaExiste = true;
                    break;
                    }
                }
                if (jaExiste) {
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

                    for (Produto p : lista) {
                        if (p.getCodigo().equalsIgnoreCase(codigo)) {
                        codigoExiste = true;
                        break;
                        }
                    }

                    if (codigoExiste) {
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
                
                System.out.println("Quantidade: ");

                if (!input.hasNextInt()) {
                    System.out.println("Quantidade inválida.");
                    input.nextLine();
                    break;
                }

                int quantidadeAdd = input.nextInt();
                input.nextLine();
                
                boolean produtoEncontrado = false;

                for (Produto p : lista) {

                    if (p.getNome().equalsIgnoreCase(produto)) {
                        
                        if (quantidadeAdd <= 0) {
                            System.out.println("Quantidade inválida.");
                            break;
                        }
                        
                        p.adicionarEstoque(quantidadeAdd);

                        System.out.println("Estoque atualizado! Quantidade atual: " + p.getQuantidade());

                        produtoEncontrado = true;

                        break;
                    }
                }
                if (!produtoEncontrado) {
                    System.out.println("Produto não encontrado.");
                }
            break;    
                
            case 3: //LISTAR PRODUTOS
                if (lista.isEmpty()){
                    System.out.println("A lista está vazia ");
                }else{
                    System.out.println("Listando produtos:");
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(lista.get(i));
                }   } 
            break;
            
            case 4: //REMOVER PRODUTOS
                System.out.println("Qual produto deseja remover: ");
                String produtoRemover = input.nextLine().trim();
                if (produtoRemover.isBlank()) {
                    System.out.println("Nome inválido.");
                    break;
                }
                
                boolean produtoRemovido = false;
                
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).getNome().equalsIgnoreCase(produtoRemover)){
                    lista.remove(i);
                    produtoRemovido = true;
                        System.out.println(" Produto removido com sucesso!");
                        break;
                    }
                }if (!produtoRemovido) {
                    System.out.println("Produto não encontrado.");
                }
            break;
            
            case 5: //BUSCAR PRODUTO
                System.out.println("Digite o nome do produto");
                String produtoBuscar = input.nextLine().trim();
                if (produtoBuscar.isBlank()) {
                    System.out.println("Nome inválido.");
                    break;
                }
                
                boolean buscar = false;
                
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).getNome().equalsIgnoreCase(produtoBuscar)){
                    buscar = true;
                        System.out.println(lista.get(i));
                    break;
                    }
                }if (!buscar) {
                    System.out.println("Produto não encontrado.");
                }
            break;
            
            case 6: //QUANTIDADE DE PRODUTOS EM ESTOQUE
                System.out.println("Existem " + lista.size() + " produtos diferentes cadastrados.");
                int totalItens = 0;

                for (Produto p : lista) {
                totalItens += p.getQuantidade();
                }

                System.out.println("A quantidade total de produtos em estoque é " + totalItens + " produtos.");
            break;
            
            case 7:    //VALOR TOTAL DE ESTOQUE
                double valorTotal = 0;

                for (Produto p : lista) {
                valorTotal += p.calcularValorEstoque();
                }
                System.out.println("Valor total do estoque: R$ " + valorTotal);
            break;
            
            case 8:   //SAIR
            break;
            
            default:
                System.out.println("Opção inválida! Escolha uma opção de 1 a 8!");
            break;
            
            } 
            if(opcao == 8){
                System.out.println("Saindo do programa");
            break;
            }
    }   }
}
