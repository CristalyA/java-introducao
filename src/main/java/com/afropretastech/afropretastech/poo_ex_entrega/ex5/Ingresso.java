package com.afropretastech.afropretastech.poo_ex_entrega.ex5;

public class Ingresso {

    String nomeFilme;
    String tipo;
    String horario;
    String duracao;
    int quantidade;

    Ingresso(String nomeFilme, String  tipo,String horario, String duracao, int quantidade){
        this.nomeFilme = nomeFilme;
        this.tipo = tipo;
        this.horario = horario;
        this.duracao = duracao;
        this.quantidade = quantidade;
    }

    public void visualizar(){
        System.out.println("\nFilme: "+nomeFilme+"\nTipo: "+tipo+"\nHorario: "+horario+"\nDuração: "+duracao+"" +
                "\nQuantidade de ingressos: "+quantidade);
    }
    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


}
