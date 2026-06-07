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
        ArrayList<String> lista = new ArrayList<>();
        
        int opcao = 0;
        String produto;
        
        while (opcao != 6){
            System.out.println("====== MENU ======");
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Remover produto");
            System.out.println("4 - Buscar produto");
            System.out.println("5 - Quantidade de produtos");
            System.out.println("6 - Sair");
            if (input.hasNextInt()) {
                opcao = input.nextInt();
                input.nextLine();
            } else {
                System.out.println("Escolha uma opção de 1 a 6.");
                input.nextLine();
            continue;
            }
        
            switch (opcao){
            case 1:
                System.out.println("Para adicionar digite o nome do produto: ");
                produto = input.nextLine();
                
                if (produto.isBlank()) {
                System.out.println("Nome inválido!");
                } else {
                    lista.add(produto);
                    System.out.println("Produto adicionado com sucesso!");
}
            break;
                
            case 2:
                if (lista.isEmpty()){
                    System.out.println("A lista está vazia ");
                }else{
                    System.out.println("Listando produtos:");
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println((i + 1) + " - " + lista.get(i));
                }   } 
            break;
            
            case 3: 
                System.out.println("Qual produto deseja remover: ");
                String produtoRemover = input.nextLine();
                boolean encontrado = false;
                
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).equalsIgnoreCase(produtoRemover)){
                    lista.remove(i);
                    encontrado = true;
                        System.out.println(" Produto removido com sucesso!");
                        break;
                    }
                }if (!encontrado) {
                    System.out.println("Produto não encontrado.");
                }
            break;
            
            case 4:
                System.out.println("Digite o nome do produto");
                String produtoBuscar = input.nextLine();
                boolean buscar = false;
                
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).equalsIgnoreCase(produtoBuscar)){
                    buscar = true;
                        System.out.println("Produto disponível!");
                    break;
                    }
                }if (!buscar) {
                    System.out.println("Produto não encontrado.");
                }
            break;
            
            case 5:
                System.out.println("Existem " + lista.size() + " produtos cadastrados.");
            break;
            
            case 6:   
            break;
            
            default:
                System.out.println("Opção inválida! Escolha uma opção de 1 a 6!");
            break;
            
            } 
            if(opcao == 6){
                System.out.println("Saindo do programa");
            break;
            }
    }   }
}
