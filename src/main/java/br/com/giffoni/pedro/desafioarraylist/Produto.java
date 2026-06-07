/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.giffoni.pedro.desafioarraylist;

/**
 *
 * @author Pedro
 */
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private String codigo;
    private String categoria;
    
    public Produto(String nome, double preco, int quantidade, String codigo, String categoria) {
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
    this.codigo = codigo;
    this.categoria = categoria;
    }
    
    @Override
    public String toString() {
    return "Nome: " + nome
            + " | Preço: R$" + preco
            + " | Estoque: " + quantidade
            + " | Código: " + codigo
            + " | Categoria: " + categoria;
}

    public void adicionarEstoque(int quantidade) {
    this.quantidade += quantidade;
    }
    
    public boolean removerEstoque(int quantidade) {

    if (quantidade > this.quantidade) {
        return false;
    }

    this.quantidade -= quantidade;
    return true;
    }
    
    public double calcularValorEstoque() {
    return preco * quantidade;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
    if(preco > 0){
        this.preco = preco;
    }
    }

    public int getQuantidade() {
        return quantidade;
    }

   public void setQuantidade(int quantidade) {
        if(quantidade >= 0){
        this.quantidade = quantidade;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
    
    
    
}
