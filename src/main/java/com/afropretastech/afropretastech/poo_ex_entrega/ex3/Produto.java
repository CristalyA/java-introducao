package com.afropretastech.afropretastech.poo_ex_entrega.ex3;

public class Produto {

    String nomeJogo;
    String nomeJogador;
    String tipo;
    String arma;

    int ano;

    Produto(String nomeJogo, String nomeJogador,String tipo,String arma, int ano){
        this.nomeJogo = nomeJogo;
        this.nomeJogador = nomeJogador;
        this.tipo = tipo;
        this.arma = arma;
        this.ano = ano;
    }

    public void visualizar (){
        System.out.println("\nNome do Jogo: "+nomeJogo+"\nNome do Jogador: "+nomeJogador+"" +
                "\nTipo de jogo: "+tipo+"\nTipo de arma: "+arma+"\nAno do jogo: "+ano);
    }

    public String getNomeJogo() {
        return nomeJogo;
    }

    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
