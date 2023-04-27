package com.afropretastech.afropretastech.poo_ex_entrega.ex2;

public class Funcionario {

    String nome;
    String sobrenome;
    String genero;
    String cargo;
    int idade;

    Funcionario (String nome, String sobrenome, String genero, String cargo,int idade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.genero = genero;
        this.cargo = cargo;
        this.idade = idade;
    }

    public void visualizar (){
        System.out.println("\nNome: "+nome+"\nSobrenome: "+sobrenome+"\nGenero: "+genero+"\nCargo : "+cargo+"\nIdade :"+idade);
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
