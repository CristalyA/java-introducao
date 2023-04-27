package com.afropretastech.afropretastech.poo_ex_entrega.ex4;

public class Farmacia {

    String nomeProduto;
    String setor;
    String validade;
    int quantidade;
    double desconto;

    Farmacia(String nomeProduto, String setor,String validade, int quantidade, double desconto){
        this.nomeProduto = nomeProduto;
        this.setor = setor;
        this.validade = validade;
        this.quantidade = quantidade;
        this.desconto = desconto;
    }

    public void visualizar(){
        System.out.println("\nProduto: "+nomeProduto+"\nSetor do produto: "+setor+"\nValidade é: "+validade+"\nQuantidade: "+quantidade+"" +
                "\nDesconto: "+desconto);
    }
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

}
