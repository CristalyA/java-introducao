package com.afropretastech.afropretastech.poo.aula_poo;

public class Produto {

    //atributo
    String nome;
    String marca;
    float valor;


    //construtores
    Produto (String nome){
        this.nome = nome;
    }

    Produto (String nome, String marca){
        this.nome = nome;
        this.marca = marca;
    }

    Produto(String nome, String marca, float valor){
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
    }


}
