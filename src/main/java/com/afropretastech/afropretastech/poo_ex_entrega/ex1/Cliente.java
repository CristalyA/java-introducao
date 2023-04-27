package com.afropretastech.afropretastech.poo_ex_entrega.ex1;

public class Cliente {
    String nome;
    String sobrenome;
    String genero;

    String cpf;
    int idade;


    Cliente (String nome, String sobrenome, String genero, String cpf, int idade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.genero = genero;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void  visualizar(){
        System.out.println("\nNome: "+nome+"\nIdade: "+idade+"\nGenero: "+genero+"\nCPF: "+cpf+"\nIdade: "+idade);
        ;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
